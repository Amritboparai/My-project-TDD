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
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: add product into cart

  @tag1
  Scenario: login on homepage
  Given User must be on homepage by clicking on Url "https://www.demoblaze.com/"
    Given User Click on login button
    And Login with username and password
    When User click on any of the laptop name
    And Click on ADD TO CARt
    And Click ok on product added  alert
    Then Click on cart
    And Verify that product added

  
