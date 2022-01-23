#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)\

#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: F2
  I want to use this template for my feature file
	Background:
			Given user Launched to HomeSceen
  
  Scenario: Launch To Home Screen and navigate to Explore Page Go to All-access
    When user Navigate to Explore page
    Then user is on Explore page
    
   Scenario: Launch To Home Screen and navigate to Explore Page Go to All-access
    When user Navigate to Kids page
    Then user is on Kids page
    
   Scenario: Launch To Home Screen and navigate to Explore Page Go to All-access
    When user Navigate to Kids page
    Then user is on Kids2 page


#@smoke
Scenario Outline: Launch To Home Screen SmokeTest
    When user Navigate to <pageName> page
    Then user is on <pageName> page
    
    Examples: 
    | pageName |
    | Explore  |  
    | Kids     |
    
    
    
  