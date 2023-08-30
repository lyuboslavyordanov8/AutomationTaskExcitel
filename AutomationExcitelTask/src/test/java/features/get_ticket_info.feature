Feature: Get ticket info successfully
  As an app user
  I want to be able to get details of 'Billing Enquiries' ticket
  So that I can have the relevant info

  Background:
    Given the user navigates to Excitel app welcome page
    And the user enters his login credentials

  Scenario: Get details of 'Billing Enquiries' ticket
    When the user open a "Payment pickup" ticket
    Then the details for the ticket are displayed
