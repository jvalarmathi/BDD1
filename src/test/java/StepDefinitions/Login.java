package StepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("^Enter invalid credential (.+),(.+)$")
	public void enter_invalid_credential(String string, String string2) { 
	    System.out.println("Enter invalid Credential"+ string+", "+ string2);	
	    }
	@Given("^Enter valid credential (.+),(.+)$")
	public void enter_valid_credential(String string, String string2) { 
	    System.out.println("Enter valid Credential"+ string+", "+ string2);	
	}
	@When("Click Login")
	public void click_login() {
	    System.out.println("Click login");	
	}
	@Then("Login is unsuccessful")
	public void login_is_unsuccessful() {
	    System.out.println("Login failed");
	}
	@Then("Login is successful")
	public void login_is_successful() {
	    System.out.println("Login passed");
	}
	@Given("Enter details")
	public void enter_details(List<String> input)
	{
	    System.out.println("Name entered" + input.get(0));
	    System.out.println("Email entered" + input.get(1));
	    System.out.println("Contact number entered" + input.get(2));
	}
	@When("Click Register")
	public void click_register() {
System.out.println("Click Register");
	}
	@Then("Registration is successful")
	public void registration_is_successful() {
		System.out.println("Registration is successful");
	}
	
	@Given ("Launch Browswer launch browser")
	public void launch_browser() {
		System.out.println("Browser launched");
	}

}
