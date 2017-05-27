package com.wbl.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wbl.page.LoginPage;
import com.wbl.util.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	LoginPage loginpage;
	String responseThen;
	WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", Constants.RESOURCES + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		driver.get("https://www.walmart.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		// to-do use page object pattern and return loginpage object by
		// clickking on homepage link
		driver.get("https://www.walmart.com/account/login?tid=0&returnUrl=%2F");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pwd) throws Throwable {
		String actual = loginpage.login(uname, pwd);
		responseThen = actual;
	}

	@Then("^Message displayed Login Successfully - \"([^\"]*)\"$")
	public void message_displayed_Login_Successfully(String expected) throws Throwable {
		Assert.assertEquals(expected, responseThen);
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {

		System.out.println("hello 5");
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("hello 6");

	}

	@Given("^User is on LoginPage$")
	public void user_is_on_LoginPage() throws Throwable {

	}

	@When("^User enters valid userid and invalid password$")
	public void user_enters_valid_userid_and_invalid_password() throws Throwable {

	}

	@Then("^User should see an error message - Username or password is incorrect-please try again$")
	public void user_should_see_an_error_message_Username_or_password_is_incorrect_please_try_again() throws Throwable {

	}

}
