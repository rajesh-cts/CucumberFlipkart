@Flipkart
Feature: Title of your feature
  I want to use this template for my feature file

  @Login
  Scenario: Validate the Login
    Given User open Application
    And User click the login button
    When User enter userName and Password
      | userName   | password   |
      | 7418189318 | Shanvika02 |
    And user click login button
    Then User should be able to see the name on menu
