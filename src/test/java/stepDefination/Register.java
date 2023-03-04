package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register 
{
	@Given( "^User navigate to register page$")
	public void User_navigate_to_register_page()
	{
	System.out.println(">>User navigate to register page");	
	}
	
	@When("User enter firstName {string} into the First Name Field")
	public void User_enter_firstName_into_the_First_Name_Field(String firstNameText)
	{
		System.out.println(">>User entered firstName as "+firstNameText+ "  into the First Name Field");
	}
	
	@When("Enter lastName {string} into the Last Name field")
	public void enter_last_name_into_the_last_name_field(String lastNameText) {
	    System.out.println(">>Enter lastName as "+lastNameText+" into the Last Name field");
	}

	@When("Enter email {string} into the Email field")
	public void enter_email_into_the_email_field(String emailText) {
	    System.out.println(">>Enter email as " +emailText+" into the Email field");
	}

	@When("Enter telephone {string} into the Telephone field")
	public void enter_telephone_into_the_telephone_field(String telephone) {
	    System.out.println(">>Enter telephone as " +telephone+" into the Telephone field");
	}

	@When("Enter password {string} into the Password field")
	public void enter_password_into_the_password_field(String password) {
	    System.out.println(">> Enter password as "+password+" into the Password field");
	}

	@When("Enter password {string} into the  Password Confirm field")
	public void enter_password_into_the_password_confirm_field(String confirmPassword) {
		System.out.println(">> Enter password as "+confirmPassword+" into the Password field");  
	}

	@When("Click on privacy policy field")
	public void click_on_privacy_policy_field() {
	   System.out.println(">>Click on privacy policy field");
	}

	@When("click on continue button")
	public void click_on_continue_button() {
	   System.out.println(">>click on continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
	    System.out.println(">>Account should get successfully created");
	}

	@Given("User should navigate to register page")
	public void user_should_navigate_to_register_page() {
	    System.out.println(">>User should navigate to register page");
	}

	@When("click on Newsletter")
	public void click_on_newsletter() {
	    System.out.println(">>click on Newsletter");
	}

	@When("Click on privacy policy")
	public void click_on_privacy_policy() {
	   System.out.println(">>Click on privacy policy");
	}

	@Given("User should nabvigate to register page")
	public void user_should_nabvigate_to_register_page() {
	    System.out.println(">>User should nabvigate to register page");
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {
	  System.out.println(">>User dont enter details into any fields");  
	}

	@Then("Warning message should be displayed for mandatory fields")
	public void warning_message_should_be_displayed_for_mandatory_fields() {
	    System.out.println(">>Warning message should be displayed for mandatory fields");
	}

	@Then("Warning message informing the user about duplicate Email should be displayed")
	public void warning_message_informing_the_user_about_duplicate_email_should_be_displayed() {
	    System.out.println(">>Warning message informing the user about duplicate Email should be displayed");
	}
}
