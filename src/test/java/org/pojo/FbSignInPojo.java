package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSignInPojo extends BaseClass {
	
	public FbSignInPojo(WebDriver drv) {
		this.drv=drv;
		PageFactory.initElements(drv, this);
		
	}
	
	@FindBy(xpath = "//*[contains(text(),'Create new account')]")
	private WebElement newAcct;
	
	@FindBy(name = "firstname")
	private WebElement fName;
	
	@FindBy(name = "lastname")
	private WebElement lName;
	
	@FindBy(name = "reg_email__")
	private WebElement mailOrMob;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwrd;

	public WebElement getNewAcct() {
		return newAcct;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getMailOrMob() {
		return mailOrMob;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}
	
	

}
