package stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utils.ConfigReader;
import utils.DriverManager;
import utils.ReusableMethods;
import static org.junit.Assert.assertTrue;

public class PlaceOrderStepDef {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    IndivicualProductPage indivicualProductPage = new IndivicualProductPage();
    CartPage cartPage = new CartPage();
    SignUpPage signUpPage = new SignUpPage();
    LoginPage loginPage = new LoginPage();
    CheckoutPage checkoutPage = new CheckoutPage();


//TC14
    @Given("User adds a product to cart")
    public void user_adds_a_product_to_cart() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.wait(1000);
        ReusableMethods.jsScroll(homePage.homePageFirstProductOverlay);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(productsPage.productsPageScrolledProductAddToCartButton);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(productsPage.productsPageContinueShoppingButton);

    }
    @When("User opens cart and clicks proceed")
    public void user_opens_cart_and_clicks_proceed() {
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(homePage.homePageCartButton);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(cartPage.cartPageProceedToCheckout);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(cartPage.cartPageRegisterOrLogin);
    }
    @Then("User creates a new account {string} {string}")
    public void user_creates_a_new_account(String username, String Email) {
        ReusableMethods.sendText(loginPage.loginPageRegisterUsername,username);
        ReusableMethods.sendText(loginPage.loginPageRegisterEmail,Email);
        ReusableMethods.jsClick(loginPage.loginPageRegisterSubmit);
    }
    @And("User fills in register form {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void user_fills_in_register_form(String Password, String FirstName, String LastName, String Company, String Address, String Address2, String City, String State, String Zip, String Phone) {

        ReusableMethods.jsClick(signUpPage.signUpPageFemaleGenderButton);
        ReusableMethods.sendText(signUpPage.signUpPagePassword, Password);
        ReusableMethods.selectRandomDateOfBirth(
                signUpPage.signUpPagedayDropdown,
                signUpPage.signUpPagemonthDropdown,
                signUpPage.signUpPageyearDropdown);
        ReusableMethods.jsClick(signUpPage.signUpPageNewsletterBox);
        ReusableMethods.jsClick(signUpPage.signUpPageOfferBox);
        ReusableMethods.sendText(signUpPage.signUpPageFirstName, FirstName);
        ReusableMethods.sendText(signUpPage.signUpPageLastName, LastName);
        ReusableMethods.sendText(signUpPage.signUpPageCompany,Company);
        ReusableMethods.sendText(signUpPage.signUpPageAddress1,Address);
        ReusableMethods.sendText(signUpPage.signUpPageAddress2,Address2);
        ReusableMethods.selectRandomOptionFromDropdown(signUpPage.signUpPageCountryDropDown);
        ReusableMethods.sendText(signUpPage.signUpPageState,State);
        ReusableMethods.sendText(signUpPage.signUpPageCity,City);
        ReusableMethods.sendText(signUpPage.signUpPageZipcode,Zip);
        ReusableMethods.sendText(signUpPage.signUpPageMobileNumber,Phone);

        ReusableMethods.jsClick(signUpPage.signUpPageCreateAccountButton);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(signUpPage.signUpPageContinueButton);

        ReusableMethods.waitForVisibility(homePage.homePageLoggedInText, 2);
        Assert.assertTrue(homePage.homePageLoggedInText.isDisplayed());
    }
    @When("User re-opens cart and clicks proceed")
    public void user_reopens_cart_and_clicks_proceed() {
        ReusableMethods.jsClick(homePage.homePageCartButton);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(cartPage.cartPageProceedToCheckout);
        ReusableMethods.wait(1000);

    }
    @Then("User checks and places order {string}")
    public void user_checks_and_places_order(String message) {
        ReusableMethods.waitForVisibility(checkoutPage.checkoutPageAddressDetails, 1);
        Assert.assertTrue(checkoutPage.checkoutPageAddressDetails.isDisplayed());
        ReusableMethods.waitForVisibility(checkoutPage.checkoutPageOrderDetails, 1);
        Assert.assertTrue(checkoutPage.checkoutPageOrderDetails.isDisplayed());

        ReusableMethods.sendText(checkoutPage.checkoutPageOrderCommentSection,message);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(checkoutPage.checkoutPagePlaceOrderButton);
    }
    @When("User enters payment details and gives order {string} {string} {string} {string} {string}")
    public void user_enters_payment_details_and_gives_order(String cardName,String cardNumber,String cardCVC,String cardMM, String cardYYYY) {
        ReusableMethods.sendText(checkoutPage.checkoutPageNameOnCard, cardName);
        ReusableMethods.sendText(checkoutPage.checkoutPageCardNumber, cardNumber);
        ReusableMethods.sendText(checkoutPage.checkoutPageCVC, cardCVC);
        ReusableMethods.sendText(checkoutPage.checkoutPageMM, cardMM);
        ReusableMethods.sendText(checkoutPage.checkoutPageYYYY, cardYYYY);

        ReusableMethods.jsClick(checkoutPage.checkoutPagePayAndConfirmOrderButton);

        ReusableMethods.waitForVisibility(checkoutPage.checkoutPageOrderSuccessfullyPlaced, 2);
        Assert.assertTrue(checkoutPage.checkoutPageOrderSuccessfullyPlaced.isDisplayed());

    }
    @And("User deletes their account TC14")
    public void user_deletes_their_account_TC14() {
        ReusableMethods.wait(4000);
        ReusableMethods.jsClick(homePage.homePageDeleteAccountButton);

        ReusableMethods.waitForVisibility(signUpPage.signUpPageAccountDeletedText, 5);
        Assert.assertTrue(signUpPage.signUpPageAccountDeletedText.isDisplayed());

        ReusableMethods.jsClick(signUpPage.signUpPageContinueButton);
    }
}



