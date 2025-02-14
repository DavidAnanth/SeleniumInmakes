package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchDemo extends BaseClass{
	
	@FindBy(name = "search")
	private WebElement SrhBox;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement SrhBtn;

	public WebElement getSrhBox() {
		return SrhBox;
	}
	
	public WebElement getSrhBtn() {
		return SrhBtn;
	}

}
