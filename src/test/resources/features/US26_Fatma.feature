@US26
Feature:US026

 @US26_TC01
 Scenario: User be able to reach "Services" category under the Contact.
    Then the user clicks on the "Services" category under the Contact button
    And verifies that the user is directed to the Services page and
    And verifies that there is a form displayed for contacting the user

  @US26_TC02
Scenario: User be able to reach "Blog" category under the Contact, and be able to reach to the detail of blogs.
    When user clicks on "Blog" link under the Contact
    Then confirms that the navigated to the "Blog"
    And clicks on the first blog post
    Then verifies that relevant results displayed




