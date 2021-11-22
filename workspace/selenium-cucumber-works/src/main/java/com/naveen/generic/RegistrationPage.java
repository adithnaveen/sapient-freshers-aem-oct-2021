package com.naveen.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	private WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendFirstName() {
		clearField("registration_firstname");
		driver.findElement(By.id("registration_firstname")).sendKeys("Naveen");
	}

	public void sendLastName() {
		clearField("registration_lastname");
		driver.findElement(By.id("registration_lastname")).sendKeys("Kumar");
	}

	public void sendEmail() {
		
		clearField("registration_email");
		driver.findElement(By.id("registration_email")).sendKeys("Kumar");
	}

	public void sendUserName() {
		
		clearField("username");
		driver.findElement(By.id("username")).sendKeys("adithnaveen");
	}

	public void sendPassword() {
		
		clearField("pass1");
		driver.findElement(By.id("pass1")).sendKeys("secret@123");
	}

	public void sendConfirmPassword() {
		
		clearField("pass2");
		driver.findElement(By.id("pass2")).sendKeys("secret@123");
	}

	public void sendPhoneNumber() {
		
		clearField("registration_phone");
		driver.findElement(By.id("registration_phone")).sendKeys("7894561230");
	}

	public void selectLanguage() {
		WebElement language = driver.findElement(By.id("registration_language")); 
		Select languageSelect = new Select(language); 
		languageSelect.selectByValue("german"); 
		
	}

	private void clearField(String fieldName) {
		driver.findElement(By.id(fieldName)).clear();
	}

}
