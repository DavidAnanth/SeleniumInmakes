@icici
Feature: To validate the Icici net Banking

Scenario: To validate the Icici internet banking Login feature
Given To launch the icici net bankng URL
When Home page is loaded mouse hover to Login Dropdown and click on Personal option
And Personal Internt banking page is loaded click on User Id.
And Provide userId in the UserId input field
And Provide password in the password input field
Then Click on Login button.
