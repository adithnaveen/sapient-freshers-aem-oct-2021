package com.naveen.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.naveen.utils.DriverFactory;
import static com.naveen.utils.Utility.*;

public class RegisterElearningTest {
 
	private String url; 
	private WebDriver driver; 
	
	@Before
	public void setUp() {
		url = "http://elearningm1.upskills.in/"; 
		driver = DriverFactory.getDriver("chrome"); 
	}
	
	@Test
	public void registrationValidTest() {
		driver.get(url);
		
		String signUpLinkXpath="//*[@id=\"login-block\"]/div/ul/li[1]/a";
		driver.findElement(By.xpath(signUpLinkXpath)).click(); 
		
		
		sleepSeconds(3);
		
		driver.close(); 
	}

}
