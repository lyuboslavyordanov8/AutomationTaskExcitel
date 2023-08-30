Feature: Change GST number
  As an app user
  I want to be able to change my GST number
  So that I'm able to apply new changes

  Background:
    Given the user navigates to Excitel app welcome page
    And the user enters his login credentials

    Scenario: Successful change of GST number of subscriber
      When the user updates his GST number
      Then the user Gst number is successfully updated