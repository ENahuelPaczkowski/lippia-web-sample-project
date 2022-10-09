Feature: My account
#1) Open the browser
#2) Enter the URL “http://practice.automationtesting.in/”
#3) Click on My Account Menu
#4) Enter registered username in username textbox
#5) Enter password in password textbox
#6) Click on login button
#7) User must successfully login to the web page
#8) Click on Myaccount link which leads to Dashboard
#9) User must view Dashboard of the site

  Scenario: Dashboard
    Given the client enter the Home page
    When the client click on My Account Menu
    And enter "nahuelpaco" in username texbox "Nahuel.123" in password textbox and click on login button
    Then login to the web page
    When the client click on My Account Menu
    And leads to Dashboard of the site
