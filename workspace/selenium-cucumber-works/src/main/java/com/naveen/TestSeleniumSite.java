package com.naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumSite {
	public static void main(String[] args) {
		
		// load the driver for the browser 
		System.setProperty("webdriver.chrome.driver",
					"/Volumes/Kanchan/MyTrainings/sapient/freshers-aem-oct-2021/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// open the browser 
		String url ="https://www.selenium.dev/";
		driver.get(url);
		
		// process the work which you want 
		String title = driver.getTitle();
		System.out.println("Title of Site -> " + title);
		
		// close the browser
		driver.close(); 
	}
}
