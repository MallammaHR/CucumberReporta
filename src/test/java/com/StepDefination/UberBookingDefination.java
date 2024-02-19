package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingDefination 
{
	
	@Given("User want to select a car type {string}  from Uber Application")
	public void user_want_to_select_a_car_type_from_uber(String carType) 
	{
		System.out.println("Step 1 : "+carType);
	}

	@When("User select car {string} and pickUp point {string} and drop loaction {string}")
	public void user_select_car_and_pick_up_point_and_drop_loaction(String carType, String pickUpLocation, String dropLocation) 
	{
		System.out.println("Step 2 : " + carType+" "+ pickUpLocation + " "+ dropLocation);
	}

	@Then("Driver starts the Journey")
	public void driver_starts_the_journey() 
	{
		System.out.println("Step 3 : ");
	}

	@Then("Driver ends the Joureny")
	public void driver_ends_the_joureny()
	{
		System.out.println("Step 4 : ");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price)
	{
		System.out.println("Step 5 : "+price);	    
	}
}
