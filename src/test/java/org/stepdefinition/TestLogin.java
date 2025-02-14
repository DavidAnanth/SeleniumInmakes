package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.TestLoginPojo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin extends BaseClass {
	
	TestLoginPojo t;
	
	@Given("Launch the browser and maximize the window")
	public void launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    t = new TestLoginPojo(drv);
	    windowMaximize();
	}

	@When("After that hit the website url")
	public void after_that_hit_the_website_url() {
	    launchUrl("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("Provide the userId {string} in the input field.")
	public void provide_the_userId_in_the_input_field(String user) throws InterruptedException {
	    t.enter_userId(user);
	}

	@When("Enter the valid password {string} in the input field")
	public void enter_the_valid_password_in_the_input_field(String pass) {
	    t.enter_password(pass);
	}

	@Then("Click on Login Button")
	public void click_on_Login_Button() {
	    t.click_login();
	}

	@Then("Verify account services page will be displayed or not?")
	public void verify_account_services_page_will_be_displayed_or_not() throws InterruptedException {
	    t.verify_login();
	}
	
	@Then("Close the entire browser")
	public void close_the_entire_browser() {
	    closeEntireBrowser();
	}


}
