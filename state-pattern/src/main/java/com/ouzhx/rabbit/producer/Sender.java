package com.ouzhx.rabbit.producer;

import static com.ouzhx.rabbit.util.QueueUtil.QUEUE_NAME;

import com.ouzhx.rabbit.util.QueueUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * Created by ouzhx on 2017/3/24.
 */
public class Sender {

  public static void main(String[] args) throws Exception {
    // 创建一个连接
    Connection connection = QueueUtil.getConnection();
    // 创建一个频道
    Channel channel = connection.createChannel();
    // 指定一个队列
    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
    // 发送的消息
    String message = "hello world!";
    // 往队列中发出一条消息
    channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
    System.out.println("Sent Message：'" + message + "'");
    // 关闭频道和连接
    channel.close();
    connection.close();
  }
}
