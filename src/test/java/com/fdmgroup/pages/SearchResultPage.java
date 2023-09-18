package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

	public static WebElement resultTitle(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id, 'root') and text()='Your Cart']")
);
	}

	public static WebElement productLink(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id, 'root')]"));
	}

	public static WebElement cartLink(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id, 'cartIcon')]"));
	}
}