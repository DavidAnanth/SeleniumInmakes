package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.gmailSignInPojo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmailSignIn extends BaseClass {
	
	gmailSignInPojo g; 
	
	@Given("Launch the Chrome browser and maximize the window")
	public void launch_the_Chrome_browser_and_maximize_the_window() {
	    launchBrowser();
	    g = new gmailSignInPojo(drv);
	    windowMaximize();
	}

	@When("After that hit the gmail login url")
	public void after_that_hit_the_gmail_login_url() {
	   launchUrl("https://accounts.google.com/servicelogin?service=mail");
	}

	@When("Provide the email\\/PhoneNo {string} in the input box.")
	public void provide_the_email_PhoneNo_in_the_input_box(String mailId) throws InterruptedException {
	   g.enter_mailId(mailId);
	}

	@Then("Click on Next Button")
	public void click_on_Next_Button() {
	    g.click_nxtMail();
	}

	@Then("Enter the password {string} in the input field")
	public void enter_the_password_in_the_input_field(String pass) throws InterruptedException {
		Thread.sleep(2000);
		g.click_tryAgain();
	    g.enter_passwrd(pass);
	}
	
	@Then("Click on password Next Button")
	public void click_on_password_Next_Button() {
	    g.click_nxtPass();
	}

	@Then("Close the browser")
	public void close_the_browser() {
//	  closeEntireBrowser();
	}

}
