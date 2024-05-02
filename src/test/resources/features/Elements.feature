Feature: Check Elements

	Background:
		When click on elements
	
	Scenario: Checkbox Operations
		When click on checkbox
		And click on checkbox toggle
		And verify checkbox is enabled or not
		And select the checkboxes
		Then verify checkbox is selected or not
		
	Scenario: buttons Operations
		When click on buttons
		And double click on the doubleclick button
		And right click on the rightclick button
		And click on the oneclick button
		Then verify that the above three operations are executed
		
	Scenario: Radio buttons Operations
		When click on radiobutton
		And select the yes button
		Then verify the yes button is selected
		And click on impressive button
		Then verify the impressive is selected
		And check the no button is enable
		
	Scenario: Text Box Operations
		When click on textbox
		And enter the input fields
		And check the submit button is clickable
		Then click on submit
		
	#Scenario: File Upload and Download operations
		#Given User is on Upload and Download page
   # When User uploads a file and downloads it
    #Then File should be uploaded and downloaded successfully
		
		
		
		