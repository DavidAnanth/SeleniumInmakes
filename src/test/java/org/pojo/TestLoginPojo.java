package org.pojo;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLoginPojo extends BaseClass {
	
	public TestLoginPojo(WebDriver drv) {
		this.drv=drv;
		PageFactory.initElements(drv, this);
	}

	@FindBy(name = "username")
	private WebElement userId;
	
	@FindBy(name = "password")
	private WebElement passwrd;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement logInBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Welcome')]/parent::p/parent::div/descendant::b")
	private WebElement welcomeText;
	
	public void enter_userId(String user) throws InterruptedException {
		Thread.sleep(2000);
		userId.sendKeys(user);
	}
	
	public void enter_password(String pass) {
		passwrd.sendKeys(pass);
	}
	
	public void click_login() {
		logInBtn.click();

	}
	
	public void verify_login() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue("Successfully logged in", welcomeText.isDisplayed());

	}
}
