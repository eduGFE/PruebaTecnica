package com.calculadora.maven.service.impl;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.calculadora.maven.exceptions.InvalidOperatorException;


class OperacioneServiceImplTest {

	@Autowired
	OperacionesServiceImpl operacionesServiceImpl;

	@Test
	public void testOperacion() {
		
		operacionesServiceImpl = new OperacionesServiceImpl();

		// GIVEN
		String operador1 = new String("20.0");
		String operador2 = new String("36.0");
		BigDecimal resultadoSuma = new BigDecimal("56.0");
		BigDecimal resultadoResta = new BigDecimal("-16.0");
		String simboloValidoSuma = "+";
		String simboloValidoResta = "-";
		String operadorNoValido = "a";

		// WHEN
		BigDecimal resultadoRealSuma = operacionesServiceImpl.operacion(operador1, simboloValidoSuma, operador2);
		BigDecimal resultadoRealResta = operacionesServiceImpl.operacion(operador1, simboloValidoResta, operador2);

		// THEN
		assertEquals(resultadoSuma, resultadoRealSuma);
		assertEquals(resultadoRealResta, resultadoResta);
		assertThrows(InvalidOperatorException.class,() -> operacionesServiceImpl.operacion(operador1, operadorNoValido, operador2));
		assertThrows(InvalidOperatorException.class,() -> operacionesServiceImpl.operacion(operadorNoValido, simboloValidoSuma, operador2));

	}

}
