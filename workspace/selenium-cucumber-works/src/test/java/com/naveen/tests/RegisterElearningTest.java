package com.naveen.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.naveen.generic.RegistrationPage;
import com.naveen.utils.DriverFactory;
import static com.naveen.utils.Utility.*;

public class RegisterElearningTest {
 
	private String url; 
	private WebDriver driver; 
	private RegistrationPage regPage; 
	
	@Before
	public void setUp() {
		url = "http://elearningm1.upskills.in/"; 
		driver = DriverFactory.getDriver("chrome");
		regPage = new RegistrationPage(driver); 
	}
	
	@Test
	public void registrationValidTest() {
		driver.get(url);
		
		String signUpLinkXpath="//*[@id=\"login-block\"]/div/ul/li[1]/a";
		driver.findElement(By.xpath(signUpLinkXpath)).click(); 
		
		sleepSeconds(3);
		
		regPage.sendFirstName();
		sleepSeconds(1);

		regPage.sendLastName();
		sleepSeconds(1);
		
		regPage.sendEmail(); 
		sleepSeconds(1);
		
		regPage.sendUserName();
		sleepSeconds(1);
		
		regPage.sendPassword();
		sleepSeconds(1);
		
		regPage.sendConfirmPassword();
		sleepSeconds(1);
		
		regPage.sendPhoneNumber(); 
		sleepSeconds(1);
		
		regPage.selectLanguage(); 
		sleepSeconds(3);
		
		driver.close(); 
	}

}
