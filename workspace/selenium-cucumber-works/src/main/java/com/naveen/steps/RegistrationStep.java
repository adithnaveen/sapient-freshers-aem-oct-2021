package com.naveen.steps;

import cucumber.api.java.en.When;

public class RegistrationStep {

	@When("^the registration page is loaded$")
	public void the_registration_page_is_loaded() throws Throwable {
		System.out.println("the registration page is loaded>>>>");
	}
}
