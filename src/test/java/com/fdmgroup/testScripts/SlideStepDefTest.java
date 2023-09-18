package com.fdmgroup.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SlideStepDefTest {
	private DriverUtilities driverUtilities;
    private WebDriver driver;
    private WebDriverWait wait;
    
    @Before
    public void setUp() {
    	driverUtilities = DriverUtilities.getInstance();
        driver = driverUtilities.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
	@Given("the slide component is present on the page")
	public void the_slide_component_is_present_on_the_page() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("container_zlzpr")));
	    HomePage.slider(driver).isDisplayed();
	}

	@When("the user clicks on the next slide button")
	public void the_user_clicks_on_the_next_slide_button() {
	    HomePage.nextSlideButton(driver).click();
	}

	@Then("the next slide is displayed")
	public void the_next_slide_is_displayed() {
	    HomePage.nextSlide(driver).isDisplayed();
	}

	@When("the user clicks on the previous slide button")
	public void the_user_clicks_on_the_previous_slide_button() {
	    HomePage.previousSlideButton(driver).click();
	}

	@Then("the previous slide is displayed")
	public void the_previous_slide_is_displayed() {
		HomePage.previousSlide(driver).isDisplayed();
	}
}
