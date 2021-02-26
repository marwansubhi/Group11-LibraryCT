@modules
Feature: As a user, I should be able to see several modules once I login


  Scenario Outline: Students should have access to 2 modules
    Given the user login as a "<userName>" and "<password>"

    Then the student should see following modules
      | Books           |
      | Borrowing Books |
    @modulesStudent
    Examples:
      | userName   | password   |
      | usernameS1 | passwordS1 |
      | usernameS2 | passwordS2 |
      | usernameS3 | passwordS3 |

  @modulesLibrarian
  Scenario Outline: Students should have access to 2 modules
    Given the user login as a "<userName>" and "<password>"

    Then the librarian should see following modules
      | Dashboard |
      | Users     |
      | Books     |

    Examples:
      | userName   | password   |
      | usernameL | passwordL |

