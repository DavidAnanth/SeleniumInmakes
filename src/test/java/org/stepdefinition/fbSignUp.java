package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.FbSignInPojo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.*;



public class fbSignUp extends BaseClass {
	
	FbSignInPojo f;
	
	@Given("Launch the any browser and maximize the window")
	public void launch_the_any_browser_and_maximize_the_window() {
	    launchBrowser();
	    f= new FbSignInPojo(drv);
	    windowMaximize();
	}

	@When("hit the facebook URL")
	public void hit_the_facebook_URL() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("Click on Create new account buttton")
	public void click_on_Create_new_account_buttton() {
	    f.getNewAcct().click();
	}

	@Then("Provide the First Name in firstname field")
	public void provide_the_First_Name_in_firstname_field(DataTable d) throws InterruptedException {
		Thread.sleep(2000);
		List<String> l = d.asList();
		passText(l.get(2), f.getfName());
	}

	@Then("Provide the Surname in the Surname field")
	public void provide_the_Surname_in_the_Surname_field(DataTable d) throws InterruptedException {
	    Thread.sleep(2000);
	    Map<String, String> m = d.asMap(String.class, String.class);
	    passText(m.get("Surname3"), f.getlName());
	}

	@Then("Provide the Mobile no or email in the email input field")
	public void provide_the_Mobile_no_or_email_in_the_email_input_field(DataTable d) {
	    List<List<String>> l = d.asLists();
	    passText(l.get(1).get(1), f.getMailOrMob());
	}

	@Then("To enter the new passwod in the newpassword field")
	public void to_enter_the_new_passwod_in_the_newpassword_field(DataTable d) {
	    List<Map<String, String>> l = d.asMaps();
	    passText(l.get(1).get("password2"), f.getPasswrd());
	}

	@Then("Close the current bowser window")
	public void close_the_current_bowser_window() {
	    //closeEntireBrowser();
	}

}
