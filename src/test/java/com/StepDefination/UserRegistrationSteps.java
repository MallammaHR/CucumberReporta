package com.StepDefination;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UserRegistrationSteps 
{
	@Given("User is on registration page")
	public void user_is_on_registration_page() 
	{
	  System.out.println("user Navigates registration Page");
	}

	@When("User enters the following user details")
	public void user_enters_the_following_user_details(DataTable dataTable)
	{
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e:userList)
		{
			System.out.println(e);
		}
	}

	@Then("user registrtaion should be sucessful")
	public void user_registrtaion_should_be_sucessful()
	{
	    System.out.println("user registration should be sucessful");
	}
}
