package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactUsPage;
import pages.LoginPage;
import pages.SignUpPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.DriverManager;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;


public class ContactUsStepDef {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("User at home page and opens contact form")
    public void user_at_home_page_and_opens_contact_form() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.jsClick(homePage.homePageContactUsButton);
    }

    @When("User fills in contact us form {string} {string} {string} {string}")
    public void user_fills_in_contact_us_form(String name, String email, String subject, String message) {
        ReusableMethods.waitForVisibility(contactUsPage.contactPageGetInTouchText, 5);
        Assert.assertTrue(contactUsPage.contactPageGetInTouchText.isDisplayed());

        ReusableMethods.sendText(contactUsPage.contactPageName, name);
        ReusableMethods.sendText(contactUsPage.contactPageEmail, email);
        ReusableMethods.sendText(contactUsPage.contactPageSubject, subject);
        ReusableMethods.sendText(contactUsPage.contactPageMessage, message);
    }

    @Then("User uploads file and sends form {string}")
    public void user_uploads_file_and_sends_form(String filename) {
        ReusableMethods.sendText(contactUsPage.contactPageUploadFile, filename);

        ReusableMethods.jsClick(contactUsPage.contactPageSubmit);

    }

    @And("User presses ok and goes home")
    public void user_presses_ok_and_goes_home() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
