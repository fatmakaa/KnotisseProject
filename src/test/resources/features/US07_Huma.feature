@US07
Feature: User views VINTAGE RUGS category, filters, view details and add to cart
  Background:
    Given Go to the website
    When Click on the "VINTAGE RUGS" category on the homepage

  @US07TC01
  Scenario: TC01_The number of products can be listed under Vintage Rugs categories
    And Click on the "RUGS" button
    Then Verify that the user should see the number of products listed under the "RUGS" category

    When Click on the "TULU" button
    Then Verify that the user should see the number of products listed under the "TULU" category

    When Click  on the "KILIMS" button
    Then Verify that the user should see the number of products listed under the "KILIMS" category


    When Click on the "CICIM" button
    Then Verify that the user should see the number of products listed under the "CICIM" category


  @US07TC02
  Scenario: TC02_Verify the filtering options under Vintage Rugs categories
    And Click on the "RUGS" button
    Then Verify that the user sees sorting options like "Default sorting", "Sort by popularity", "Sort by average rating", "Sort by latest", "Sort by price: low to high", and "Sort by price: high to low"
    When Select "Sort by popularity"
    Then Verify that the products are sorted by popularity

    When Select "Sort by average rating"
    Then Verify that the products are sorted by average rating

    When Select "Sort by latest"
    Then Verify that the products are sorted by the latest items

    When Click on the "TULU" button
    Then Verify that the user sees sorting options like "Default sorting", "Sort by popularity", "Sort by average rating", "Sort by latest", "Sort by price: low to high", and "Sort by price: high to low"

    When Select "Sort by popularity"
    Then Verify that the products are sorted by popularity

    When Select "Sort by average rating"
    Then Verify that the products are sorted by average rating

    When Select "Sort by latest"
    Then Verify that the products are sorted by the latest items

    When Click on the "CICIM" button
    Then Verify that the user sees sorting options like "Default sorting", "Sort by popularity", "Sort by average rating", "Sort by latest", "Sort by price: low to high", and "Sort by price: high to low"

    When Select "Sort by popularity"
    Then Verify that the products are sorted by popularity

    When Select "Sort by average rating"
    Then Verify that the products are sorted by average rating

    When Select "Sort by latest"
    Then Verify that the products are sorted by the latest items

    When Click on the "KILIMS" button
    Then Verify that the user sees sorting options like "Default sorting", "Sort by popularity", "Sort by average rating", "Sort by latest", "Sort by price: low to high", and "Sort by price: high to low"

    When Select "Sort by popularity"
    Then Verify that the products are sorted by popularity

    When Select "Sort by average rating"
    Then Verify that the products are sorted by average rating

    When Select "Sort by latest"
    Then Verify that the products are sorted by the latest items
