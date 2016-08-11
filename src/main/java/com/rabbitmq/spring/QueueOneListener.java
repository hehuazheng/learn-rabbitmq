package com.rabbitmq.spring;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class QueueOneListener implements MessageListener {
	@Override
	public void onMessage(Message msg) {
		System.out.println("queue one: " + msg);
	}
}
