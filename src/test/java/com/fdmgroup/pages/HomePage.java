package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement searchField(WebDriver driver) {
		return driver.findElement(By.className("textField_XaJoz"));
	}
	
	public static WebElement slider(WebDriver driver) {
		return driver.findElement(By.className("container_zlzpr"));
	}
	
	public static WebElement nextSlideButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("svg.darkGrey_oThXm.sliderNextArrow_1bq3k.icon_2muIh.icon_q2ZYd"));
	}
	
	public static WebElement nextSlide(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id, 'root')]//*[text()='Bose QuietComfort Ultra Over-Ear Noise Cancelling Bluetooth Headphones - Black']"));
	}
	
	public static WebElement previousSlideButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("svg.darkGrey_oThXm.sliderPrevArrow_2FtXd.icon_2muIh.icon_q2ZYd"));
	}
	
	public static WebElement previousSlide(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id, 'root')]//*[text()='Bose QuietComfort Over-Ear Noise Cancelling Bluetooth Headphones - White Smoke']"));
	}

	public static WebElement languageLink(WebDriver driver) {
		return driver.findElement(By.cssSelector("a[data-automation='x-language'][class='topLinkAnchor_3PJ9l']"));
	}
}
