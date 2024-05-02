package com.stepdefinitions;

import com.pages.Elements;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElementSteps{
	
	private Elements elements;
	
	@When("click on elements")
	public void click_on_elements() {
		elements = new Elements(TestRunner.driver);
		elements.clickOnElements();	
	}

	@And("click on checkbox")
	public void click_on_checkbox() {
		elements.clickOnCheckbox();
	}
	
	@And("click on checkbox toggle")
	public void click_on_checkbox_toggle() {
		elements.clickOncheckboxToggle();
	}
	
	@Then("verify checkbox is enabled or not")
	public void verify_checkbox_is_enabled_or_not() {
		elements.enableCheckbox();
	}	

	@And("select the checkboxes")
	public void select_the_checkboxes() throws InterruptedException {
		elements.selectCheckboxes();
		Thread.sleep(2000);
	}
	
	@Then("verify checkbox is selected or not")
	public void verify_checkbox_is_selected_or_not() {
		elements.checkCheckbox();
	}
}
