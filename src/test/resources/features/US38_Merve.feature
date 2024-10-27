@US38
Feature: The user should be able to successfully update their information.

  Background:
    Given The user clicks on the Login button.
    Then The user enters the email they registered with in the email field of the Login section.
    Then The user enters the password they previously set.
    Then The user clicks on My Account
    Then The user clicks on Account Details

  @US38_TC01
  Scenario: The user successfully updates their account information.
    Then The user fills in the required fields First name, Last name, Email address
    Then The user clicks on Save changes
    And The user should see the message "Account details changed successfully."

  @US38_TC02
  Scenario: The username and surname fields should not accept digits.
    Then In the First Name and Last Name fields, the user enters digits
    Then The user clicks on Save changes
    And  The system should not accept the information change, as digits are not allowed in the First Name and Last Name fields

  @US38_TC03
  Scenario: The user has successfully changed their password.
    Then In the Password Change section, they enter their Current Password.
    Then Next, they enter a New Password in the corresponding field.
    Then In the Confirm New Password field, they enter the same new password again.
    Then The user clicks on Save changes
    And The user should see the message "Account details changed successfully."

  @US38_TC04
  Scenario: When a user enters their current password incorrectly, any changes should not be saved.
    Then User enters the current password in the Current Password field, but enters it incorrectly.
    Then User enters a new password in the New Password field.
    Then User confirms the new password by entering it again in the Confirm New Password field.
    Then The user clicks on Save changes
    And System displays an error message saying "Your current password is incorrect."
