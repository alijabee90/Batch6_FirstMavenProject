@regression @login_tests
Feature: Sause Demo Functionalities
  			This is to automate Sauce Demo Functionality

  #go to website
  # type username and password
  #click signin
  #verify logged in sussessfully
  
  
  
  #background allows us to reuse one ore more given steps for each scenario in the feature file. 
  #if we put steps in background, those steps will be applied to each of every sscenarios. 
  Background: 
   Given user is on the login page
  #this is an example of test case defined as a user step
  @smoke_test @valid_login
	Scenario: Sauce demo valid login
	    
	    When user enters a valid username and password
	    And user clicks on the sign in button
	    Then user is logged  successfully
	    
	 @invalid_user_login
	  Scenario: Sauce demo invalid username login
	    
	    When user enters invalid username and valid password
	    And user clicks on the sign in button
	    Then user should not be logged in
	    @invalid_password_login
		Scenario: Sauce demo valid user with invalid password
		
		When user enters valid username and invalid password
		And user clicks on the sign in button
		Then user should not be logged in
		
		
# this scenario outline test runs as manytimes as the row of datat in the example table 		
@outline
	Scenario Outline: Invalid login test
	
	When user enters  username "<username>" and password "<password>"
	And user clicks on the sign in button
	Then user should not be logged in
	
	Examples:
	|    username   |   password  |
	| hellohell     | secret_sauce|
	| standard_user | HelloHello  | 
	|               | secret_sauce|
	|standard_user  |             |
	|               |             |
		
		
		
		
		
		
		
		
		
		
		
		
		#diifrent formst of defining the scenario as user
		    #Scenario: as a user, I should be able to log in with valid cred
		     #Given I am on the login page
		     #When I enter a valid username and valid password
		     #And I click on the sigin button
		     #Then I am logged in successfully
		 