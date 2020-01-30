Feature: Validate products in the cart

  @TestCase1
  Scenario Outline: Validate that the product selected by the customer is added and displayed correctly in the cart.
    Given That user enters in website
    When  He searches the product <product>
    And Adds the product to the shopping cart
    And Click on the option show cart
    Then the user validates that the product <product> is added and displayed correctly in the shopping cart

    Examples:
      |product                       |
      |Galaxy A20s Negro + Chip Entel|