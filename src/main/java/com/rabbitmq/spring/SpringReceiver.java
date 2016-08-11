package com.rabbitmq.spring;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringReceiver {
	public static void main(String[] args) throws InterruptedException {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"rabbitmq.xml");
		RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
		template.convertAndSend("queue_one", "i'm hzz");
		Thread.sleep(1000L);
		ctx.destroy();
		ctx.close();
	}
}
