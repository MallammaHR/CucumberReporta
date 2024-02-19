@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab
Given User want to select a car type "Sedan"  from Uber Application
When User select car "Sedan" and pickUp point "Bangalore" and drop loaction "Pune"
Then Driver starts the Journey
And  Driver ends the Joureny
Then User pays 1000 USD

@Smoke @Regression
Scenario: Booking Cab SUV

Given User want to select a car type "SUV"  from Uber Application
When User select car "Sedan" and pickUp point "Bangalore" and drop loaction "Hyderbad"
Then Driver starts the Journey
And  Driver ends the Joureny
Then User pays 1500 USD

@Prod
Scenario: Booking Cab MINI

Given User want to select a car type "MINI"  from Uber Application
When User select car "Sedan" and pickUp point "Pune" and drop loaction "Mumbai"
Then Driver starts the Journey
And  Driver ends the Joureny
Then User pays 100 USD