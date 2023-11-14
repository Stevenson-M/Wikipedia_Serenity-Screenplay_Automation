Feature: Test valid
           As user i want to validate the wikipedia page

  Scenario: Validate the welcome title of the wikipedia page
   Given User enters the wikipedia page
   Then User should see the welcome title

  Scenario: Validate the search word "Sistema"
    Given User enters the wikipedia page
    When User search for the word "Sistema"
    Then User should see the word "Sistema" in the title

  Scenario: Validate the word "Analisis CEEM" when searching for the word "Sistema"
    Given User enters the wikipedia page
    When User search for the word "Sistema"
    Then User should see the word "Analisis CEEM" when scrolling down the page

  Scenario: Validate Captcha from user creation form
    Given User enters the wikipedia page
    When User enters in the create account link and fill the create account form
    Then The text 'completa este campo' of the captcha is displayed correctly

  Scenario: Validate destokp options on mobile version of wikipedia page
    Given User enters the wikipedia page
    When User enter to the mobile version
    Then User should see the "Escritorio" option on the menu can go to the desktop version

  Scenario: Validate flow of the history of views of the wikipedia page
    Given User enters the wikipedia page
    When User enter in the view history page and select two revisions
    Then User should see two text camps with the revisions selected

