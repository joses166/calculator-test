package com.wit.software.api.utils;

import org.apache.commons.lang3.SerializationUtils;
import org.springframework.amqp.core.Message;

import com.wit.software.api.model.DataOperation;

public class Utils {

	public static Message convertByteToMessage(DataOperation data) {
		byte[] byteData = SerializationUtils.serialize(data);
    	return new Message(byteData);
	}
	
}
