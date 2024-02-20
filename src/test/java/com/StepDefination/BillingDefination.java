package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingDefination 
{
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	

	@Given("user is on billing page")
	public void user_is_on_billing_page() 
	{
	    
	}
	
	@When("user enters the billing  amount {string}")
	public void user_enters_the_billing_amount(String billingAmount)
	{
		 this.billingAmount=Double.parseDouble(billingAmount);
	}


	@When("user enters the tax amount {string}")
	public void user_enters_the_tax_amount(String taxAmount)
	{
	    this.taxAmount=Double.parseDouble(taxAmount);
	}

	@When("user enters calculate button")
	public void user_enters_calculate_button() 
	{
	    
	}

	@Then("it gives final amount {string}")
	public void it_gives_final_amount(String expectedfinalAmount) 
	{
		this.finalAmount=this.billingAmount+this.taxAmount;
		System.out.println("Expected final Amount: "+Double.parseDouble(expectedfinalAmount));
		
		System.out.println("Actual final amount is :"+this.finalAmount);
	 
	  Assert.assertTrue(this.finalAmount== Double.parseDouble(expectedfinalAmount));
	}


}

