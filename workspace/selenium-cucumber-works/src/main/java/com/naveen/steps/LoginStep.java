package com.naveen.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

	@Then("^enter username$")
	public void enter_username() throws Throwable {
		System.out.println("enter username>>>>>");
	}

	@Then("^password in the provided box$")
	public void password_in_the_provided_box() throws Throwable {
		System.out.println("password in the provided box>>>>");
	}

	@Then("^click on submit$")
	public void click_on_submit() throws Throwable {
		System.out.println("click on submit>>>> ");
	}

	@Then("^user should be taken to home page$")
	public void user_should_be_taken_to_home_page() throws Throwable {
		System.out.println("user should be taken to home page>>>>>");
	}

}
