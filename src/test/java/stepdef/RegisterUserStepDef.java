package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.SignUpPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.DriverManager;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class RegisterUserStepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();


    @Given("User is at home page for register")
    public void user_at_home_page_register() {

        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

    }

    @When("User is on the registration page")
    public void User_on_registration_page(){
        ReusableMethods.jsClick(homePage.homePageLoginButton);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/login"));

    }
    @And("User enters valid registration details {string} {string}")
    public void user_enters_valid_registration_details(String Username, String Email) {
        ReusableMethods.sendText(loginPage.loginPageRegisterUsername, Username);
        ReusableMethods.sendText(loginPage.loginPageRegisterEmail, Email);
        ReusableMethods.jsClick(loginPage.loginPageRegisterSubmit);
    }
    @Then("User fills in registration form {string}")
    public void user_submits_the_registration_form(String Password) {
        ReusableMethods.jsClick(signUpPage.signUpPageFemaleGenderButton);
        ReusableMethods.sendText(signUpPage.signUpPagePassword, Password);
        /*ReusableMethods.selectSpecificDate(autoExerciseSignUpPage.signUpPagedayDropdown, "16",
                autoExerciseSignUpPage.signUpPagemonthDropdown, "1",
                autoExerciseSignUpPage.signUpPageyearDropdown, "2002");*/
        ReusableMethods.selectRandomDateOfBirth(
                signUpPage.signUpPagedayDropdown,
                signUpPage.signUpPagemonthDropdown,
                signUpPage.signUpPageyearDropdown);
        ReusableMethods.jsClick(signUpPage.signUpPageNewsletterBox);
        ReusableMethods.jsClick(signUpPage.signUpPageOfferBox);

    }

    @And("User fills in address information and submits {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void user_submits_the_address_information_and_submits(String FirstName, String LastName, String Company, String Address, String Address2, String City, String State, String Zip, String Phone) {
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


    }
    @When("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        ReusableMethods.waitForVisibility(signUpPage.signUpPageAccountCreatedText, 5);
        Assert.assertTrue(signUpPage.signUpPageAccountCreatedText.isDisplayed());

        ReusableMethods.jsClick(signUpPage.signUpPageContinueButton);

        ReusableMethods.waitForVisibility(homePage.homePageLoggedInText, 5);
        Assert.assertTrue(homePage.homePageLoggedInText.isDisplayed());

    }
    @Then("User deletes their account")
    public void user_deletes_their_account() {
        ReusableMethods.jsClick(homePage.homePageDeleteAccountButton);

        ReusableMethods.waitForVisibility(signUpPage.signUpPageAccountDeletedText, 5);
        Assert.assertTrue(signUpPage.signUpPageAccountDeletedText.isDisplayed());

        ReusableMethods.jsClick(signUpPage.signUpPageContinueButton);
    }


//TC5
    @Given("User is at home page TC5")
    public void user_is_at_home_page_TC5() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));
    }

    @When("User is on the registration page TC5")
    public void user_is_on_the_registration_page_TC5() {
        ReusableMethods.jsClick(homePage.homePageLoginButton);

        ReusableMethods.waitForVisibility(loginPage.loginPageLoginText, 3);
        Assert.assertTrue(loginPage.loginPageLoginText.isDisplayed());
    }

    @Then("User enters invalid registration details {string} {string}")
    public void user_enters_invalid_registration_details(String wrongUsername, String wrongEmail) {
        ReusableMethods.sendText(loginPage.loginPageRegisterUsername, wrongUsername);
        ReusableMethods.sendText(loginPage.loginPageRegisterEmail, wrongEmail);
        ReusableMethods.jsClick(loginPage.loginPageRegisterSubmit);

    }
    @And("User sees error message TC5")
    public void user_sees_error_message_TC5() {
        ReusableMethods.waitForVisibility(loginPage.loginPageInvalidEmailError, 3);
        Assert.assertTrue(loginPage.loginPageInvalidEmailError.isDisplayed());


    }


}
