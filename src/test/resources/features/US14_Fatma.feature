@US14
Feature: US014


  @US014_TC01
  Scenario: When the user clicks on the Instagram social media icon located in the top right corner of the home page, they should be redirected to the relevant account.

    Then clicks on the Instagram icon from the home page
    And verifies that the user is redirected to the Instagram page

  @US014_TC02
  Scenario: When the user clicks on the Pinterest social media icon located in the top right corner of the home page, they should be redirected to the relevant account.

    Then clicks on the Pinterest icon from the home page
    And verifies that the user is redirected to the Pinterest page

  @US014_TC03
  Scenario: When the user clicks on the YouTube social media icon located in the top right corner of the home page, they should be redirected to the relevant account.

    Then clicks on the YouTube icon from the home page
    And verifies that the user is redirected to the YouTube page


  @US014_TC04
  Scenario: When the user clicks on the Facebook social media icon located in the footer of the home page, they should be redirected to the relevant account.

    Then clicks on the Facebook icon via Home page > footer
    And verifies that the user is redirected to the Facebook page

  @US014_TC05
  Scenario: When the user clicks on the Instagram social media icon located in the footer of the home page, they should be redirected to the relevant account.

    Then clicks on the Instagram icon via Home page > footer
    And verifies that the user is redirected to the Instagram page in footer

  @US014_TC06
  Scenario: When the user clicks on the Pinterest social media icon located in the footer of the home page, they should be redirected to the relevant account.

    Then clicks on the Pinterest icon via Home page > footer
    And verifies that the user is redirected to the Pinterest page in footer

  @US014_TC07
  Scenario: When the user clicks on the YouTube social media icon located in the footer of the home page, they should be redirected to the relevant account.

    Then clicks on the YouTube icon via Home page > footer
    And verifies that the user is redirected to the YouTube page in footer
