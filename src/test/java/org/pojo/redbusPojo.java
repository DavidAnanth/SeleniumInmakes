package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redbusPojo extends BaseClass {
	
	public redbusPojo(WebDriver drv) {
		this.drv=drv;
		PageFactory.initElements(drv, this);
	}

	@FindBy(xpath = "(//*[contains(text(),'MANAGE BOOKING')]/parent::div/descendant::div)[2]")
	private WebElement LoginOpt;
	
	@FindBy(xpath = "//*[contains(text(),'Sign in with Google')]/parent::button")
	private WebElement signupBtn;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement mailId;
	
	@FindBy(xpath = "//*[contains(text(),'Next')]/parent::button")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Try again')]")
	private WebElement tryAgnBtn;
	
	public WebElement getTryAgnBtn() {
		return tryAgnBtn;
	}

	@FindBy(className = "recaptcha-checkbox-border")
	private WebElement captcha;
	
	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getSignupBtn() {
		return signupBtn;
	}

	public WebElement getLoginOpt() {
		return LoginOpt;
	}
	
}
