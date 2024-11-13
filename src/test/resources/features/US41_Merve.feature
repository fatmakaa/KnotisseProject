@US41
Feature: The user may use the KNOTISSE PRODUCTION category on the website and its subcategories, use filters and add the selected product to the cart.

  Background:
    Then The user hovers over the title Knotisse Production.

  @US41_TC01
  Scenario:User Knotisse Production models Old Yarn Carpets, Pom Pom ,Kilims, Soumak and New Yarn Carpets can filter it as.
    Then The user clicks on "Old Yarn Carpets" and confirms that they have been redirected to the relevant page.
    Then The user clicks on "Pom Pom" and confirms that they have been redirected to the relevant page.
    Then The user clicks on "Kilims" and confirms that they have been redirected to the relevant page.
    Then The user clicks on "Soumak" and confirms that they have been redirected to the relevant page.
    Then The user clicks on "New Yarn Carpets" and confirms that they have been redirected to the relevant page.

  @US41_TC02
  Scenario: The user can filter Knotisse Production models by default sorting, sorting by popularity, sorting by average, latest sorting, sorting by price: low to high, high to low.
    Then The user clicks on Knotisse Production menu
    And The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses "Default sorting", "Sort by popularity", "Sort by average rating", "Sort by latest".

  @US41_TC03
  Scenario: When the user hovers over the product, they can see the quick view option and click on it.
    Then The user clicks on the Quick view of the first product.
    And The user sees the detailed information of the product and the item number.

  @US41_TC04
  Scenario: When the user hovers over the model, they can see the favorite mark, click on it and when clicked, the product should be added to the “Wishlist”.
    Then Clicks on the heart icon on the first product
    Then The user sees the message “Product Added”.
    Then The user clicks on the “Wishlist” (Heart) button on the page.
    And The user confirms that the selected product has been added to the Whishlist.

  @US41_TC05
  Scenario: When the user clicks on the product, they can see the product description, product number and product image.
    Then The user clicks on the Quick view of the first product.
    And The user sees the detailed information of the product and the item number.

  @US41_TC06
  Scenario: When the user clicks the “ADD to QUOTE LIST” button, the selected product is added to the Quote List.
    Then The user clicks on the first product on the knotisse production page.
    Then User clicks on “ADD to QUOTE LIST”.
    Then User clicks Wiew Quote list.
    And Confirms that the selected product has been added to the Quote List.

  @US41_TC07
  Scenario: When the user clicks on the product, they can access the NEW ARRIVALS, FOLLOW US ON INSTAGRAM, PRODUCT CATEGORY and PRODUCT SEARCH sections.
    Then The user clicks on the first product on the knotisse production page.
    Then The user verifies that the page has the Product Category option.
    Then The user verifies that the page has the New Arrivals option.
    Then The user verifies that the page has the Follow us Instagram option.
    And The user verifies that the page has the Product Search option.

  @US41_TC08
  Scenario: The right and left direction buttons on the page that opens when the user clicks on the product work correctly.
    Then The user clicks on the first product on the knotisse production page.
    Then The user clicks the right arrow button
    Then Confirms that the next product has been navigated to.
    Then User clicks the left arrow button
    And Confirms that it goes to the previous product.

  @US41_TC09
  Scenario: When the user clicks the “HOME” button, the home page opens.
    Then The user clicks on the first product on the knotisse production page.
    Then User clicks on the “HOME” button
    And Confirms that it redirects to the home page.

  @US41_TC10
  Scenario: The user can see “OUT OF STOCK” on products that are not in stock.
    And The user verifies that an out of stock product is marked “OUT OF STOCK”.

  @US41_TC11
  Scenario: When the user clicks on a product that is OUT OF STOCK, they can see SOLD on the product.
    Then The user clicks on an out of stock product with the word “OUT OF STOCK”.
    And Verifies that the product is marked “SOLD”.























