Feature: As a librarian , I should be able to see book records


  @record
  Scenario: Verify that the default values in Users page
    #Given User on the login page
    And User login as a librarian
    When User clicks on "Users" link
    And Show records default value should be 10
    Then Show records should have following options
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |