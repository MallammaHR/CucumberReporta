Feature: login page
			In orer to test the login page 
			As a registered user
			I want to specify the login conditions
			
#Scenario: Amzon login page
#			Given user is on Amzon login page		
#			Given user sign in button present or not 
#			When user click on sign in button 
#			Then user can see logn Screen
#			When user enters username "mallu@gmail.com" in username feild
#			When user enter  password "magdgak6t" in password feild 
#			When user clicks on signin button
#			Then user is on Home page
#			Then user can see Title of the home page "Amzon"

			
			
Scenario: Amzon login page
			Given user is on Amzon login page		
			And  user sign in button present or not 
			When user click on sign in button 
			Then user can see login Screen
			When user enters username "mallu@gmail.com" in username feild
			And user enter  password "magdgak6t" in password feild 
			And  user clicks on signin button
			Then user is on Home page
			And  user can see Title of the home page "Amzon"
			But sign in button is not presnent 