package com.wit.software.api.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;
import com.wit.software.api.rabbitmq.ConfigurationReceiver;
import com.wit.software.api.services.TypeOperation;
import com.wit.software.api.utils.Utils;

@Component
public class ConsumerQueue {

	@Autowired
	private TypeOperation operation;

	@RabbitListener(queues = ConfigurationReceiver.queueName)
	public Float receive(Message message, Channel channel) {
		Float result = this.operation.typeOperation(Utils.convertMessageToDataOperation(message));
		return result;
	}

}