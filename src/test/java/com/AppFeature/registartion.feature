Feature: User Registration

Scenario: user registration with differnt data
			Given User is on registration page
			When User enters the following user details
			| Mallu | Manish | mall@gmail.com| 99999 | Bangalore | 
			|tom | peter | tom@gmail.com | 909090 | US |
			| lisa | Jhon | lisa@gmail.com |804710 | Uk |
			Then user registrtaion should be sucessful
			
Scenario: user registration with differnt data with coloumns
			Given User is on registration page
			When User enters the following user details with columns
			|firstName | LastName | email | 	phone | City |
			| Mallu | Manish | mall@gmail.com| 99999 | Bangalore | 
			|tom | peter | tom@gmail.com | 909090 | US |
			| lisa | Jhon | lisa@gmail.com |804710 | Uk |
			Then user registrtaion should be sucessful		