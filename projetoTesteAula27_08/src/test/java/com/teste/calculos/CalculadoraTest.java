package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSum() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "5 + 5 não gerou o valor 10");}
	
	@Test
	@DisplayName("Teste 20 - 5 = 15")
	void testSub() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 20D;
		double valor2 = 5D;
		double esperado = 15D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "20  - 5 não gerou o valor 15");

}
	@Test
	@DisplayName("Teste 20 * 5 = 100")
	void testMult() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 20D;
		double valor2 = 5D;
		double esperado = 100D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "20 * 5 não gerou o valor 100");

}
	@Test
	@DisplayName("Teste 20 / 5 = 4")
	void testSDiv() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 20D;
		double valor2 = 5D;
		double esperado = 4D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "20 / 5 não gerou o valor 4");

}
	}
