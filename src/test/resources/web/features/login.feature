@Login
Feature: Login

#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter registered username in username textbox
#  5) Enter password in password textbox
#  6) Click on login button
#  7) User must successfully login to the web page
  Background:
    Given the client enter the Home page

    @NP
  Scenario: Login Succes
    When the client click on My Account Menu
    And enter 'nahuelpaco' in username texbox 'Nahuel.123' in password textbox and click on login button
    Then login to the web page

    Scenario Outline: Login Failure
      When the client click on My Account Menu
      And enter "<username>" in username texbox "<password>" in password textbox and click on login button
      Then show message error: '<message>'

    Examples:
      |username|password|message|
      |asfsadasd|asdfsda|username asfsadasd is not registered|
      |nahuelpaco|          |Password is required|
      |          |Nahuel.123|Username is required|
      |          |          |Username is required|

      @NP
    Scenario: Mascked password
      When the client click on My Account Menu
      And enter 'Nahuel.123' in password texbox
      Then password should be mascked
