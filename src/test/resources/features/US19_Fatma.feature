@US19
Feature:US019

  @US019_TC01
  Scenario: The user should be able to see the My E-mail Preferences link under My Account
    Then Verify that the My E-mail Preferences category is visible under My Account


  @US019_TC02
  Scenario: The user should be able to click on the ‘My E-mail Preferences’ link and view their current e-mail preferences (subscriptions, newsletters, promotions, etc.)
    When user logs in
    And clicks on the My E-mail Preferences link under My Account
    Then verifies that the user is able to view their current e-mail preferences (subscriptions, newsletters, promotions, etc.)


  @US019_TC03
  Scenario: The user should be able to check the relevant boxes to change their preferences (unsubscribe or subscribe)
    When user logs in
    And clicks on the My E-mail Preferences link under My Account
    Then verifies that the user is able to check the relevant boxes to change their preferences (unsubscribe or subscribe)


  @US019_TC04
  Scenario: The user should receive a successful confirmation message after updating their preferences.
    When user logs in
    And clicks on the My E-mail Preferences link under My Account
    And changes the subscription preferences
    And updates the preferences
    Then verifies that the user receives a confirmation message indicating that the changes were successfully saved