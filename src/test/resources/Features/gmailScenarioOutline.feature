@gmailLogin
Feature: To validate login scenario

@gmailLogin
Scenario Outline:
To validate the gmail login with multiple credentials
Given Launch the Chrome browser and maximize the window
When After that hit the gmail login url
And Provide the email/PhoneNo "<emailId>" in the input box.
Then Click on Next Button
And Enter the password "<passwordData>" in the input field
Then Click on password Next Button
Then Close the browser

Examples:
|emailId 											|passwordData		|
|User1												|Password@1			|
|User2												|Password@2			|



