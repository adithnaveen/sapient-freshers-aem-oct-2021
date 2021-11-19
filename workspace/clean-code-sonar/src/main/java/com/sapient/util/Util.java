package com.sapient.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
	public static String getSqlQuery(String key) {
		Properties prop = new Properties();
		try (FileInputStream fileInputStream = new FileInputStream("db.properties");) {

			prop.load(fileInputStream);
			return prop.get(key).toString();
			
		}   catch (IOException e) {
			e.printStackTrace();
		}
		return null; 
	}
}
