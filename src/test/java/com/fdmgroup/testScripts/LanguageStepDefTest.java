package com.fdmgroup.testScripts;

import static org.junit.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguageStepDefTest {
	private DriverUtilities driverUtilities;
    private WebDriver driver;
    private WebDriverWait wait;
    
    @Before
    public void setUp() {
    	driverUtilities = DriverUtilities.getInstance();
        driver = driverUtilities.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_language_link(String language) {
    	wait.until(ExpectedConditions.elementToBeClickable(HomePage.languageLink(driver)));
    	if(HomePage.languageLink(driver).getText().equals(language)) {
    		HomePage.languageLink(driver).click();
    	}
    	else {
    		HomePage.languageLink(driver).click();
    		HomePage.languageLink(driver).click();
    	}
        
    }

    @Then("the site content should be displayed in the {string} language")
    public void the_site_content_should_be_displayed_in_the_selected_language(String language) {
    	System.out.println();
        assertFalse(HomePage.languageLink(driver).getText().contains(language));
    }
}
