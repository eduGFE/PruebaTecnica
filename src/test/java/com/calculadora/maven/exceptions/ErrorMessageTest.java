package com.calculadora.maven.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class ErrorMessageTest {
	
	@Test
	public void testErrorMessage() {
		
		Date fecha = new Date();
		
		 ErrorMessage errorMessage = new ErrorMessage(200,fecha,"El operador no es validos","description");
		 
		 assertEquals(200, errorMessage.getStatusCode());
		 assertEquals(fecha, errorMessage.getTimestamp());
		 assertEquals("El operador no es validos", errorMessage.getMessage());
		 assertEquals("description", errorMessage.getDescription());
		
		
		
	}

}
