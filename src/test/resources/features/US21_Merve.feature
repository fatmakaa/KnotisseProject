@US21
Feature:The user should be able to view the shipping and return policies by using the 'Shipping & Returns' link.

  Background:
    Given The user scrolls to the bottom of the page
    Then The user clicks the Shipping & Returns link in the Customer Service section

  @US21_TC01
  Scenario: The user should be able to see the 'Shipping & Returns' link on the 'Customer Service' page.
    And It is verified that the user is on the Shipping & Returns page within the Service section

  @US21_TC02
  Scenario: When the 'Shipping & Returns' link is clicked, the user should be redirected to a page that explains the shipping and return policies
    Then The user verifies that the Shipping & Returns page contains text explaining the shipping and return policies

  @US21_TC03
  Scenario: The shipping and return policies should clearly explain to the user how orders are shipped and how the return processes work
    Then Verifies that the shipping and return policies on the Shipping & Returns page clearly explain how orders are shipped and how the return processes work