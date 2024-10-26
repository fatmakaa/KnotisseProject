@US38
Feature: The user should be able to successfully update their information.

  Background:
    Given The user clicks on the Login button.

  @US38_TC01
  Scenario: The user successfully updates their account information.
    Then The user enters the email they registered with in the email field of the Login section.
    Then The user enters the password they previously set.
    Then The user clicks on My Account
    Then The user clicks on Account Details
    Then The user fills in the required fields First name, Last name, Email address
    Then The user clicks on Save changes
    And The user should see the message "Account details changed successfully."

  @US38_TC02
  Scenario: The username and surname fields should not accept digits.
    Then The user enters the email they registered with in the email field of the Login section.
    Then The user enters the password they previously set.
    Then The user clicks on My Account
    Then The user clicks on Account Details
    Then In the First Name and Last Name fields, the user enters digits
    Then The user clicks on Save changes
    And  The system should not accept the information change, as digits are not allowed in the First Name and Last Name fields


