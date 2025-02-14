@Exercise1
Feature: To test the Amazon application

  @Exercise1
  Scenario: Login Validation for Amazon with valid 
    Given To Launch the chrome browser
    And Maximize the window
    When After hit the Amazon URL
    And Click on Signin options
    And Provide the valid mail or Phone number
    |revananth97@gmail.com|8754149249|ananthkalaiamani1610@gmail.com|
    Then Click on Continue button
    And Provide the Valid Password
    |password1|password2|password3|
		|hello@123|test#rt13|fineah@13|
		|life@0001|Steve@2005|Danger@07|
		|fatherwow|785634245|luvumamma|
    Then Click on Sign in button
    Then Validate that window showing Enter verification code message.
    And close the browser