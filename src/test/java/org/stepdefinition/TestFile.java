package org.stepdefinition;

import java.util.Set;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.redbusPojo;

public class TestFile extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		redbusPojo r = new redbusPojo(drv);
		launchUrl("https://redbus.netlify.app/");
		Thread.sleep(3000);
		r.getLoginOpt().click();
		r.getSignupBtn().click();
		
		String mainWindowHandle = drv.getWindowHandle();
		
		Set<String> windowHandles = drv.getWindowHandles();

        
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                drv.switchTo().window(handle); 
                System.out.println("Title of second window: " + drv.getTitle());
                r.getMailId().sendKeys("testuser@gmail.com");
                r.getNextBtn().click();
//                if (r.getTryAgnBtn().isDisplayed()) {
//					
//				}
//                drv.navigate().refresh();
                r.getCaptcha().click();
                r.getNextBtn().click();
            }
        }

//        drv.switchTo().window(mainWindowHandle);
		
	}

}
