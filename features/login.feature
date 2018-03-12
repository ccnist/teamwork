Feature: Test Scenario for Jenkins

  @now
  Scenario: Verify user login
    Given I navigated to home
    Then I should be navigated to home page
    When I select "Get Trains"
    Then I should see list of trains available between stations
