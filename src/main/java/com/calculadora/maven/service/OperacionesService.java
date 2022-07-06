package com.calculadora.maven.service;

import java.math.BigDecimal;

public interface OperacionesService {
	
	BigDecimal suma(String operador1,String operador2);
	
	BigDecimal resta(String operador1, String operador2);

}