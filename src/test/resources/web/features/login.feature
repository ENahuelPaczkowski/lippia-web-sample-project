@Login
Feature: Login
  Background:
    Given the client enter the Home page

#  1. Log-in with valid username and password.
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter registered username in username textbox
#  5) Enter password in password textbox
#  6) Click on login button
#  7) User must successfully login to the web page
  Scenario: Login Succes
    When the client click on My Account Menu
    And enter 'nahuelpaco' in username texbox 'Nahuel.123' in password textbox and click on login button
    Then login to the web page
    When the client click on My Account Menu

    Scenario Outline: Login Failure
      And enter "<username>" in username texbox "<password>" in password textbox and click on login button
      Then show message error: '<message>'

    Examples:
      |username|password|message|
#    2. Log-in with incorrect username and incorrect password.
      |asfsadasd|asdfsda|username|
#    3. Log-in with correct username and empty password.
      |nahuelpaco|          |Password is required|
#    4. Log-in with empty username and valid password.
      |          |Nahuel.123|Username is required|
#    5. Log-in with empty username and empty password.
      |          |          |Username is required|

#    6. Log-in -Password should be masked
#    1) Open the browser
#    2) Enter the URL “http://practice.automationtesting.in/”
#    3) Click on My Account Menu
#    4) Enter the password field with some characters.
#    5) The password field should display the characters in asterisks or
#    bullets such that the password is not visible on the screen
    Scenario: Mascked password
      And enter 'Nahuel.123' in password texbox
      Then password 'Nahuel.123' should be mascked
