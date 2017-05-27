package com.wbl.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterTest {
	@Given("^User is in Register Page$")
	public void user_is_in_Register_Page() throws Throwable {
	   
	    System.out.println("reg hello 1");
	}

	@When("^User enters all required fields for registration$")
	public void user_enters_all_required_fields_for_registration() throws Throwable {
	   

	    System.out.println("reg hello 2");
	}

	@Then("^User should be successfully registered$")
	public void user_should_be_successfully_registered() throws Throwable {
	   

	    System.out.println("reg hello 3");
	}

	@Then("^User should see all details in his WelcomeScreen$")
	public void user_should_see_all_details_in_his_WelcomeScreen() throws Throwable {
	   

	    System.out.println("reg hello 4");
	}
}
