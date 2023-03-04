Feature: Search functionality
Background: 
Given User open the Application
And User click on search button

# when after Background run single feature file give exception 
# but running through runner class in same page not give any error
Scenario: Search for a valid product
#Given User open the Application
When User enter valid product into search field
#And User click on search button
Then Valid product should get  displayed in search result

Scenario: Search for an invalid product
#Given User open the Application
And User enter invalid product into search field
#And User click on search button
Then The proper text informiong the user about no product matching should be displayed

Scenario: Search without providing any  product
#Given User open the Application
And User donot enter any  product into search field
#And User click on search button
Then The proper text informiong the user about no product matching should be displayed

