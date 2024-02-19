package com.StepDefination;

import com.AmazonImplementaion.Product;
import com.AmazonImplementaion.Search;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps 
{
	Product product;	
	Search search;
	
	@Given("I have search feild on Amazon page")
	public void i_have_search_feild_on_amazon_page() 
	{
	   System.out.println("Step 1: I am on Search Page");

	}
	
	//@When("I search for a Product with name {string} and price {int}")
	@When("I search for a Product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price)
	{
		System.out.println("Step 2: Search the Product with Name: " + productName + "price:  "+price);
		
		product =new Product(productName,price);
	}


	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) 
	{
		System.out.println("Step 3: product "+productName + "is dispalyed ");
		
		search =new Search();
		String name=search.displayTheproduct(product);
		System.out.println("Searched product is : "+name);
		
		Assert.assertEquals(product.getProductName(), name);
		
	}
	
	@Then("the order id is {int} and username is {string}")
	public void the_order_id_is_and_username_is(Integer id, String username)
	{
	 System.out.println("The order with id :"+id +" "+"and user name is "+username );
	}

	

	
	
}
