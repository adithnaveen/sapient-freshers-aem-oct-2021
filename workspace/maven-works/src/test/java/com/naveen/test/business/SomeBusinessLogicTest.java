package com.naveen.test.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.naveen.testing.SomeBusinessLogic;

class SomeBusinessLogicTest {
	private SomeBusinessLogic sbl; 
	
	@BeforeEach
	void setUp() {
		System.out.println("i'm in BeforeEach");
		 sbl = new SomeBusinessLogic(); 
	}
	
	@Test
	void insertTest() {
		String name = "Lokesh"; 
		String retVal = sbl.insert(name);
		assertEquals("Inserted "+ name, retVal);
	}

	@Test
	void insertTestWithException() {
		String name = "Shiva"; 
		assertThrows(RuntimeException.class, () -> {
			sbl.insertException(name); 
		}); 
	}
}
