package com.stepdefinitions;

import com.pages.RadioButton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RadioButtonSteps {

	private RadioButton radioButton;
	
	@When("click on radiobutton")
	public void click_on_radiobutton() {
	    radioButton = new RadioButton(TestRunner.driver);
	    radioButton.clickOnRadioButton();
	}

	@And("select the yes button")
	public void select_the_yes_button() {
		radioButton.clickOnYesButton();
	}

	@Then("verify the yes button is selected")
	public void verify_the_yes_button_is_selected() {
		radioButton.verifyYesText();
	}

	@And("click on impressive button")
	public void click_on_impressive_button() {
		radioButton.clickOnImpressiveButton();
	}

	@Then("verify the impressive is selected")
	public void verify_the_impressive_is_selected() {
		radioButton.verifyImpressiveText();
	}

	@And("check the no button is enable")
	public void check_the_no_button_is_enable() {
	    radioButton.checkNoButton();
	}
}
