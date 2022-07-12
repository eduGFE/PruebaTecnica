package com.calculadora.maven.service;

import java.math.BigDecimal;

public interface OperacionesService {
	
	BigDecimal operacion(String operador1,String operando,String operador2);
	

}