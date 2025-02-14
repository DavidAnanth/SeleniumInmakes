package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class IciciLoginPojo extends BaseClass {
	
	public IciciLoginPojo(WebDriver drv) {
		this.drv = drv;
		PageFactory.initElements(drv, this);
		
	}
	
	@FindBy(id = "login-dropdown")
	private WebElement loginDrpDwn;
	
	@FindBy(xpath = "//a[contains(text(),'Personal ')]")
	private WebElement personalLogin;
	
	@FindBy(id = "Revamp_Banner_ID")
	WebElement frameId;

	public WebElement getFrameId() {
		return frameId;
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement userId;
	
	@FindBy(xpath = "(//label[@id='UserId_Text'])[1]/parent::span/parent::p/parent::div/following::p[@class='input-field m_cf ']/descendant::input")
	private WebElement userIdTxt;

	@FindBy(className = "login-input-password")
	private WebElement passwrd;
	
	@FindBy(id="VALIDATE_CREDENTIALS1")
	private WebElement LoginBtn;
	
	@FindBy(xpath = "//div[@id='MessageDisplay_TABLE']/child::div[@role='alert']")
	private WebElement alert;
	
	public WebElement getLoginDrpDwn() {
		return loginDrpDwn;
	}

	public WebElement getPersonalLogin() {
		return personalLogin;
	}
	
	public WebElement getUserId() {
		return userId;
	}

	public WebElement getUserIdTxt() {
		return userIdTxt;
	}
	
	public WebElement getPasswrd() {
		return passwrd;
	}

	
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public WebElement getAlert() {
		return alert;
	}
}
