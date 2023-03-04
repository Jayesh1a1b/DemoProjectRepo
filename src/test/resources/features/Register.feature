Feature: User Registration

Scenario: User register with Mandatory fields
Given User navigate to register page
When User enter firstName "jayesh" into the First Name Field
And Enter lastName "choudhary" into the Last Name field
And Enter email "jayeshchoudhary008@gmail.com" into the Email field
And Enter telephone "9325335386" into the Telephone field
And Enter password "12345" into the Password field
And Enter password "12345" into the  Password Confirm field
And Click on privacy policy field
And click on continue button
Then Account should get successfully created

Scenario: User register with all fields
Given User should navigate to register page
When User enter firstName "jayesh" into the First Name Field
And Enter lastName "choudhary" into the Last Name field
And Enter email "jayeshchoudhary008@gmail.com" into the Email field
And Enter telephone "9325335386" into the Telephone field
And Enter password "12345" into the Password field
And Enter password "12345" into the  Password Confirm field
And click on Newsletter
And Click on privacy policy 
And click on continue button
Then Account should get successfully created

Scenario: Register without providing any fields
Given User should nabvigate to register page
When  User dont enter details into any fields
And click on continue button
Then Warning message should be displayed for mandatory fields

Scenario: Register with duplicate  Email Address
Given User should navigate to register page
When User enter firstName "jayesh" into the First Name Field
And Enter lastName "choudhary" into the Last Name field
And Enter email "jayeshchoudhary008@gmail.com" into the Email field
And Enter telephone "9325335386" into the Telephone field
And Enter password "12345" into the Password field
And Enter password "12345" into the  Password Confirm field
And click on Newsletter
And Click on privacy policy 
And click on continue button
Then Warning message informing the user about duplicate Email should be displayed
