package com.calculadora.maven.util;

public class UtilClass {
	public static boolean isNumeric(String operador1, String operador2) {
		try {
			Double.parseDouble(operador1);
			Double.parseDouble(operador2);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}


}
