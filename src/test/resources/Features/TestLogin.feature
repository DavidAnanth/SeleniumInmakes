@Login
Feature: To validate login scenario

@Login
Scenario Outline:
To validate the login flow with multiple credentials
Given Launch the browser and maximize the window
When After that hit the website url
And Provide the userId "<userId>" in the input field.
And Enter the valid password "<passwordData>" in the input field
Then Click on Login Button
And Verify account services page will be displayed or not?
Then Close the entire browser

Examples:
|userId 											|passwordData		|
|User1												|Password@1			|
|User2												|Password@2			|



