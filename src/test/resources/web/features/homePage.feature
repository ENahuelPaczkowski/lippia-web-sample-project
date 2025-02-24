@Home
Feature: Home page
  Background:
    Given the client enter the Home page
    When the client click on Shop Menu
    And the client on Home menu button

#  1. Home Page with three Sliders only
#1) Open the browser
#2) Enter the URL “http://practice.automationtesting.in/”
#3) Click on Shop Menu
#4) Now click on Home menu button
#5) Test whether the Home page has Three Sliders only
#6) The Home page must contains only three sliders
  Scenario: Home page with three Sliders only
    Then the client verify that Home page has '3' Sliders only

#  2. Home page with three Arrivals only
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Now click on Home menu button
#  5) Test whether the Home page has Three Arrivals only
#  6) The Home page must contains only three Arrivals
  Scenario: Home page with three Arrivals only
    Then the client verify tha Home page has '3' arrivals only