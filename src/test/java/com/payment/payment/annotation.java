package com.payment.payment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class annotation {
 
	   @Given("^I have open the browser$") 
	   public void openBrowser() { 
		   System.out.println("Holi-Given");
	   } 
		
	   @When("^I open Facebook website$") 
	   public void goToFacebook() { 
		   System.out.println("Holi-When");
	   } 
		
	   @Then("^Login button should exits$") 
	   public void loginButton() { 
		   System.out.println("Holi-Then");

	   } 
}
