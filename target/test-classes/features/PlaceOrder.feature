Feature:Test Cases about Place Order
  @TC14
  Scenario: Place Order Register while Checkout
    Given User adds a product to cart
    When User opens cart and clicks proceed
    Then User creates a new account "beyza" "beyza@gmail.com"
    And User fills in register form "123" "beyza" "özer" "marmaraüni" "yalovada bir ev" "münevver ablanın ev" "marmara bölgesi" "yalova" "77100" "5434468279"
    When User re-opens cart and clicks proceed
    Then User checks and places order "Kargom ne zamana gelir"
    When User enters payment details and gives order "beyza" "321123" "111" "09" "1453"
    And User deletes their account TC14
