Feature: Flipkart login

Scenario Outline: Free CRM Login Test Scenario

Given User hit login URL
When User is in correct login page
Then User enters "<number>" and "<pwd>" 
Then User clicks on login button
Then User is on home page
Then Close the browser

Examples:
	| number | pwd |
	|8983424896 | Mind@7861 |
	| 90900098 | Mihdc |
