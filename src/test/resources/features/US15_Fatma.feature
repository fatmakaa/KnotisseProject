@US15
Feature: US015

  @US015_TC01
  Scenario: When the user clicks on the email icon in the top right corner of the homepage, they should be redirected to the relevant page
    And email icon on the homepage is clicked
    Then verified that the user is redirected to the email page


  @US015_TC02
  Scenario: When the user clicks on the phone icon in the top right corner of the homepage, they should be redirected to the relevant page
    And phone icon on the homepage is clicked
    Then verified that the user is redirected to the phone page


  @US015_TC03
  Scenario: When the user clicks on the email icon located in the footer of the homepage, they should be redirected to the relevant page
    And email icon is clicked from the footer on the homepage
    Then verified that the user is redirected to the email page in footer


  @US015_TC04
  Scenario: When the user clicks on the phone icon located in the footer of the homepage, they should be redirected to the relevant page
    And phone icon is clicked from the footer on the homepage
    Then verified that the user is redirected to the phone page in footer


  @US015_TC05
  Scenario: When the user clicks on the “Call Us” section located in the footer of the homepage, they should be redirected to the relevant page
    And Call Us icon is clicked from the footer on the homepage
    Then It is verified that the user is redirected to the Call Us page



