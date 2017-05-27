Feature: User Registration

Scenario: User registartion with all required fields

Given User is in Register Page
When User enters all required fields for registration
Then User should be successfully registered
And User should see all details in his WelcomeScreen