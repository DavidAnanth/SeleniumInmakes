package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailSignInPojo extends BaseClass{
	
	public gmailSignInPojo(WebDriver drv) {
		this.drv=drv;
		PageFactory.initElements(drv, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Email or phone')]/parent::div/parent::div/descendant::input[@type='email']")
	private WebElement mailOrMob;
	
	@FindBy(xpath ="//*[contains(text(),'Next')]/parent::button")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Couldn’t sign you in')]/parent::h1/parent::div/descendant::span")
	private WebElement couldntSign;
	
	@FindBy(xpath = "//*[contains(text(),'Try again')]/parent::div/descendant::a")
	private WebElement tryAgain;
	
	@FindBy(xpath = "//*[contains(text(),'Enter your password')]/parent::div/child::input[@type='password']")
	private WebElement passwrd;
	
	@FindBy(xpath = "//*[contains(text(),'Next')]/parent::button/parent::div/parent::div/descendant::button")
	private WebElement passwrdNxt;
	
	public void enter_mailId(String mail) throws InterruptedException {
		Thread.sleep(2000);
		mailOrMob.sendKeys(mail);

	}
	
	public void click_nxtMail() {
		nextBtn.click();

	}
	
	public void enter_passwrd(String pass) throws InterruptedException {
		Thread.sleep(2000);
		passwrd.sendKeys(pass);

	}
	
	public void click_nxtPass() {
		passwrdNxt.click();

	}
	
	public void click_tryAgain() {
		if (couldntSign.isDisplayed()== true) {
			tryAgain.click();
		}

	}

}
