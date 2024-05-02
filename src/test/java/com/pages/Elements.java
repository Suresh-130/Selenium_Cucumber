package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinitions.Base;

public class Elements{
	
	@FindBy(xpath = "//h5[text()='Elements']")
	WebElement elements;
	
	@FindBy(xpath = "//span[text()='Check Box']")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[@title='Toggle']")
	WebElement checkboxToggle;
	
	@FindBy(xpath = "//input[@id='tree-node-home']/parent::label")
	WebElement selectCheckboxes;
	
	//WebDriver driver;
	
	public Elements(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCheckbox() {
		checkbox.click();
	}
	
	public void clickOncheckboxToggle() {
		checkboxToggle.click();
	}
	
	public void enableCheckbox() {
		selectCheckboxes.isEnabled();
	}
	
	public void selectCheckboxes() {
		selectCheckboxes.click();
	}
	
	public void checkCheckbox() {
		selectCheckboxes.isSelected();
	}
	
	public void clickOnElements() {
		elements.click();
	}	

}
