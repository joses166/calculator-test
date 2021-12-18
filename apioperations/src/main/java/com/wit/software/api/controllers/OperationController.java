package com.wit.software.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wit.software.api.dto.OperationDTO;
import com.wit.software.api.enums.OperationEnum;
import com.wit.software.api.services.OperationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Operação de calculadora")
@RestController
@RequestMapping
public class OperationController {

	@Autowired
	private OperationService service;

	@ApiOperation("Operação de soma")
	@GetMapping("/sum")
	public OperationDTO sum(@RequestParam("a") Float a, @RequestParam("b") Float b) {
		Float [] vetor = {a, b};
		return this.service.operation(OperationEnum.SUM, vetor);
	}
	
	@ApiOperation("Operação de subtração")
	@GetMapping("/subtraction")
	public OperationDTO subtraction(@RequestParam("a") Float a, @RequestParam("b") Float b) {
		Float [] vetor = {a, b};
		return this.service.operation(OperationEnum.SUBTRACTION, vetor);
	}
	
	@ApiOperation("Operação de multiplicação")
	@GetMapping("/multiplication")
	public OperationDTO multiplication(@RequestParam("a") Float a, @RequestParam("b") Float b) {
		Float [] vetor = {a, b};
		return this.service.operation(OperationEnum.MULTIPLICATION, vetor);
	}
	
	@ApiOperation("Operação de divisão")
	@GetMapping("/division")
	public OperationDTO division(@RequestParam("a") Float a, @RequestParam("b") Float b) {
		Float [] vetor = {a, b};
		return this.service.operation(OperationEnum.DIVISION, vetor);
	}
	
}
