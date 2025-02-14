package org.pojo;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPojo extends BaseClass{
	
	public AmazonSignInPojo(WebDriver drv) {
		this.drv=drv;
		PageFactory.initElements(drv, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Hello')]/parent::div/parent::a/child::div[@class='nav-line-1-container']")
	private WebElement signIn;
	
	@FindBy(xpath = "//input[@type='email']/parent::div/child::input[@name='email']")
	private WebElement mailId;
	
	@FindBy(xpath = "//input[@class='a-button-input' and @type='submit']")
	private WebElement ctnBtn;
	
	@FindBy(xpath = "//*[@type='password']/parent::div/child::input[@name='password']")
	private WebElement passwrd;
	
	@FindBy(xpath = "//*[contains(text(),'Sign in')]/parent::span/parent::span/parent::div/descendant::input[@type='submit']")
	private WebElement signInBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Enter verification code')]/parent::div/child::span")
	private WebElement verificationMsg;
	
	public void click_SignIn() throws InterruptedException {
		Thread.sleep(2000);
		signIn.click();
	}
	
	public void enter_mailId(String mail) throws InterruptedException {
		Thread.sleep(2000);
		mailId.sendKeys(mail);

	}
	
	public void click_ctnBtn() throws InterruptedException {
		Thread.sleep(2000);
		ctnBtn.click();

	}
	
	public void enter_password(String pass) throws InterruptedException {
		Thread.sleep(2000);
		passwrd.sendKeys(pass);
	}
	
	public void click_siginBtn() throws InterruptedException {
		Thread.sleep(2000);
		signInBtn.click();

	}
	
	public void get_verification() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue("Verification Code Sent", verificationMsg.isDisplayed());
	}

}
