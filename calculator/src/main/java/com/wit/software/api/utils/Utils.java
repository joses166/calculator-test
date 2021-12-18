package com.wit.software.api.utils;

import org.apache.commons.lang3.SerializationUtils;
import org.springframework.amqp.core.Message;

import com.wit.software.api.model.DataOperation;

public class Utils {

	public static DataOperation convertMessageToDataOperation(Message message) {
		DataOperation data = SerializationUtils.deserialize(message.getBody());
		return data;
	}
	
}