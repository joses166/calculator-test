package com.wit.software.api.rabbitmq;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationSender {

	public static final String directExchangeName = "rpc-exchange";
    public static final String routingKey = "rpc";

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private DirectExchange exchange;
    
    @Bean
    DirectExchange exchange() {
        return new DirectExchange(directExchangeName);
    }
	
    public Object sendAndReturn(Message message) { 
    	return template.convertSendAndReceive(exchange.getName(), routingKey, message);
    }
    
}
