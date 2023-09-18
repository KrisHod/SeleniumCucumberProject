package com.fdmgroup.testScripts;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefTest {
	private DriverUtilities driverUtilities;
    private WebDriver driver;
    
    @Before
    public void setUp() {
    	driverUtilities = DriverUtilities.getInstance();
        driver = driverUtilities.getDriver();
    }
    
    @Given("the user is on the Best Buy homepage")
    public void the_user_is_on_the_best_buy_homepage() {
    	driver.manage().window().maximize();
    	driver.get(DataFile.url);
    }

    @When("the user searches for {string}")
    public void the_user_searches_for(String product) {
        HomePage.searchField(driver).sendKeys(product, Keys.ENTER);
    }

    @Then("the search results of {string} are displayed")
    public void the_search_results_are_displayed(String product) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("title_3A6Uh")));
        String searchResults = driver.findElement(By.className("title_3A6Uh")).getText();
        assertTrue(searchResults.contains(product));
    }
}
