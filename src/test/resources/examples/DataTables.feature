Feature: Working with data tables

  Scenario: List of authors with their names and dates of birth
    Given I have the following authors
    | firstName   | lastName | dateOfBirth |
    | Annie M. G. | Schmidt  | 1911-03-20  |
    | Roald       | Dahl     | 1916-09-13  |
    | Astrid      | Lindgren | 1907-11-14  |

    Scenario: Airport codes
      Given the following airports are known in the database
        | KMSY | Louis Armstrong New Orleans International Airport |
        | KSFO | San Francisco International Airport               |
        | KSEA | Seattle Tacoma International Airport              |
        | KJFK | John F. Kennedy International Airport             |

    Scenario: Historic football results
      Given the following past Old Firm results
      |      | Celtic | Rangers |
      | 1957 | 7      | 1       |
      | 1894 | 0      | 5       |
      | 1925 | 5      | 0       |
      | 1960 | 1      | 5       |

