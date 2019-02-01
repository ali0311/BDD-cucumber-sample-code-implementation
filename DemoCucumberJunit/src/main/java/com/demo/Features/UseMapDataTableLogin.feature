Feature: Flipkart login

@EndToEndTesting
Scenario: Free CRM Login Test Scenario

Given User hit login URL
When User is in correct login page
Then User enters username and password
| 8983424896 | Mind@7861 | 
Then User clicks on login button
Then User is on home page
Then user search items
| items |
| Jeans |
| Shirts |
| Mobiles |
Then Close the browser

@DemoTest
Scenario: This is second scenario
Given Print second scenario

@EndToEndTesting @DemoTest
Scenario: This is third scenario
Given Print third scenario

