package com.naveen.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("the site is up http://somesite.com")
	public void openSite() {
		System.out.println("the site is up http://somesite.com>>>>");
	}
	@And("user clicks on login link")
	public void user_clicks_on_login_link() {
		System.out.println("user clicks on login link>>>>");
	}
	@When("the login page is shown")
	public void the_login_page_is_shown() {
		System.out.println("the login page is shown>>>>");
	}
}
