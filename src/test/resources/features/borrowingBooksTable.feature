Feature:Check borrowing books feature


  Scenario: borrowing books tabe columns names

    #Given User on the login page
    When User login as a student
    And  User click Borrowing Books module
    Then User should see the following column names:

      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |


