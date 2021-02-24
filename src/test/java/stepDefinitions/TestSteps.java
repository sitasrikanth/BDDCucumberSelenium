package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is at login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("user clicks on submit button");
	}

	@Then("user is logged-in successfully")
	public void user_is_logged_in_successfully() {
		System.out.println("user logged in successfully");
	}

	@And("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("user is navigated to home page");
	}

}