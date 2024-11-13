@US27
Feature: The user should be able to view the information of the company's physical stores using the “Our Stores” link.

  @US27_TC01
  Scenario: Kullanıcı, Contact sayfasında Our Stores bağlantısını görebilmelidir.
    Then  Verify that the "Contact" page is available in the information area at the bottom of the page.
    Then  Verify that the "Our Stores" link is clickable by scrolling down the Contact page.

  @US27_TC02
  Scenario: By clicking on the “Our Stores” link, the user should be redirected to a page with the addresses, contact details and opening hours of the company's physical stores.
    Then Verify that by clicking on the Our Stores link at the bottom of the page, the user is redirected to a page with the addresses, contact information and opening hours of the company's physical stores.

  @US27_TC03
  Scenario: The stores page should have features such as the ability to show the location on the map for each store.
    Then Verify that the stores page has features such as the ability to show the location on the map for each store.