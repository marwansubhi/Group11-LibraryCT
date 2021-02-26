Feature: As a user I should be able to login to the library app

  Background: User already on login page
  @loginStudent
    Scenario Outline: Verify Students login
      Given the student login as a "<userName>" and "<password>"
      Then the "<expectedUser>" on "<expectedPage>"

      Examples:
      |userName|password|expectedUser|expectedPage|
      |usernameS1|passwordS1|books|Test Student 50|
      |usernameS2|passwordS2|books|Test Student 51|
      |usernameS3|passwordS3|books|Test Student 52|

