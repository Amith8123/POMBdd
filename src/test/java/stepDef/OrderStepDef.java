package stepDef;

import java.io.IOException;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDef extends TestBase{
	public OrderStepDef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	HomePage homePage;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    initialize();
	}
	@When("User should an Item {string}")
	public void user_should_an_item(String strItem) {
		homePage=new HomePage();
		
		
	}
	@Then("Item must be listed")
	public void item_must_be_listed() {
	    
	}

}
