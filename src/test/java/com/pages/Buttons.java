package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons {

	@FindBy(xpath = "//span[text()='Buttons']")
	WebElement buttons;

	@FindBy(id = "doubleClickBtn")
	WebElement doubleClickButton;

	@FindBy(id = "rightClickBtn")
	WebElement rightClickButton;

	@FindBy(xpath = "//button[text()='Click Me']")
	WebElement clickmeButton;
	
	@FindBy(id = "doubleClickMessage")
	WebElement doubleClickBtnMsg;
	
	@FindBy(id = "rightClickMessage")
	WebElement rightClickBtnMsg;
	
	@FindBy(id = "dynamicClickMessage")
	WebElement clickmeButtonMsg;
	
	Actions actions;

	public Buttons(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void clickOnButtons() {
		buttons.click();
	}

	public void clickOndoubleClickButton() throws InterruptedException {
		actions.doubleClick(doubleClickButton).perform();
		Thread.sleep(2000);
	}

	public void clickOnrightClickButton() throws InterruptedException  {
		actions.contextClick(rightClickButton).perform();
		Thread.sleep(2000);
	}

	public void clickOnClickmeButton() throws InterruptedException {
		clickmeButton.click();
		Thread.sleep(2000);
	}

	public void verifyMessages() {
		doubleClickBtnMsg.isDisplayed();
		rightClickBtnMsg.isDisplayed();
		clickmeButtonMsg.isDisplayed();
	}

//	public void checkCheckbox() {
//		selectCheckboxes.isSelected();
//	}
//	

}
