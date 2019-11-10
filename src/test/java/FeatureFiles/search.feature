Feature: User is going to search for vegetable and proceed to checkout
  Scenario: User will search for items and validate the results
    Given User will navigate to the website
    When User will search for "cucumber"
    Then "cucumber" result will be displayed

  Scenario Outline: Search for items and then move to the checkout
    Given User will navigate to the website
    When User will search for "<Name>" vegetable
    And User will add items to the cart
    And User proceed to the checkout page
    Then User will verify selected "<Name>" items are displayed in the checkout page
    Examples:
      |Name|
      |Beetroot|
      |Apple|
      |Cucumber|

    @last
    Scenario: Add 2 or more items to the cart and validate results
      Given User will navigate to the website
      When  User will add more than one item to the cart
      Then  User proceed to the checkout page
      And User will verify selected items are displayed in the checkout page