package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.AmazonSignInPojo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.*;

public class signInAmazon extends BaseClass {
	
	AmazonSignInPojo a;
	
	@Given("To Launch the chrome browser")
	public void to_Launch_the_chrome_browser() {
	    launchBrowser();
	     a = new AmazonSignInPojo(drv);
	}

	@Given("Maximize the window")
	public void maximize_the_window() {
	    windowMaximize();
	}

	@When("After hit the Amazon URL")
	public void after_hit_the_Amazon_URL() {
	    launchUrl("https://www.amazon.in/ref=nav_logo");
	    drv.navigate().refresh();
	    drv.navigate().refresh();
	}

	@When("Click on Signin options")
	public void click_on_Signin_options() throws InterruptedException {
//		drv.navigate().refresh();
		a.click_SignIn();
	}

	@When("Provide the valid mail or Phone number")
	public void provide_the_valid_mail_Phone_number(DataTable d) throws InterruptedException {
		List<String> l = d.asList();
		a.enter_mailId(l.get(0));
	    
	}

	@Then("Click on Continue button")
	public void click_on_Continue_button() throws InterruptedException {
	    a.click_ctnBtn();
	    
	}

	@Then("Provide the Valid Password")
	public void provide_the_Valid_Password(DataTable d) throws InterruptedException {
		Thread.sleep(2000);
		List<Map<String, String>> l = d.asMaps();
	    a.enter_password(l.get(1).get("password2"));
	}

	@Then("Click on Sign in button")
	public void click_on_Sign_in_button() throws InterruptedException {
	   a.click_siginBtn();
	   
	}

	@Then("Validate that window showing Enter verification code message.")
	public void validate_that_window_showing_Enter_verification_code_message() throws InterruptedException {
		a.get_verification();
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
//	   closeEntireBrowser();
	    
	}


}
