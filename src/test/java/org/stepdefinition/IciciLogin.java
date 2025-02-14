package org.stepdefinition;

import java.time.Duration;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.IciciLoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IciciLogin extends BaseClass {
	
	IciciLoginPojo i = new IciciLoginPojo(drv);
	WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(20));
	
	@Given("To launch the icici net bankng URL")
	public void toLaunchTheIciciNetBankngURL() {
	  launchUrl("https://www.icicibank.com/");  
	}
	@When("Home page is loaded mouse hover to Login Dropdown and click on Personal option")
	public void homePageIsLoadedMouseHoverToLoginDropdownAndClickOnPersonalOption() {
		wait.until(ExpectedConditions.visibilityOf(i.getLoginDrpDwn())).click();   
		
	}
	@When("Personal Internt banking page is loaded click on User Id.")
	public void personalInterntBankingPageIsLoadedClickOnUserId() {
		wait.until(ExpectedConditions.visibilityOf(i.getPersonalLogin())).click(); 
	}
	
	@When("Provide userId in the UserId input field")
	public void provideUserIdInTheUserIdInputField() throws InterruptedException {
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(i.getFrameId()));
		drv.switchTo().defaultContent();
		i.getUserId().click();
		Thread.sleep(2000);
		i.getUserIdTxt().sendKeys("B7865432");
	}
	@When("Provide password in the password input field")
	public void providePasswordInThePasswordInputField() {
		wait.until(ExpectedConditions.visibilityOf(i.getPasswrd())); 
		i.getPasswrd().sendKeys("Tony@2408");
	}
	@Then("Click on Login button.")
	public void clickOnLoginButton() {
		wait.until(ExpectedConditions.visibilityOf(i.getLoginBtn())).click();
		wait.until(ExpectedConditions.visibilityOf(i.getAlert()));
		Assert.assertTrue(i.getAlert().isDisplayed());
	}
	
	
}
