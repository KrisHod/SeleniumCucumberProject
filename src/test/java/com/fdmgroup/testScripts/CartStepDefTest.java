package com.fdmgroup.testScripts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.pages.SearchResultPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDefTest {
	private DriverUtilities driverUtilities;
    private WebDriver driver;
    
    @Before
    public void setUp() {
    	driverUtilities = DriverUtilities.getInstance();
        driver = driverUtilities.getDriver();
    }

    @Given("the cart icon is displayed on the page")
    public void the_cart_icon_is_displayed_on_the_page() {
    	assertEquals("Cart", SearchResultPage.cartLink(driver).getText());
    	
    }

    @When("the user clicks on the cart icon")
    public void the_user_clicks_on_the_cart_icon() {
    	SearchResultPage.cartLink(driver).click();
    }

    @Then("the cart page is displayed")
    public void the_cart_page_is_displayed() {
    	assertTrue(driver.getCurrentUrl().contains("basket"));
    }
}