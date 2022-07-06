package com.calculadora.maven.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.calculadora.maven.service.OperacionesService;

@Service
public class OperacionesServiceImpl implements OperacionesService  {


	@Override
	public BigDecimal suma(BigDecimal operador1, BigDecimal operador2) {

		BigDecimal resultSum = (operador1).add(operador2);

		return resultSum;
	}

	@Override
	public BigDecimal resta(BigDecimal operador1, BigDecimal operador2) {
		
		BigDecimal resultRes = (operador1).subtract(operador2);
		
		return resultRes;
	}
	


}
