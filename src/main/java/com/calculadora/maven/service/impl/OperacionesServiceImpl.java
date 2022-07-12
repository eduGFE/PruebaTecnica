package com.calculadora.maven.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.calculadora.maven.exceptions.InvalidOperatorException;
import com.calculadora.maven.service.OperacionesService;
import com.calculadora.maven.util.UtilClass;

import io.corp.calculator.TracerImpl;



@Service
public class OperacionesServiceImpl implements OperacionesService{

	private TracerImpl tracer = new TracerImpl();

	@Override
	public BigDecimal operacion(String operador1, String operando, String operador2) {
		if (!UtilClass.isNumeric(operador1, operador2)) {
			throw new InvalidOperatorException("Los numero no son validos");
		}
		BigDecimal ope1 = BigDecimal.valueOf(Double.valueOf(operador1));
		BigDecimal ope2 = BigDecimal.valueOf(Double.valueOf(operador2));
		BigDecimal result = switch (operando) {
		case "+" -> (ope1).add(ope2);
		case "-" -> (ope1).subtract(ope2);
		default -> throw new InvalidOperatorException("El operador no es validos");
		};
		tracer.trace(result);
		return result;
	}

}
