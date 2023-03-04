package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Before
	public void setup()
	{
		System.out.println(" browser got opened");
	}
	@After
	public void tearDown()
	{
		System.out.println(" browser got closed");
	}
	
	@Given("^User open the Application$")
    public void user_open_the_application()  
	{
		System.out.println(">>User open the Application");
       
    }

    @When("^User enter valid product into search field$")
    public void user_enter_valid_product_into_search_field() 
    {
    	System.out.println(">>User enter valid product into search field");
       
    }

    @Then("^Valid product should get  displayed in search result$")
    public void valid_product_should_get_displayed_in_search_result() 
    {
        System.out.println(">>Valid product should get  displayed in search result");
    }

    @Then("^The proper text informiong the user about no product matching should be displayed$")
    public void the_proper_text_informiong_the_user_about_no_product_matching_should_be_displayed()  
    {
    	System.out.println(">>The proper text informiong the user about no product matching ");  
    }

    @And("^User click on search button$")
    public void user_click_on_search_button()  
    {
       System.out.println(">>User click on search button");
    }

    @And("^User enter invalid product into search field$")
    public void user_enter_invalid_product_into_search_field() 
    {
        System.out.println(">>User enter invalid product into search field");
    }

    @And("^User donot enter any  product into search field$")
    public void user_donot_enter_any_product_into_search_field() 
    {
    	System.out.println(">>User donot enter any  product into search field");
        
    }

}
