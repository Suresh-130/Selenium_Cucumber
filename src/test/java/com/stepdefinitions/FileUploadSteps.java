package com.stepdefinitions;

import com.pages.FileUpload;

import io.cucumber.java.en.*;

public class FileUploadSteps {
	
	private FileUpload fileUpload;
	
	@Given("User is on Upload and Download page")
	public void user_is_on_upload_and_download_page() {
		fileUpload = new FileUpload(TestRunner.driver);
		
	}
	
	@When("User uploads a file and downloads it")
	public void user_uploads_a_file_and_downloads_it() {
		
	}
	
	@Then("File should be uploaded and downloaded successfully")
	public void file_should_be_uploaded_and_downloaded_successfully() {
		
	}

}
