@RegressionTest
Feature: Title of your feature
  I want to validate login
@RegressionTest
  Scenario: successful login with valid credentials
    Given user launch chrome browser
    When user opens url "https://www.facebook.com"
    And user enters email as "rhasan@gmail.com" and password as "Abc!234"
    And user click on login
   	Then page title should be "Facebook - log in or sign up"
   	And close browser
   	
   	
  @RegressionTest 	
 	Scenario Outline: successful login with valid credentials
    Given user launch chrome browser
    When user opens url "https://www.facebook.com"
    And user enters email as "<email>" and password as "<password>"
    And user click on login
   	Then page title should be "Facebook - log in or sign up" 
   	And close browser
   	
   	Examples:
   	|email|password|
   	|rhasan123@gmail.com|Pqer!trt77|
   	|syed.ali@yahoo.com|Qwjfjkdh7|

#command+control+j
