package com.stepdefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {
	
//	public static WebDriver driver;
//	
//	@Before
//	public void browser_is_open() {
//		driver = new ChromeDriver();
//		driver.get("https://demoqa.com/");
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//	
//	@After
//	public void tear_down() {
//		driver.quit();
//	}
	
//	public static void explicitWait(WebElement webElement) {
//		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement element = driverWait.until(ExpectedConditions.elementToBeClickable(webElement));
//		element.click();
//	}

}
