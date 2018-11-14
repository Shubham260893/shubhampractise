Feature: Freecrm Login functionality

   @Chrome @Firefox
  Scenario Outline: To test Login
    Given user is on Login page
    When user enters "<username>" and "<password>"
    When user navigate to login page
    When user click on Contacts
    
    Examples:
    |username| password|
    |naveenk | test@123|
    
    
 