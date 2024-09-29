Feature: US05

  Scenario: US05_TC01

    Given the user is on the homepage
    When the user navigates to the seating category section
    Then the "SEATING" category name should be visible

  Scenario: US05_TC02

    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    Then a list of seating products should be displayed

  Scenario: US05_TC03
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    Then the "SEATING" category should be at the same hierarchical level as other categories

  Scenario: US05_TC04
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    And the user hovers over the favorite icon on a product image
    Then the "ADD TO WISHLIST" text should be displayed

  Scenario: US05_TC05
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    And the user clicks the favorite icon on a product image
    Then the product should be added to the wishlist

  Scenario: US05_TC06
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    Then the "POUF & OTTOMAN" section should be visible

  Scenario: US05_TC07
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    Then the number of products should be visible in the results section

  Scenario: US05_TC08
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    Then high-resolution images of seating products should be visible on the page

  Scenario: US05_TC09
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    Then short descriptions of seating products should be visible on the page

  Scenario: US05_TC10
    Given the user is on the homepage
    When the user clicks on the "SEATING" category
    And Verifies that the products should be filtered based on default sorting options
    When the user selects Sort by popularity
    And Verifies that the products should be filtered according to popularity
    When the user selects Sort by average rating
    And Verifies that the products should be filtered according to average rating
    When the user selects Sort by latest
    And  Verifies that the products should be filtered according to the latest




