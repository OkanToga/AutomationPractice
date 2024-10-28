Feature:Test Cases about products

  @TC8
  Scenario: Verify All Products and product detail page
    Given User opens products page
    When User in page views product
    Then User sees product info

  @TC9
  Scenario: Search Product
    Given User opens products page TC9
    When User searches a product "Fancy Green Top"
    Then User sees searched products

  @TC12
  Scenario: Add Products in Cart
    Given User opens products page TC12
    When User adds first product to cart
    And User adds second product to cart
    Then User checks the cart

  @TC13
  Scenario: Verify Product quantity in Cart
    Given User opens a product from home page
    When User makes quantity 4 and adds to cart
    Then User checks cart product quantity

  @TC15
  Scenario: View Category Products
    Given User clicks women category and a sub category
    And User clicks men category and a sub category

  @TC16
  Scenario: Search Products and Verify Cart After Login
    Given User opens products page TC16
    When User searches a product TC16 "tshirt"
    Then User adds searched product to cart
    And User checks cart
    Then User logs in and check cart "togamedya@gmail.com" "123"
