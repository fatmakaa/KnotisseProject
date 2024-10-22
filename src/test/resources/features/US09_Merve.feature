@US09
Feature: The user should be able to access the contact information by clicking the "Contact" link at the top of the page.

  Scenario: The user should be able to access the contact information by clicking the "Contact" link at the top of the page.
    Given The visibility and clickability of the Contact button are verified.
    Then It is verified that when the Contact button is clicked, a page containing a contact form opens.
    Then The visibility of the name, email, phone number, and message fields in the contact form, as well as the ability to enter information into them, is verified.
    Then It is verified that a message can be sent by entering the name, email, phone number, and message details into the contact form.
