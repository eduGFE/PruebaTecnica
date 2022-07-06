package com.calculadora.maven.service.impl;

import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class OperacioneServiceImplTest {
	
	@Autowired
	OperacionesServiceImpl operacionesServiceImpl;
	
	@Test
	public void operationsShouldReturnExpectedValueWhenOperandsAreValid() throws Exception {
		
		 operacionesServiceImpl = new OperacionesServiceImpl();
		
		//GIVEN
		BigDecimal resultadoResta =  new BigDecimal(16.0) ;
		BigDecimal resultadoSuma =  new BigDecimal(56.0) ;
		BigDecimal operador1 =  new BigDecimal(20.0) ;
		BigDecimal operador2 =  new BigDecimal(36.0) ;
		
		//WHEN
		BigDecimal resultadoRealSuma = operacionesServiceImpl.suma(operador1, operador2);
		BigDecimal resultadoRealResta = operacionesServiceImpl.resta(operador2,operador1);
		
		//THEN
		assertThat(resultadoSuma,  Matchers.comparesEqualTo(resultadoRealSuma));
		assertThat(resultadoResta,  Matchers.comparesEqualTo(resultadoRealResta));
	
	}
	
//	@Test
//	public void testResta() throws Exception {
//		
//		 operacionesServiceImpl = new OperacionesServiceImpl();
//		
//		//GIVEN
//		BigDecimal resultadoEsperado =  new BigDecimal(16.0);
//		BigDecimal operador2 =  new BigDecimal(36.0) ;
//		BigDecimal operador1 =  new BigDecimal(20.0) ;
//		
//		//WHEN
//		BigDecimal resultadoReal = operacionesServiceImpl.resta(operador1, operador2);
//
//		//THEN
//		assertThat(resultadoReal,  Matchers.comparesEqualTo(resultadoEsperado));
//	
//	}

}
