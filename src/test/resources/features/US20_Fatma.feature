@US20
Feature:US020

  @US20_TC01
  Scenario: The user clicks the "Customer Service" button and You can refer to the "Privacy Policy"
    When user goes to the bottom of the page
    And clicks the "Privacy Policy" link in my Customer Service section
    Then the user should be able to see and click the "Privacy Policy" link in the Customer Service section

  @US20_TC02
  Scenario: By clicking on the "Privacy Policy" link, the user should be directed to a page containing the privacy policy
    When user goes to the bottom of the page
    And clicks the "Privacy Policy" link in my Customer Service section
    Then on the "Privacy Policy" page, the user verifies that the privacy policy text is present

  @US20_TC03
  Scenario: The privacy policy should clearly explain to the user what personal data is collected and how it is used
    When user goes to the bottom of the page
    And  clicks the "Privacy Policy" link in my Customer Service section
    Then verifies that the "Privacy Policy" page clearly and transparently explains how personal data is collected and used