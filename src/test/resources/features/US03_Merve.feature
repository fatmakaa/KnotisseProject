Feature: An unregistered user can browse products on the Knottise website (both from the top and bottom of the page)

  @US03_TC01
  Scenario: The user searches for a specific type of product and views the relevant results.
    Given The user navigates to the related website.
    Then The user clicks on the search icon.
    Then The user types "Anatolian Kilim Rug" into the search box.
    Then The user clicks the search button.
    Then The user sees the total number of results displayed in the window that opens.
    Then The user clicks on the first product.
    Then The user views the details of the selected product.
    Then The user returns to the search box and searches for another specific product.
    And The user clicks on one of the available options and views the details of the product that opens.