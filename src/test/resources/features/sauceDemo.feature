Feature: Sause Demo Functionalities
  			This is to automate Sauce Demo Functionality

  #go to website
  #Click on the first 'Click me'  button and Accept the alert.
  #let's wait the alert to be present first, then interact with it
  #now it's time to handle the alert
  #accept is for anything confirmative like: Yes, Okay, Confirm, Accept etc....
  
  #this is an example of test case defined as a user step
  
Scenario: Sauce demo valid login
    Given user is on the login page
    When user enters a valid username and password
    And user clicks on the sign in button
    Then user is logged  successfully
    
 
