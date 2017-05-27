Feature: Login Action

@login
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page	
	And User enters "<name>" and "<password>"
	Then Message displayed Login Successfully - "<expected>" 
	
Examples:
    | name            |password    | expected |
    | medha@gmail.com |  test123   | Login    |
    | kiran@gmail.com |  test456   | Login   |
	
	
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully

Scenario: Invalid Login
Given User is on LoginPage
When User enters valid userid and invalid password
Then User should see an error message - Username or password is incorrect-please try again