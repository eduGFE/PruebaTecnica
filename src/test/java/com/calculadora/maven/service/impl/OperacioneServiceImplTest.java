package com.calculadora.maven.service.impl;

import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.calculadora.maven.util.UtilClass;

class OperacioneServiceImplTest {
	
	@Autowired
	OperacionesServiceImpl operacionesServiceImpl;
	
	@Test
	public void testSuma() throws Exception {
		
		 operacionesServiceImpl = new OperacionesServiceImpl();
		
		//GIVEN
		String stringOperador1 =  new String("20.0") ;
		String stringOperador2 =  new String("36.0") ;
		BigDecimal resultadoSuma =  new BigDecimal(56.0) ;
		
		//WHEN
		BigDecimal resultadoRealSuma = operacionesServiceImpl.suma(stringOperador1,stringOperador2);
		
		//THEN
		assertThat(resultadoSuma,  Matchers.comparesEqualTo(resultadoRealSuma));
	
	}
	
	@Test
	public void testResta() {
		
		 operacionesServiceImpl = new OperacionesServiceImpl();
		
		//GIVEN
		String stringOperador1 =  new String("20.0") ;
		String stringOperador2 =  new String("36.0") ;
		BigDecimal resultadoSuma =  new BigDecimal(16.0) ;
		
		//WHEN
		BigDecimal resultadoRealSuma = operacionesServiceImpl.resta(stringOperador2,stringOperador1);
		
		//THEN
		assertThat(resultadoSuma,  Matchers.comparesEqualTo(resultadoRealSuma));
	
	}
	
	
	

}
