@Registration
Feature: Registration
  Background:
    Given the client enter the Home page
    When the client click on My Account Menu

#  1. Registration-Sign-in
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter registered Email Address in Email-Address textbox
#  5) Enter your own password in password textbox
#  6) Click on Register button
#  7) User will be registered successfully and will be navigated to the Home page
  Scenario: Sing-in
    And enter 'asdsd@mail.com' in register email-adress textbox
    And enter "Nahuel.123" in register password texbox
    And click Register button
    Then client registered succesfully and navigate to home page

#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter invalid Email Address in Email-Address textbox
#  5) Enter your own password in password textbox
#  6) Click on Register button
#  7) Registration must fail with a warning message(ie You must enter a valid email address)
  Scenario Outline: Registration Failure
    And enter '<email>' in register email-adress textbox
    And enter '<password>' in register password texbox
    And click Register button
    Then show registration message error: '<message>'

    Examples:
    |email|password|message|
#  2. Registration with invalid Email-id
  |nahuel@mailcom|Nahuel.123|provide a valid email|
#  3. Registration with empty Email-id
  |              |Nahuel.123|provide a valid email|
#  4. Registration with empty password
#    |valid@mail.com|          |
#  5. Registration with empty Email-id & password
#  |              |          |