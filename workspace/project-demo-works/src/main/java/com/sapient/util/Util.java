package com.sapient.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * 
 * @author naveenkumar
 * @see get properties from external resource 
 */
public class Util {
	public static String getStorageFileName() {
		Properties prop = new Properties(); 
		try {
			prop.load(new FileReader("company.properties"));
			
			System.out.println("Company Name " + 
			prop.get("companyName") ); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null; 
	}
	
	
	public static void main(String[] args) {
		getStorageFileName();
	}
	
	
	public static boolean emailPatternMathcing(String emailAddress, String regexPattern) {
	    return Pattern.compile(regexPattern)
	      .matcher(emailAddress)
	      .matches();
	}
}
