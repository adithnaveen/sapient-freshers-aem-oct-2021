package com.naveen;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger; 


/**
 * 
 * @author naveenkumar
 * @see to show working of loggers 
 */
public class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		System.out.println("hello i'm in maven project...");
		
		logger.info("hi i'm from info");
		logger.debug("hi i'm  debug");
		logger.error("hi i'm from error");
		
		String name = "Sapient"; 
		logger.debug("some values {}", name);
	}
}
