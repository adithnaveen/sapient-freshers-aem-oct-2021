package com.naveen.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransferAmountStep {

	@Given("^the site is up$")
	public void the_site_is_up() throws Throwable {
		System.out.println("the_site_is_up>>>>>");
	}

	@When("^the credentials are validated$")
	public void the_credentials_are_validated() throws Throwable {
		System.out.println("the credentials are validated>>>>>>>>");
	}

	@Then("^user is taken to dashboard$")
	public void user_is_taken_to_dashboard() throws Throwable {
		System.out.println("user is taken to dashboard>>>>>>>>>>>");
	}

	@Then("^clicks on money transfer$")
	public void clicks_on_money_transfer() throws Throwable {
		System.out.println("clicks on money transfer>>>>>>>>>>>>");
	}

	@Then("^enter the account number$")
	public void enter_the_account_number() throws Throwable {
		System.out.println("enter the account number>>>>>>>>>>>");
	}

	@Then("^amount to be transferred$")
	public void amount_to_be_transferred() throws Throwable {
		System.out.println("amount to be transferred>>>>>>>>>");
	}

	@Then("^click on transfer button$")
	public void click_on_transfer_button() throws Throwable {
		System.out.println("click on transfer button>>>>>>>>>>");
	}

}
