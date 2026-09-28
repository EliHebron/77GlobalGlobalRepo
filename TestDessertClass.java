package org.ssglobal.training.codes;

import org.junit.jupiter.api.Test;

public class TestDessertClass {
	
	@Test
	// Cake Test
	public void testCake() {
		Cake cake = new Cake();
		
		cake.inputCakeDetails("Cake", 2500.00, 235, true, "wedding");
		cake.showDessert();
		
		
	}
}
