Feature: Calculating billing Amount

Scenario Outline: billing Amount 
	Given user is on billing page 
	When user enters the billing  amount "<billingAmount>"
	When user enters the tax amount "<taxAmount>"
	And user enters calculate button
	Then it gives final amount "<finalAmount>"
	
	Examples:
				| billingAmount | taxAmount | finalAmount |
				| 1000          | 10        | 1010        |
				| 500						| 20        | 5020        |
				| 100           | 5.5       | 105.5       |