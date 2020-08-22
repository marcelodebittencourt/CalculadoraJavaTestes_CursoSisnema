package testes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import principal.Calculadora;

class CalculadoraTeste {

	Calculadora calc = new Calculadora();

	@Test
	@DisplayName("Soma de números positivos")
	void testSomaNumerosPositivos_ResultadoPositivo() {
		assertEquals(5, calc.soma(3, 2));
	}

	@Test
	void testSomaNumerosNegativos_ResultadoNegativo() {
		assertEquals(-3, calc.soma(-1, -2));
	}

	@Test
	void testSubstracao_NumerosPositivos_ResultadoPositivo() {
		assertEquals(4, calc.substracao(9, 5));
	}

	@Test
	void testSubstracao_NumerosNegativos_ResultadoNegativo() {
		assertEquals(-1, calc.substracao(-3, -2));
	}
	
	@Test
	void testMultiplicacaoNumerosPositivos_ResultadoPositivo() {
		assertEquals(15, calc.multiplicacao(5, 3));
	}
	
	@Test
	void testDivisaoNumerosPositivos_ResultadoPositivo() {
		assertEquals(2, calc.divisao(8, 4));
	}		
	
}
