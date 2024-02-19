Feature: Amazoon Order Page
		In order to check my  order details
		As a registered user
		I want to specify the feature of the order details

Background:
			Given a Registered user exists
			Given user should be on the Amazon login page
			When user enters username
			And user enters paswword
			And user click on login button
			Then user navigate to order page
		
Scenario: Check the previous order details
			When user clicks on Order link
			Then user checks the previous order details
			
Scenario: Check the open order details
			When user click on Open Order link
			Then user checks the open order details
			
Scenario: Check the cancelled order details
			When user click on Cancelled Order link
			Then user checks the cancelled  order details
	
		
	