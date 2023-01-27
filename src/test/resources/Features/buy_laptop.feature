Feature: successfully buy a laptop
  Me as a course automator
  I need to buy a laptop
  To validate that a laptop is successfully bought

  Scenario: buy a laptop successfully
    Given I login a user
    When I buy a laptop
    Then I validate a laptop was bought