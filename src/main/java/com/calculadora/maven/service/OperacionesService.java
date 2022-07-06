package com.calculadora.maven.service;

import java.math.BigDecimal;

public interface OperacionesService {
	
	BigDecimal suma(BigDecimal a,BigDecimal b);
	
	BigDecimal resta(BigDecimal a,BigDecimal b);

}