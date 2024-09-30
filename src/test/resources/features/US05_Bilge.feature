Feature: US05
  Background:
    Given the user is on the homepage

  @US05_TC01
  Scenario:  Seating category name is clearly visible on the homepage


    When the user navigates to the seating category section
    Then the "SEATING" category name should be visible

  @US05_TC02
  Scenario: Seating products are listed when the "SEATING" category is clicked

    When the user clicks on the "SEATING" category
    Then a list of seating products should be displayed

  @US05_TC03
  Scenario: Seating category should be the same hierarchical level as other categories

    When the user clicks on the "SEATING" category
    Then the "SEATING" category should be at the same hierarchical level as other categories

  @US05_TC04
  Scenario:Add to wishlist text appears when hovering over the favorite icon on a product image

    When the user clicks on the "SEATING" category
    And the user hovers over the favorite icon on a product image
    Then the "ADD TO WISHLIST" text should be displayed

  @US05_TC05
  Scenario:Product is added to the wishlist when clicking the favorite icon on a product image

    When the user clicks on the "SEATING" category
    And the user clicks the favorite icon on a product image
    Then the product should be added to the wishlist

  @US05_TC06
  Scenario:Pouf & Ottoman section is visible in the dropdown when hovering over the Seating category

    When the user clicks on the "SEATING" category
    Then the "POUF & OTTOMAN" section should be visible

  @US05_TC07
  Scenario: The number of products is displayed in the results section after clicking on Seating category

    When the user clicks on the "SEATING" category
    Then the number of products should be visible in the results section

  @US05_TC08
  Scenario: High-resolution images of seating products are visible on the page

    When the user clicks on the "SEATING" category
    Then high-resolution images of seating products should be visible on the page

  @US05_TC09
  Scenario:Short descriptions of seating products are visible on the page

    When the user clicks on the "SEATING" category
    Then short descriptions of seating products should be visible on the page

  @US05_TC10
  Scenario:The user can filter seating products by default, popularity, average rating, and latest options

    When the user clicks on the "SEATING" category
    And Verifies that the products should be filtered based on default sorting options
    When the user selects Sort by popularity
    And Verifies that the products should be filtered according to popularity
    When the user selects Sort by average rating
    And Verifies that the products should be filtered according to average rating
    When the user selects Sort by latest
    And  Verifies that the products should be filtered according to the latest




