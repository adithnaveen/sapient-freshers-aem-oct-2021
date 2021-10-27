package com.sapient.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

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
}
