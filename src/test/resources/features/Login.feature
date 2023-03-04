Feature: User Login
Registered user should be able to login to access account details

Background:
Given User navigate to login page

@login 
Scenario Outline: Login with valid credentials
#Given User navigate to login page 
When User enters valid email address <email>
And Enter valid password <password>
And click on submit button
Then User should login successfully
Examples:
|email								 			|password|
|jayesh1a1b@gmail.com  			| 12345	 |
|amotooricap9@gmail.com			| 12345	 |
|jayeshchoudhary63@gmail.com| 12345  |
  
  @login 
Scenario: Login with invalid credentials
#Given User navigate to login page
When  User enter invalid Email Address "jayesh1a1bgmail.com"
And   User enter invalid Password "123456"
And click on submit button
Then User should get a proper warning message

@login 
Scenario: Login with valid email and invalid password
#Given User navigate to login page
When User enter valid email address "jayesh1a1b@gmail.com"
And User enter invalid password "123456"
And User click on continue button
Then User should get a proper warning message
