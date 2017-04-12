package com.ouzhx.rabbit.consumer;

import static com.ouzhx.rabbit.util.QueueUtil.QUEUE_NAME;

import com.ouzhx.rabbit.util.QueueUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;

/**
 * Created by ouzhx on 2017/3/24.
 */
public class receiver {
  public static void main(String[] args) throws Exception {
    Connection connection = QueueUtil.getConnection();
    // 创建一个频道
    Channel channel = connection.createChannel();
    // 声明队列，主要为了防止消息接收者先运行此程序，队列还不存在时创建队列。
    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
    // 创建队列消费者
    QueueingConsumer consumer = new QueueingConsumer(channel);
    // 指定消费队列
    channel.basicConsume(QUEUE_NAME, true, consumer);
    while (true) {
      // nextDelivery是一个阻塞方法（内部实现其实是阻塞队列的take方法）
      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
      String message = new String(delivery.getBody());
      System.out.println("Received Message：'" + message + "'");
    }
  }
}
