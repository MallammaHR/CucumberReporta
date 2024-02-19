Feature: Amazon Search
@Smoke
Scenario: Search a Product

Given I have search feild on Amazon page
When I search for a Product with name "Apple Mac Book Pro" and price 1000
Then Product with name "Apple Mac Book Pro" should be displayed 
Then the order id is 1234 and username is "MalluMani"

@Regression
Scenario: Search a Product iPhone

Given I have search feild on Amazon page
When I search for a Product with name "iPhone" and price 1200
Then Product with name "iPhone" should be displayed 
Then the order id is 5467 and username is "Manish"