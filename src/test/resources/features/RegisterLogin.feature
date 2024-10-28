Feature: User Registration and Login Functions


      @TC1
      Scenario: Register User
        Given User is at home page for register
        When User is on the registration page
        And User enters valid registration details "Beyza" "Beyza@gmail.com"
        Then User fills in registration form "123"
        And User fills in address information and submits "beyza" "özer" "marmaraüni" "yalovada bir ev" "münevver ablanın ev" "marmara bölgesi" "yalova" "77100" "5434468279"
        When User should be registered successfully
        Then User deletes their account

      @TC2
      Scenario: Login User with correct email and password
        Given User is at home page for login
        When User is on the login page
        Then User input account info "okan@hotmail.com" "123"
        When User should be logged in successfully
        And User deletes their logged in account

      @TC3
      Scenario: Login User with incorrect email and password
        Given User is at home page TC3
        When User is on the login page TC3
        Then User input account info TC3 "emre@hotmail.com" "12345"
        And User sees error message

      @TC4
      Scenario: Logout User
        Given User is at home page TC4
        When User is on the login page TC4
        Then User input account info TC4 "togamedya@gmail.com" "123"
        When User should be logged in successfully TC4
        And User logs out

      @TC5
      Scenario:  Register User with existing email
        Given User is at home page TC5
        When User is on the registration page TC5
        Then User enters invalid registration details "togamedya" "togamedya@gmail.com"
        And  User sees error message TC5

      @TC6
      Scenario: Contact Us Form
        Given User at home page and opens contact form
        When User fills in contact us form "beyza" "beyza@gmail.com" "hallediyorum" "mezuniyette en güzel ben olucam ve her şey mükemmel geçicek ve asla problem oluşmucak ve keyifli vakit geçircem"
        Then User uploads file and sends form "C:/Users/empty/OneDrive/Masaüstü/Stuff/üzgün-behzo.jpg"
        And User presses ok and goes home