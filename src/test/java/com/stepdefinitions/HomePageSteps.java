package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.Homepage;

import io.cucumber.java.en.*;

public class HomePageSteps {
	
	WebDriver driver;
	private Homepage homepage;
	
	@Given("browser is open")
	public void browser_is_open() {
		driver = new ChromeDriver();	
	}

	@When("user is navigated to DemoQA")
	public void user_is_navigated_to_demo_qa() {
		driver.get("https://demoqa.com/");
	}

	@Then("page title is ToolsQA should be displayed")
	public void page_title_is() {
		homepage = new Homepage(driver);
		homepage.checkTitle();
	}

}
