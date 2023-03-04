Feature: User Login
Registered user should be able to login to access account details
@login
Scenario: Login with valid credentials
Given User navigate to login page 
When User enters valid email address "jayesh1a1b@gmail.com"
And Enter valid password "12345"
And click on submit button
Then User should login successfully
@login
Scenario: Login with invalid credentials
Given User navigate to login page
When  User enter invalid Email Address "jayesh1a1bgmail.com"
And   User enter invalid Password "123456"
And click on submit button
Then User should get a proper warning message

Scenario: Login with valid email and invalid password
Given User navigate to login page
When User enter valid email address "jayesh1a1b@gmail.com"
And User enter invalid password "123456"
And User click on continue button
Then User should get a proper warning message
