package com.wit.software.api.services;

public class Sum implements Operation {

	@Override
	public Float calculator(Float a, Float b) {
		return a + b;
	}

}
