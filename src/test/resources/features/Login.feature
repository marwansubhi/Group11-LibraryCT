Feature:Login feature
  As I user, I should be able to login


  @librarian
  Scenario:  Login as a librarian
    Given librarian on the login page
    When I login as a librarian
    Then dashboard should be displayed
  @student
  Scenario:  Login as a student
    Given student on the login page
    When  login as a student
    Then books should be displayed

