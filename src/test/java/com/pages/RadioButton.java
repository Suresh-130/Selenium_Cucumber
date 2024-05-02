package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinitions.Base;

public class RadioButton {
	
	@FindBy(xpath = "//span[text()='Radio Button']")
	WebElement radiobutton;
	
	@FindBy(xpath = "//input[@id='yesRadio']")
	WebElement yesbutton;
	
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yestext;
	
	@FindBy(id = "impressiveRadio")
	WebElement impressivebutton;
	
	@FindBy(xpath = "//span[text()='Impressive']")
	WebElement impressivetext;
	
	@FindBy(id = "noRadio")
	WebElement nobutton;
		
	WebDriver driver;
	
	public RadioButton(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRadioButton() {
		radiobutton.click();
	}
	
	public void clickOnYesButton() {
		yesbutton.isDisplayed();
		//Base.explicitWait(yesbutton);
		//yesbutton.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesbutton);
	}
	
	public void verifyYesText() {
		yesbutton.isSelected();
		//yestext.isDisplayed();
	}
	
	public void clickOnImpressiveButton() {
		//impressivebutton.click();
	}
	
	public void verifyImpressiveText() {
		impressivebutton.isSelected();
		//impressivetext.isDisplayed();
	}
	
	public void checkNoButton() {
		nobutton.isEnabled();
	}
	
}
