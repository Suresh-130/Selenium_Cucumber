package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload {
	
	@FindBy(xpath = "//span[text()='Upload and Download']")
	WebElement uploadAndDownload;
	
	@FindBy(id = "downloadButton")
	WebElement downloadButton;
	
	@FindBy(id = "uploadFile")
	WebElement uploadFile;
	
	public FileUpload(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUploadAndDownload() {
		uploadAndDownload.click();
	}
	
	public void clickOnDownloadButton() {
		downloadButton.click();
	}
	
	public void uploadFile() {
		//uploadFile.isEnabled();
	}
	
	public void selectCheckboxes() {
		//selectCheckboxes.click();
	}
	
	

}
