package com.rabbitmq.spring;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class FooMessageConsumer implements MessageListener {

	@Override
	public void onMessage(Message msg) {
		System.out.println("fmc receive: " + msg);
	}

}
