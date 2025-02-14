package org.stepdefinition;

import java.awt.AWTException;
import java.time.Duration;

import org.base.BaseClass;
import org.pojo.myntraPojo;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class myntraSearch extends BaseClass {

    myntraPojo m = new myntraPojo(drv);  

    @Given("I open the Myntra website")
    public void i_open_the_Myntra_website() {
        if (drv == null) {
            throw new RuntimeException("WebDriver is not initialized!");
        }
        drv.get("https://www.myntra.com/");  
    }

    @Then("I enter the search text as {string}")
    public void i_enter_the_search_text_as(String product) {
        WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(10));   
        wait.until(ExpectedConditions.visibilityOf(m.getSrhBox()));
        m.getSrhBox().sendKeys(product);  
    }

    @Then("I click the enter button")
    public void i_click_the_enter_button() throws AWTException {
        pressEnter(); 
    }

    @Then("I print the price of the third product")
    public void i_print_the_price_of_the_third_product() {
        WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(10)); 
        wait.until(ExpectedConditions.visibilityOf(m.getThirdPrice()));  
        String thirdPrice = m.getThirdPrice().getText();  
        System.out.println("Watch Price: " + thirdPrice);  
    }

    @Then("I print the price of the first product")
    public void i_print_the_price_of_the_first_product() {
        WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(10));   
        wait.until(ExpectedConditions.visibilityOf(m.getFirstPrice()));  
        String firstPrice = m.getFirstPrice().getText();  
        System.out.println("Bag Price: " + firstPrice);  
    }
}
