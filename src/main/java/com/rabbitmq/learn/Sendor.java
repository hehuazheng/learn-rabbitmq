package com.rabbitmq.learn;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class Sendor {
	private final static String QUEUE_NAME = "hello";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory fac = new ConnectionFactory();
		fac.setHost("10.185.240.142");
		Connection conn = fac.newConnection();
		Channel channel = conn.createChannel();
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		String msg = "who's say hello1";
		channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
		System.out.println("sent " + msg);
		channel.close();
		conn.close();
	}
}
