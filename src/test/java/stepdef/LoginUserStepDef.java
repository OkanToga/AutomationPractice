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

public class LoginUserStepDef {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();

    @Given("User is at home page for login")
    public void user_at_home_page_login() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));
    }

    @When("User is on the login page")
    public void user_is_on_the_login_page() {
        ReusableMethods.jsClick(homePage.homePageLoginButton);
        ReusableMethods.waitForVisibility(loginPage.loginPageLoginText, 3);
        Assert.assertTrue(loginPage.loginPageLoginText.isDisplayed());

    }
    @Then("User input account info {string} {string}")
    public void user_input_account_info(String email, String password) {
        ReusableMethods.sendText(loginPage.loginPageLoginEmail, email);
        ReusableMethods.sendText(loginPage.loginPageLoginPassword, password);
        ReusableMethods.jsClick(loginPage.loginPageLoginSubmit);
    }
    @When("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        ReusableMethods.waitForVisibility(homePage.homePageLoggedInText, 3);
        Assert.assertTrue(homePage.homePageLoggedInText.isDisplayed());
    }
    @And("User deletes their logged in account")
    public void user_deletes_their_logged_in_account() {

        ReusableMethods.jsClick(homePage.homePageDeleteAccountButton);

        ReusableMethods.waitForVisibility(signUpPage.signUpPageAccountDeletedText, 5);
        Assert.assertTrue(signUpPage.signUpPageAccountDeletedText.isDisplayed());
        ReusableMethods.jsClick(signUpPage.signUpPageContinueButton);
    }


//TC3
    @Given("User is at home page TC3")
    public void user_is_at_home_page_TC3() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));
    }

    @When("User is on the login page TC3")
    public void user_is_on_the_login_page_TC3() {
        ReusableMethods.jsClick(homePage.homePageLoginButton);

        ReusableMethods.waitForVisibility(loginPage.loginPageLoginText, 3);
        Assert.assertTrue(loginPage.loginPageLoginText.isDisplayed());
    }
    @Then("User input account info TC3 {string} {string}")
    public void user_input_account_info_tc3(String wrongEmail, String wrongPassword) {
        ReusableMethods.sendText(loginPage.loginPageLoginEmail, wrongEmail);
        ReusableMethods.sendText(loginPage.loginPageLoginPassword, wrongPassword);
        ReusableMethods.jsClick(loginPage.loginPageLoginSubmit);
    }

    @And("User sees error message")
    public void user_sees_error_message() {
        ReusableMethods.waitForVisibility(loginPage.loginPageInvalidLoginError, 3);
        Assert.assertTrue(loginPage.loginPageInvalidLoginError.isDisplayed());

    }



//TC4
    @Given("User is at home page TC4")
    public void user_is_at_home_page_TC4() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));
    }

    @When("User is on the login page TC4")
    public void user_is_on_the_login_page_TC4() {
        ReusableMethods.jsClick(homePage.homePageLoginButton);

        ReusableMethods.waitForVisibility(loginPage.loginPageLoginText, 3);
        Assert.assertTrue(loginPage.loginPageLoginText.isDisplayed());
    }

    @Then("User input account info TC4 {string} {string}")
    public void user_input_account_info_tc4(String correctEmail, String correctPassword) {
        ReusableMethods.sendText(loginPage.loginPageLoginEmail, correctEmail);
        ReusableMethods.sendText(loginPage.loginPageLoginPassword, correctPassword);
        ReusableMethods.jsClick(loginPage.loginPageLoginSubmit);
    }

    @When("User should be logged in successfully TC4")
    public void user_should_be_logged_in_successfully_TC4() {
        ReusableMethods.waitForVisibility(homePage.homePageLoggedInText, 3);
        Assert.assertTrue(homePage.homePageLoggedInText.isDisplayed());
    }

    @And("User logs out")
    public void user_logs_out() {
        ReusableMethods.jsClick(homePage.homePageLogoutButton);

        ReusableMethods.waitForVisibility(loginPage.loginPageLoginText, 3);
        Assert.assertTrue(loginPage.loginPageLoginText.isDisplayed());
    }


}
