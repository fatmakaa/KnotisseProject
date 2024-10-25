@US38
Feature: The user should be able to successfully update their information.

  @US38_TC01
  Scenario: The user successfully updates their account information.
    Given The user clicks on the Login button.
    Then The user enters the email they registered with in the email field of the Login section.
    Then The user enters the password they previously set.
    Then The user clicks on My Account
    Then The user clicks on Account Details
    Then The user fills in the required fields First name, Last name, Email address
    Then The user clicks on Save changes
    And The user should see the message "Account details changed successfully."