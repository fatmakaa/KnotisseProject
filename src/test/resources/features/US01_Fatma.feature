Feature: US01
  Background:
    When user navigates to the relevant website.

  @US01_TC01
  Scenario: US01_TC01
    Then Clicks on Catalogue.
    Then Verifies that related products show up.
    Then Navigates to the New Arrivals link.
    Then Clicks on Catalogue again.
     And Verifies that related products show up.

  @US01_TC02
  Scenario: US01_TC02
    Then Clicks on Catalogue.
    And Verifies that product details are clearly displayed.

  @US01_TC03
  Scenario: US01_TC03
    Then Clicks on Catalogue.
    Then Clicks on the Default sorting menu on the catalog page.
    Then Selects the Sort by average rating option.
    And Verifies that the sorting is done based on average rating.


  @US01_TC04
  Scenario: US01_TC04
    Then Clicks on Catalogue.
    Then Clicks on the Default sorting menu on the catalog page.
    Then Selects the Sort by latest option.
    And Verifies that the sorting is done based on the newest products.


  @US01_TC05
  Scenario: US01_TC05
    Then Clicks on Catalogue.
    Then Clicks on the Default sorting menu on the catalog page.
    Then Selects the Sort by popularity sorting option.
    And Verifies  that the sorting is done based on the most popular products.

