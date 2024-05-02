package com.stepdefinitions;

import com.pages.Buttons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ButtonSteps {
	
	Buttons buttons;
	
	@When("click on buttons")
	public void click_on_buttons() {
		buttons = new Buttons(TestRunner.driver);
		buttons.clickOnButtons();
	}
	
	@And("double click on the doubleclick button")
	public void double_click_on_the_doubleclick_button() throws InterruptedException {
		buttons.clickOndoubleClickButton();
	}
	
	@And("right click on the rightclick button")
	public void right_click_on_the_rightclick_button() throws InterruptedException {
		buttons.clickOnrightClickButton();
	}
	
	@And("click on the oneclick button")
	public void click_on_the_oneclick_button() throws InterruptedException {
		buttons.clickOnClickmeButton();
	}
	
	@Then("verify that the above three operations are executed")
	public void verify_that_the_above_three_operations_are_executed() {
		buttons.verifyMessages();
	}

}
