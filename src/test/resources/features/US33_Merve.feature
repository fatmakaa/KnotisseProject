@US33
Feature:   It should not be possible to register on the site with previously registered information.

  Scenario: The user must not be able to register on the site with previously registered information.
    Given The user clicks on the Login button.
    Then The user writes his her previously registered e-mail address in the mail address box in the register section.
    Then Clicks the Register button.
    And The user will receive the message "Error: An account is already registered with your email address. Please log in." message.
