Feature: Registration
  Scenario: Sing-in
#    Given the client enter the Home page
#    When the client click on My Account Menu
#    And enter 'nahuelpaco@gmail.com' in email-adress textbox
#    And enter "Nahuel.123" in password texbox
#    And click Register button
#    Then client registered succesfully and navigate to home page

#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter invalid Email Address in Email-Address textbox
#  5) Enter your own password in password textbox
#  6) Click on Register button
#  7) Registration must fail with a warning message(ie You must enter a valid email address)
  Scenario Outline: Registration Failure
    Given the client enter the Home page
    When the client click on My Account Menu
    And enter '<email>' in register email-adress textbox
    And enter '<password>' in register password texbox
    And click Register button
    Then show registration message error: '<message>'

    Examples:
    |email|password|message|
    |nahuel@mailcom|Nahuel.123|provide a valid email|
    |              |Nahuel.123|provide a valid email|
    |valid@mail.com|          |