package CucumberBasics;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Basics {
	
	@Given("^Cucumber given annotation$")
	public void GivenCommand()
	{
		System.out.println("GivenCommand");
	}
	
	@When("^Cucumber when annotation$")
	public void WhenCommand()
	{
		System.out.println("whenCommand");
	}
	
	@Then("^Cucumber then annotation$")
	public void ThenCommand()
	{
		System.out.println("thenCommand");
	}

}
