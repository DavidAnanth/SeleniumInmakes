package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
		
	public static WebDriver drv;
	
	public static void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");  // Start maximized
		options.addArguments("disable-infobars");
//		options.addArguments("--remote-debugging-port=52275");
		System.out.println("Initializing WebDriver...");
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		drv = new ChromeDriver(options);  
        if (drv != null) {
            System.out.println("WebDriver Initialized Successfully.");
        } else {
            System.out.println("Failed to initialize WebDriver.");
        }
    }
	
	public static void windowMaximize() {
		drv.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
//		launchBrowser();
		drv.get(url);
	}
	public static String pageTitle() {
		String title = drv.getTitle();
		return title;
	}
	public static String pageUrl() {
		String url = drv.getCurrentUrl();
		return url;
	}
	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}
	
	public static void closeEntireBrowser() {
		if (drv != null) {
            drv.quit();
            System.out.println("Browser closed.");
        }
	}
	
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	
	public static void screenshot(String fname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) drv;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(fname);
		FileUtils.copyFile(image, f);
	}
	
	public static Actions a;
	
	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(drv);
		a.moveToElement(targetWebElement).perform();
	}
	
	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(drv);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
	
	public void clearTxtBox() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	
	public void previousControl() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}
	
	public void pressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public boolean isElementNotPresent(WebDriver driver, By locator) { 
        List<WebElement> elements = driver.findElements(locator); 
        return elements.isEmpty(); // Returns true if the list is empty, meaning the element is not present 
    }
	
	public static JavascriptExecutor js;
	
	public static void scrollThePage(WebElement tarWebEle) {
		js = (JavascriptExecutor)drv;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}
	
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor)drv;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

}
