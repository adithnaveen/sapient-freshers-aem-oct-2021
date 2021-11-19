package com.naveen.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.naveen.business.SomeBusinessLogic;

public class SomeBusinessLogicTest {

	@Test
	public void testaddTwoNumbers() {
		int num1 = 10; 
		int num2 = 20; 
		int result = new SomeBusinessLogic().addNumbers(num1, num2);
		assertEquals(30, result);
	}

	@Test
	public void testaddTwoNumbersWithZero() {
		int num1 = 0; 
		int num2 = 20; 
		int result = new SomeBusinessLogic().addNumbers(num1, num2);
		assertEquals(0, result);
	}

}
