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

  @US07TC03
  Scenario Outline: TC03_The product detail page displays high-resolution images, detailed description, dimensions, material information, and other relevant details of the seating product.
      And Hover over the "VINTAGE RUGS" category on the homepage
      And Click on the "<category>" button
      And Clicks on any product
      Then Verify that when the user hovers over the product image, it zooms in
      And Verifies that the product detail page displays high-resolution images, detailed description, dimensions, material information, and other relevant details

    Examples:
      | category |
      | Rugs     |
      | Tulu     |
      | Cicim    |
      | Kilims   |

  @US07TC04
  Scenario Outline: TC03_The product detail page displays high-resolution images, detailed description, and availability status
    And Hover over the "VINTAGE RUGS" category on the homepage
    And Click on the "<category>" button
    And Clicks on any product
    Then Verify that the product detail page display sections "New Arrivals", "Product Category", "Product Search", and "Follow us on Instagram"
    And Verify that the "ADD TO QUOTE LIST" button should be visible and clickable
    When Click the "ADD TO QUOTE LIST" button
    Then Verify that the product should be added to the quote list and the quote list should be updated

    Examples:
      | category |
      | Rugs     |
      | Tulu     |
      | Cicim    |
      | Kilims   |


  @US07TC05
  Scenario Outline: TC05_Verify out of stock message and sections visibility on product detail page
    And Hover over the "VINTAGE RUGS" category on the homepage
    And Click on the "<category>" button
    And Clicks on any product
    Then Verify that "Description", "Additional Information", "Related products" and "Search" sections are visible

    Examples:
      | category |
      | Rugs     |
      | Tulu     |
      | Cicim    |
      | Kilims   |