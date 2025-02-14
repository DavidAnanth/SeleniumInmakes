package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class myntraPojo {
	
	

	private WebDriver drv;

	public myntraPojo(WebDriver drv) {
		this.drv=drv;
		PageFactory.initElements(drv, this);
	}
	
	@FindBy(className = "desktop-searchBar")
	private WebElement srhBox;
	
	@FindBy(xpath = "(//span[@class='product-discountedPrice'])[3]")
	private WebElement thirdPrice;
	
	@FindBy(xpath = "(//span[@class='product-discountedPrice'])[1]")
	private WebElement firstPrice;
	
	public WebElement getSrhBox() {
		return srhBox;
	}

	public WebElement getThirdPrice() {
		return thirdPrice;
	}

	public WebElement getFirstPrice() {
		return firstPrice;
	}


}
