package com.calculadora.maven.exceptions;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class InvalidOperatorExceptionTest {

	@Test
	public void testDefaultContructorShouldWork() {
		InvalidOperatorException ex = new InvalidOperatorException();
		assertNotNull(ex);
	}

	@Test
	public void testMessageContructorShouldWork() {
		InvalidOperatorException ex = new InvalidOperatorException("message");
		assertNotNull(ex);
	}

	@Test
	public void testExceptionContructorShouldWork() {
		Exception originalEx = new Exception("mensaje Business");
		InvalidOperatorException ex = new InvalidOperatorException(originalEx);
		assertNotNull(ex);
	}

	@Test
	public void testExceptionMessageContructorShouldWork() {
		Exception originalEx = new Exception("mensaje Business", new Exception());
		InvalidOperatorException ex = new InvalidOperatorException("message", originalEx);
		assertNotNull(ex);
	}
}
