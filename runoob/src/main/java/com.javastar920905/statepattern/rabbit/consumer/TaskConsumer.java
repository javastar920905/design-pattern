package com.javastar920905.statepattern.rabbit.consumer;

import static com.javastar920905.statepattern.rabbit.util.QueueUtil.WORK_QUEUE_NAME;

import com.javastar920905.statepattern.rabbit.util.QueueUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;

/**
 * Created by ouzhx on 2017/3/27. 工作队列消费者
 * 要了解RabbitMQ的路由机制，exchange是一个关键。exchange可以叫做交换机，也似乎可以叫做路由器，反正它是用来选择路由的。
 * 。RabbitMQ的核心思想就是消息的发布者不是直接把消息发送到目标队列中的，事实上，通常它并不知道消息要发到哪个队列中，它只知道把消息队列发送到exchange中。
 * exchange一边接收发送者发过来的消息，而另一边则把消息发送到目标队列中去。 exchange一定知道哪些队列需要接收这个消息，是加到一个队列里还是加到好几个队列里，还是直接扔掉。
 */
public class TaskConsumer {

  public static void main(String[] args) throws Exception {
    // 区分不同工作进程的输出
    int hashCode = TaskConsumer.class.hashCode();
    Connection connection = QueueUtil.getConnection();
    Channel channel = connection.createChannel();
    boolean durable = true; // 设置消息持久化 RabbitMQ不允许使用不同的参数重新定义一个队列，所以已经存在的队列，我们无法修改其属性。
    // 声明队列
    channel.queueDeclare(WORK_QUEUE_NAME, durable, false, false, null);

    QueueingConsumer consumer = new QueueingConsumer(channel);

    /**
     * ack= true: Round-robin 转发 消费者被杀死，消息会丢失 ack=false:消息应答 ，为了保证消息永远不会丢失，RabbitMQ支持消息应答（message
     * acknowledgments）。 消费者发送应答给RabbitMQ，告诉它信息已经被接收和处理，然后RabbitMQ可以自由的进行信息删除。
     * 如果消费者被杀死而没有发送应答，RabbitMQ会认为该信息没有被完全的处理，然后将会重新转发给别的消费者。 通过这种方式，你可以确认信息不会被丢失，即使消者偶尔被杀死。
     * 消费者需要耗费特别特别长的时间是允许的。
     *
     */

    boolean ack = false; // 打开应答机制
    // 指定消费队列
    channel.basicConsume(WORK_QUEUE_NAME, ack, consumer);


    // 公平转发 设置最大服务转发消息数量 只有在消费者空闲的时候会发送下一条信息。
    int prefetchCount = 1;
    channel.basicQos(prefetchCount);

    while (true) {
      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
      String message = new String(delivery.getBody());

      System.out.println(hashCode + " Received Message：'" + message + "'");
      doWork(message);
      System.out.println(hashCode + " Received Done");
      // 发送应答
      channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);

    }
  }

  /**
   * 每个点耗时1s
   * 
   * @param task
   * @throws InterruptedException
   */
  private static void doWork(String task) throws InterruptedException {
    for (char ch : task.toCharArray()) {
      if (ch == '.')
        Thread.sleep(1000);
    }
  }

}
