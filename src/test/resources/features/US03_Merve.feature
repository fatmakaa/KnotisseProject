@US03
Feature: An unregistered user can browse products on the Knottise website both from the top and bottom of the page

  Background:
    Given The user navigates to the related website.
    Then The user clicks on the search icon.

  #@US03_TC01
  #Scenario: The user searches for a specific type of product and views the relevant results.
  #  Then The user types "Anatolian Kilim Rug" into the search box.
  #  Then The user clicks the search button.
  #  Then The user sees the total number of results displayed in the window that opens.
  #  Then The user clicks on the first product.
  #  Then The user views the details of the selected product.
  #  Then The user returns to the search box and searches for another specific product.
  #  And The user clicks on one of the available options and views the details of the product that opens.

  @US03_TC02
  Scenario: The user can perform a search using the 'ALL' option from the dropdown without registering, access the products and product details on the results page, and see the total number of results.
    Then While on the "All" option, the user clicks on the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product with the title "Authentic"
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by latest".

  @US03_TC03
  Scenario: The user can search via the dropdown using the 'ANTIQUE RUGS' option without registering, access the products and their details on the resulting page, and see the total number of results.
    Then While on the "ANTIQUE RUGS" option, the user clicks on the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product with the title "Antique"
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by latest".

  @US03_TC04
  Scenario: The user can perform a search using the 'KNOTISSE PRODUCTION' option from the dropdown without registering, access the products and their details on the results page, and see the total number of results displayed.
    Then While on the "KNOTISSE PRODUCTION" option, the user clicks on the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product with the title "Handmade"
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by average rating".

  @US03_TC05
  Scenario: The user can perform a search using the 'SEATING' option from the dropdown without registering, access the products and their details on the results page, and see the total number of results displayed.
    Then While on the "SEATING" option, the user clicks on the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product with the title "Handmade"
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by latest".

  @US03_TC06
  Scenario: The user can perform a search using the 'THROW PILLOWS' option from the dropdown without registering, access the products and their details on the results page, and see the total number of results displayed.
    Then While on the "THROW PILLOWS" option, the user clicks on the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product with the title "Throw Pillow"
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by latest".

  @US03_TC07
  Scenario: The user can perform a search using the 'UPHOLSTERY' option from the dropdown without registering, view the products and their details on the resulting page, and see the total number of results.
    Then While on the "UPHOLSTERY" option, the user clicks on the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product with the title "Upholstery"
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by latest".

  @US03_TC08
  Scenario: The user can search using the 'VINTAGE' option from the dropdown without registering, access the products and product details on the resulting page, and see the total number of results.
    Then While on the "VINTAGE" option, the user clicks on the search button.
    Then On the results page, the user sees the total number of search results.
    Then The user clicks on any product with the title "Authentic"
    Then The user accesses the details of the selected product.
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Sort by latest".





