Feature: US08

  Background:
    Then user clicks on the ANTIQUE RUGS tab


  @US08_TC01
  Scenario: User filters and adds a rug to wishlist.

    Then user should see a list of various rug models
    And user should be able to filter the rug models by Default sorting, Sort by popularity, Sort by average rating, Sort by latest
    And when the user hovers over the product image, should be able to click ADD TO WISHLIST
    And when the user clicks on ADD TO WISHLIST, the product should be added to the wishlist
    And when the user hovers over the product image, should be able to click on Quick View
    And the user clicks the Filter option
    And the user clicks on Black for filtering the colour
    Then the products matching the filter criteria should be listed



  @US08_TC02

  Scenario: Verify product detail page functionality

    And the user clicks on first product
    Then the user should see the details of the product
    And the ADD to QUOTE LIST button should be visible and clickable
    When the user clicks the ADD to QUOTE LIST button
    Then the product should be added to the cart



  @US08_TC03
  Scenario: User navigates to antique rugs and verifies homepage

    Then user should see a list of various rug models
    When the user clicks on the Home link
    Then the homepage should be displayed


