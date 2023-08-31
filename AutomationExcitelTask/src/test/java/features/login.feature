Feature: Successful login
  As an app user
  I want to be able to login
  So that I can explore the app
@LocalAndroid
  Background:
    Given the user navigates to Excitel app welcome page

    Scenario: User is successfully logged in
      When the user enters his login credentials
      Then the user is successfully logged in