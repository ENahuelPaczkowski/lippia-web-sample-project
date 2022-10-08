Feature: Registration
  Scenario: Sing-in
    Given the client enter the Home page
    When the client click on My Account Menu
    And enter 'nahuelpaco@gmail.com' in email-adress textbox
    And enter "Nahuel.123" in password texbox
    And click Register button
    Then client registered succesfully and navigate to home page