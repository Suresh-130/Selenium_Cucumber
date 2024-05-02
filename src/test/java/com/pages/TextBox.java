package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinitions.Base;

public class TextBox {

	@FindBy(xpath = "//span[text()='Text Box']")
	WebElement textBox;
	
	@FindBy(id = "userName")
	WebElement username;
	
	@FindBy(id = "userEmail")
	WebElement userEmail;
	
	@FindBy(id = "currentAddress")
	WebElement userCurrentAddress;
	
	@FindBy(id = "permanentAddress")
	WebElement userPermanentAddress;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;
		
	WebDriver driver;
	
	public TextBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTextBox() {
		textBox.click();
	}
	
	public void fillInputFields() {
		username.click();
		username.sendKeys("aaaaa");
		userEmail.click();
		userEmail.sendKeys("dshjf");
		userCurrentAddress.click();
		userCurrentAddress.sendKeys("csijhskch");
		userPermanentAddress.click();
		userPermanentAddress.sendKeys("suhihsx");
	}
	
	public void checkButton() {
		submitButton.isDisplayed();
		submitButton.isEnabled();
	}
	
	public void clickOnSubmit() {
		//Base.explicitWait(submitButton);
		//submitButton.click();
	}
	
}
