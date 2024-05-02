package com.stepdefinitions;

import com.pages.TextBox;

import io.cucumber.java.en.*;

public class TextBoxSteps {
	
	private TextBox textBox;
	
	@When("click on textbox")
	public void click_on_textbox() {
		textBox = new TextBox(TestRunner.driver);
		textBox.clickOnTextBox();
	}

	@And("enter the input fields")
	public void enter_the_input_fields() {
		textBox.fillInputFields();
	}
	
	@And("check the submit button is clickable")
	public void clickableButton() {
		textBox.checkButton();
	}

	@Then("click on submit")
	public void click_on_submit() {
		textBox.clickOnSubmit();
	}

}
