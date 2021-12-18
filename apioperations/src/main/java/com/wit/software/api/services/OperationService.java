package com.wit.software.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.software.api.dto.OperationDTO;
import com.wit.software.api.enums.OperationEnum;
import com.wit.software.api.model.DataOperation;
import com.wit.software.api.rabbitmq.ConfigurationSender;
import com.wit.software.api.utils.Utils;

@Service
public class OperationService {
    
	@Autowired
	private ConfigurationSender sender;
	
    public OperationDTO operation(OperationEnum op, Float[] vetor) {
    	DataOperation data = DataOperation.builder().operationName(op.name()).a(vetor[0]).b(vetor[1]).build();
    	Object receivedResult = sender.sendAndReturn(Utils.convertByteToMessage(data));
    	return OperationDTO.builder().result(receivedResult).build();
    }
    
}
