package com.ouzhx.rabbit.util;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * Created by ouzhx on 2017/3/24.
 */
public class QueueUtil {
  // 队列名
  public static final String HOST = "60.205.228.78";
  public static final String USERNAME = "guest";
  public static final String PASSWD = "guest";
  public static final String QUEUE_NAME = "hello";
  public static final String WORK_QUEUE_NAME = "work-queue";

  //获取连接对象
  public static Connection getConnection() {
    /**
     * 创建连接连接到MabbitMQ
     */
    ConnectionFactory factory = new ConnectionFactory();
    // 设置MabbitMQ所在主机ip或者主机名
    factory.setHost("60.205.228.78");
    // 指定用户 密码
    factory.setUsername("guest");
    factory.setPassword("guest");
    // 指定端口
    factory.setPort(AMQP.PROTOCOL.PORT);
    try {
      // 创建一个连接
      Connection connection = factory.newConnection();
      return connection;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }

  }
}
