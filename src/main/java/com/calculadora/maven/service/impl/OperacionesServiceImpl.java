package com.calculadora.maven.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.calculadora.maven.exceptions.InvalidOperatorException;
import com.calculadora.maven.service.OperacionesService;
import com.calculadora.maven.util.UtilClass;

@Service
public class OperacionesServiceImpl implements OperacionesService {

	TracerImpl tracerAPI = new TracerImpl();

	@Override
	public BigDecimal suma(String operador1, String operador2) {

		if (!UtilClass.isNumeric(operador1, operador2)) {
			
			throw new InvalidOperatorException("Operadores no validos");
			
		}
		
		BigDecimal ope1 = BigDecimal.valueOf(Double.valueOf(operador1));

		BigDecimal ope2 = BigDecimal.valueOf(Double.valueOf(operador2));

		BigDecimal resultSum = (ope1).add(ope2);

		tracerAPI.trace(resultSum);

		return resultSum;

	}

	@Override
	public BigDecimal resta(String operador1, String operador2) {
		
		if (!UtilClass.isNumeric(operador1, operador2)) {
			
			throw new InvalidOperatorException("Operadores no validos");
			
		}
		
		BigDecimal ope1 = BigDecimal.valueOf(Double.valueOf(operador1));

		BigDecimal ope2 = BigDecimal.valueOf(Double.valueOf(operador2));

		BigDecimal resultRes = (ope1).subtract(ope2);
		
		tracerAPI.trace(resultRes);

		return resultRes;
	}

}
