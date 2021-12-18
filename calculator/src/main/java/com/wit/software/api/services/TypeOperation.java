package com.wit.software.api.services;

import org.springframework.stereotype.Service;

import com.wit.software.api.model.DataOperation;

@Service
public class TypeOperation {
	
	public Float typeOperation(DataOperation data) {
		if ( data.getOperationName().trim().equals("SUM") ) return this.calculate(data, new Sum());
		else if ( data.getOperationName().trim().equals("SUBTRACTION") ) return this.calculate(data, new Subtraction());
		else if ( data.getOperationName().trim().equals("MULTIPLICATION") ) return this.calculate(data, new Multiplication());
		else if ( data.getOperationName().trim().equals("DIVISION") ) return this.calculate(data, new Division());
		return null;
	}
	
	private Float calculate(DataOperation data, Operation operation) {
		return operation.calculator(data.getA(), data.getB());
	}
	
}
