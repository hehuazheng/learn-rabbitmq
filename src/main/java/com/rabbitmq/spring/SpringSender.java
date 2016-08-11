package com.rabbitmq.spring;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSender {
	public static void main(String[] args) throws InterruptedException {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
		template.convertAndSend("i'm zzz2");
		Thread.sleep(1000L);
		ctx.destroy();
		ctx.close();
	}
}
