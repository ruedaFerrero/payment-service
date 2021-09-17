Feature: Payment

  Scenario: Accept Payment
    Given I recieve an <payment request>
    And The params are correct
    Then I process and accept the payment