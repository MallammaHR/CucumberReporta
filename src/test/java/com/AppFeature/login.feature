Feature: Login Feature

Scenario Outline: Login fail - possible Combination
			Given User is on the Applictaion landing page
			When User click on Sign in button
			Then User is dispalyed login screen
			When User enters "<UserName>" in the username feild
			And User entersnthe "<Password>" in the password feild 
			Then User click Sign in button
			Then User gets login faild error message 
			
					Examples: 
								| UserName          |    Password          |
								| inccorectusername |    123425            |
								| mallumanish				|    incorrectpassword | 
								| inccorectusername |  	 incorrectpassword |
						
