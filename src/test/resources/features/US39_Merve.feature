@US39
Feature: When the user clicks on the wishlist, they should be able to see all the products they have liked. (Wishlist)

  Background:
    Given The user clicks on the Login button.
    Then The user enters the email they registered with in the email field of the Login section.
    Then The user enters the password they previously set.
    And Clicks on vintage rugs

  @US39_TC01
  Scenario: The user can add products to the wishlist and, by clicking "Browse Wishlist," can view all the products they have added.
    Then Clicks on the first product
    Then Clicks Add to wishlist
    Then Click on “browse wishlist” that appears after clicking.
    Then He she sees the product he she added in the wishlist.
    And It should be able to delete the added product by clicking on the cross icon.

  @US39_TC02
  Scenario: The user can add products to the wishlist. They should be able to see the products they added to the wishlist by clicking on the heart icon.
    Then Adds the first two products to the wishlist via the heart icon next to the product.
    Then Clicks on the heart icon
    Then In the window that opens, it should be able to see the products it has added before.
    And Verifies that it can delete the products it has added by clicking on the cross icon

  @US39_TC03
  Scenario: User can add products to wishlist. By clicking on My account Wishlist, they should be able to see the products they have added to the wishlist.
    Then Adds the first two products to the wishlist via the heart icon next to the product.
    Then Go to My account and click on wishlist.
    Then In the window that opens, it should be able to see the products it has added before.
    And Verifies that it can delete the products it has added by clicking on the cross icon



