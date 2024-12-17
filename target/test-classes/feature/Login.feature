
Feature: Login to the application.
Background:

Given Launch Browswer launch browser


@Login
  Scenario: Login with valid credential
    Given Enter valid credential "validusername",valipasword1234
    
    When Click Login
   
    Then Login is successful
    @Login
 Scenario Outline: Login with invalid credential
    Given Enter invalid credential <username>,<password>
    
    When Click Login
   
    Then Login is unsuccessful
    
Examples: 
|username|password|
|123|pwd1|
|456|pwd2|

@Signup
Scenario:Signup

Given: Load registration page
And Enter details
|Valarmathi|
|jvalar@gmail.com|
|1234567890|

When Click Register
Then Registration is successful