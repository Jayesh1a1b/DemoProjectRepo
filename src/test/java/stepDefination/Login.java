package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	@Given("User navigate to login page")
	public void user_navigate_to_login_page()
	{
	    System.out.println(">>User navigate to login page");
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String validEmail) 
	{
		System.out.println(">>User enters valid email address {string}"+validEmail);
	}

	@And("Enter valid password {string}")
	public void enter_valid_password(String validPassword) 
	{
		System.out.println(">>Enter valid password {string}"+validPassword);
	}

	@And("click on submit button")
	public void click_on_submit_button() 
	{
		System.out.println(">>click on submit button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() 
	{
		System.out.println(">>User should login successfully");  
	}

	@When("User enter invalid Email Address {string}")
	public void user_enter_invalid_email_address(String invalidEmail) 
	{
		System.out.println(">>User enter invalid Email Address {string}"+invalidEmail);
	}

	@And("User enter invalid Password {string}")
	public void user_enter_invalid_password(String invalidPassword)
	{
		System.out.println(">>User enter invalid Password {string}"+invalidPassword);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() 
	{
		System.out.println(">>User should get a proper warning message");
	}

	@When("User enter valid email address {string}")
	public void user_enter_valid_email_address(String invalidEmail) 
	{
		System.out.println(">>User enter valid email address {string}"+invalidEmail);
	}

	@And("User enter invalid password {string}")
	public void user_enter_invalid_password1(String invalidPassword) 
	{
	    System.out.println(">>User enter invalid password {string}"+invalidPassword);
	}

	@And("User click on continue button")
	public void user_click_on_continue_button() 
	{
		System.out.println(">>User clock on continue button");
	}


}
