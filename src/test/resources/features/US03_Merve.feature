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

  @US03_TC02
  Scenario: The user can perform a search using the 'ALL' option from the dropdown without registering, access the products and product details on the results page, and see the total number of results.
    Given The user navigates to the related website.
    Then The user clicks on the search icon.
    Then With the All option selected from the dropdown, the user clicks the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product.
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by latest".
