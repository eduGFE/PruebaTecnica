package com.calculadora.maven.exceptions;

public class InvalidOperatorException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidOperatorException() {
		super();
	}

	public InvalidOperatorException(String msg) {
		super(msg);
	}

	public InvalidOperatorException(Exception newOriginalException) {
		super(newOriginalException);
	}

	public InvalidOperatorException(String msg, Exception newOriginalException) {
		super(msg, newOriginalException);
	}
}