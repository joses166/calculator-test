package com.wit.software.api.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class OperationsTest {

	private Operation operation;
	
	@Test
	@DisplayName("Método para validar a operação de soma.")
	public void testingSumOperation() {
		// Cenário
		this.operation = new Sum();
		Float a = 5.0f, b = 10.0f;
		// Execução
		Float result = this.operation.calculator(a, b);
		// Verificações
		assertThat(result).isEqualTo(a + b);		
	}
	
	@Test
	@DisplayName("Método para validar a operação de subtração.")
	public void testingSubtractionOperation() {
		// Cenário
		this.operation = new Subtraction();
		Float a = 5.0f, b = 10.0f;
		// Execução
		Float result = this.operation.calculator(a, b);
		// Verificações
		assertThat(result).isEqualTo(a - b);		
	}
	
	@Test
	@DisplayName("Método para validar a operação de multiplicação.")
	public void testingMultiplicationOperation() {
		// Cenário
		this.operation = new Multiplication();
		Float a = 5.0f, b = 10.0f;
		// Execução
		Float result = this.operation.calculator(a, b);
		// Verificações
		assertThat(result).isEqualTo(a * b);		
	}
	
	@Test
	@DisplayName("Método para validar a operação de divisão.")
	public void testingDivisionOperation() {
		// Cenário
		this.operation = new Division();
		Float a = 5.0f, b = 10.0f;
		// Execução
		Float result = this.operation.calculator(a, b);
		// Verificações
		assertThat(result).isEqualTo(a / b);		
	}
	
}
