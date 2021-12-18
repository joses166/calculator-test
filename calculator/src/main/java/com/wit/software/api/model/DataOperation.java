package com.wit.software.api.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataOperation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String operationName;
	private Float a;
	private Float b;

}