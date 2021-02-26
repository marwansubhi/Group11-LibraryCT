Feature: Borrowed books list feature
  As a user (student) I should be able to see my list of borrowed books

  Background: User is already on the login page
    Given User is on the login page

  Scenario Outline: User can lend an available book
    When User logs in using "<email>" and "<password>"
    And User lands on Dashboard page
    And User goes to Books module
    And User lends a book if it's available
    Then User should see the Success message

    Examples:
      | email             | password |
      | student50@library | doN2rYs3 |
      | student51@library | Hab4pCHI |
      | student52@library | l43OOwss |


  Scenario Outline: User can see the list of his borrowed books
    When User logs in using "<email>" and "<password>"
    And User lands on Dashboard page
    And User goes to Books module
    And User lends a book if it's available
    And User goes to the Borrowing Book module
    And User's name is "<name>"
    Then User can see the borrowed book in the list of his borrowed books

    Examples:
      | email             | password | name            |
      | student50@library | doN2rYs3 | Test Student 50 |
      | student51@library | Hab4pCHI | Test Student 51 |
      | student52@library | l43OOwss | Test Student 52 |


