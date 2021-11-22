package com.naveen.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static  WebDriver getDriver(String driverName) {
		WebDriver driver = null; 
		if(driverName.equalsIgnoreCase("chrome")) {
			System.setProperty(Drivers.CHROME_KEY, Drivers.CHROME_PATH); 
			
			driver = new ChromeDriver(); 

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		return driver; 
	}
}
