package org.ssglobal.training.codes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.HelloWorld;

public class TestHelloWorld {
	
	private HelloWorld hw;
	
	@BeforeEach
	public void setUp() {
		hw = new HelloWorld();
	}
	
	@AfterEach
	public void tearDown() {
		hw = null;
	}

	@Test
	public void testGreet() {
		// Arrange
		String message = "Happy Friday!";
		// Act
		String res = hw.greet();
		// Assert
		assertEquals(message, res);
		
	}
}
