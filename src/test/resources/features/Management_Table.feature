
Feature: user management table columns names

  Scenario: user management table columns names

    Given the user login as a librarian and be on the home page

    When  the user click users module

    Then user should see the following
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
