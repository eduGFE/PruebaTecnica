package com.calculadora.maven.exceptions;

public class InvalidOperatorException extends RuntimeException {
	  private static final long serialVersionUID = 1L;
	  public InvalidOperatorException(String msg) {
	    super(msg);
	  }
	}