Feature: Aggregated snapshots of prior visits, procedures or medications

  Scenario: Retrieve a patient's records
    Given I have a patient's full name
    When I enter patient's name
    Then Screen should display the history of prior visits, procedures, and medications
