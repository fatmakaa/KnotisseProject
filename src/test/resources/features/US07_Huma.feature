@US07
Feature: User views VINTAGE RUGS category, filters, view details and add to cart
  Background:
    Given Go to the website

  @US07TC01
  Scenario Outline: TC01_The number of products can be listed under Vintage Rugs categories
    When Hover over the "VINTAGE RUGS" category on the homepage
    And Click on the "<subcategory>" button
    Then Verify that the user should see the number of products listed

    Examples:
      | subcategory |
      | Rugs        |
      | Tulu        |
      | Kilims      |
      | Cicim       |


  @US07TC02
  Scenario Outline: TC02_Verify the filtering options under Vintage Rugs categories
    When Hover over the "VINTAGE RUGS" category on the homepage
    And Click on the "<category>" button
    Then Verify that the user sees sorting options like "Default sorting", "Sort by popularity", "Sort by average rating" and "Sort by latest"
    When Select "Sort by popularity"
    Then Verify that the products are "Sort by popularity"
    When Select "Sort by average rating"
    Then Verify that the products are "Sort by average rating"
    When Select "Sort by latest"
    Then Verify that the products are "Sort by latest"

    Examples:
      | category |
      | Rugs     |
      | Tulu     |
      | Cicim    |
      | Kilims   |
