@Flipkart
Feature: SearchProduct
  I want to use this template for my feature file

  @Login
  Scenario: Validate the Product Search
    Given User open Application
    When User search the "Mobile"
    And User click the search
    Then User should be able to see the search result "
