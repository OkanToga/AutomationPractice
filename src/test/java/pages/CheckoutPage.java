package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class CheckoutPage {

    public CheckoutPage(){

        PageFactory.initElements(DriverManager.getDriver(),this);

    }
    @FindBy(xpath = "(//h2[normalize-space()='Address Details'])[1]")
    public WebElement checkoutPageAddressDetails;

    @FindBy(xpath = "(//h2[normalize-space()='Review Your Order'])[1]")
    public WebElement checkoutPageOrderDetails;

    @FindBy(xpath = "(//textarea[@name='message'])[1]")
    public WebElement checkoutPageOrderCommentSection;

    @FindBy(xpath = "(//a[normalize-space()='Place Order'])[1]")
    public WebElement checkoutPagePlaceOrderButton;

    @FindBy(xpath = "(//input[@name='name_on_card'])[1]")
    public WebElement checkoutPageNameOnCard;

    @FindBy(xpath = "(//input[@name='card_number'])[1]")
    public WebElement checkoutPageCardNumber;

    @FindBy(xpath = "(//input[@placeholder='ex. 311'])[1]")
    public WebElement checkoutPageCVC;

    @FindBy(xpath = "(//input[@placeholder='MM'])[1]")
    public WebElement checkoutPageMM;

    @FindBy(xpath = "(//input[@placeholder='YYYY'])[1]")
    public WebElement checkoutPageYYYY;

    @FindBy(xpath = "(//button[normalize-space()='Pay and Confirm Order'])[1]")
    public WebElement checkoutPagePayAndConfirmOrderButton;

    @FindBy(xpath = "(//b[normalize-space()='Order Placed!'])[1]")
    public WebElement checkoutPageOrderSuccessfullyPlaced;




}
