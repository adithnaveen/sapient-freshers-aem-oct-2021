@sanity @login
Feature: login feature 

Scenario: 
Given the site is up http://somesite.com  
And user clicks on login link 
When the login page is shown 
Then enter username 
And password in the provided box 
Then click on submit 
Then user should be taken to home page 