package com.javastar920905.statepattern.rabbit.producer;

import com.javastar920905.statepattern.rabbit.util.QueueUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;

import static com.javastar920905.statepattern.rabbit.util.QueueUtil.QUEUE_NAME;
import static com.javastar920905.statepattern.rabbit.util.QueueUtil.WORK_QUEUE_NAME;

/**
 * Created by ouzhx on 2017/3/27. 工作队列
 */
public class TaskProducer {
  public static void main(String[] args) throws Exception {
    Connection connection = QueueUtil.getConnection();
    Channel channel = connection.createChannel();
    boolean durable = true; // 设置消息持久化 RabbitMQ不允许使用不同的参数重新定义一个队列，所以已经存在的队列，我们无法修改其属性。
    // 声明工作队列
    channel.queueDeclare(WORK_QUEUE_NAME, durable, false, false, null);

    // 发送10条消息，依次在消息后面附加1-10个点
    for (int i = 5; i > 0; i--) {
      String dots = "";
      for (int j = 0; j <= i; j++) {
        dots += ".";
      }
      String message = "helloworld" + dots + dots.length();
      // MessageProperties.PERSISTENT_TEXT_PLAIN 标识我们的信息为持久化的
      channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN,
          message.getBytes());
      System.out.println("Sent Message：'" + message + "'");
    }
    // 关闭频道和资源
    channel.close();
    connection.close();
  }
}
