package com.MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmzonHook 
{
	
	
	@Before("@Smoke")
	public void setUp_browser(Scenario sc)
	{
		System.out.println("Launch the ChromeBrowser");
		System.out.println("The Scenario Name is:"+sc.getName());
		System.out.println(sc.getStatus());
		//int i=9/0;
		}
	
	@Before(order = 2)
	public void setUp_Url(Scenario sc)
	{
		System.out.println("Launch the Luanch URL");
		System.out.println(sc.getStatus());
	}
	@After("@Smoke")
	public void tearDown_close()
	{
		System.out.println("Close the Browser");
	}
	@After("@Smoke")
	public void tearDown_logOut()
	{
		System.out.println("logout the Browser");
	}
	
	@BeforeStep
	public void takeCreenShot() 
	{
		System.out.println("Take ScreenShot");
	}
	
	@AfterStep
	public void refrehPage()
	{
		System.out.println("refresh The page");
		
	}
}

