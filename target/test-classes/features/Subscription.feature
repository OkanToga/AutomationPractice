Feature:Test Cases about subscription

  @TC10
  Scenario: Verify Subscription in home page
    Given User is at home page TC10
    And User inputs mail to subscription and sends it "togamedya@gmail.com"

  @TC11
  Scenario: Verify Subscription in Cart page
    Given User goes to Cart page
    And User inputs mail to subscription and sends it TC11 "togamedya@gmail.com"