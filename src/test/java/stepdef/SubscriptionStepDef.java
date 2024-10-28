package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utils.ConfigReader;
import utils.DriverManager;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class SubscriptionStepDef {

    HomePage homePage = new HomePage();
//TC10

    @Given("User is at home page TC10")
    public void user_is_at_home_page_TC10() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.scrollToBottom();
    }
    @And("User inputs mail to subscription and sends it {string}")
    public void user_inputs_mail_to_subscription_and_sends_it(String mail) {
        ReusableMethods.sendText(homePage.homePageSusbscribeEmail, mail);
        ReusableMethods.jsClick(homePage.homePageSusbscribeButton);

        ReusableMethods.waitForVisibility(homePage.homePageSusbscribeSuccessMessage, 1);
        Assert.assertTrue(homePage.homePageSusbscribeSuccessMessage.isDisplayed());
    }

//@TC11
    @Given("User goes to Cart page")
    public void user_goes_to_cart_page() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.jsClick(homePage.homePageCartButton);

    }
    @And("User inputs mail to subscription and sends it TC11 {string}")
    public void user_inputs_mail_to_subscription_and_sends_itTC11(String mail) {

        ReusableMethods.scrollToBottom();
        ReusableMethods.sendText(homePage.homePageSusbscribeEmail, mail);
        ReusableMethods.jsClick(homePage.homePageSusbscribeButton);

        ReusableMethods.waitForVisibility(homePage.homePageSusbscribeSuccessMessage, 1);
        Assert.assertTrue(homePage.homePageSusbscribeSuccessMessage.isDisplayed());


    }
}
