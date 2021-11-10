package com.naveen.test.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
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
	@AfterEach
	void tearDown() {
		System.out.println(" in tear down");
	}
	
	
	@BeforeAll
	static void setUpBeforeClass() {
		System.out.println("once per class setUpBeforeClass()" );
	}
	
	@AfterAll
	static void tearDownAfterClass() {
		System.out.println("once per class - tearDownAfterClass()");
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
