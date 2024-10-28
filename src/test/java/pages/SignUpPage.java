package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class SignUpPage {

    public SignUpPage() {

        PageFactory.initElements(DriverManager.getDriver(),this);

    }

    @FindBy(xpath="(//input[@id='id_gender1'])[1]")
    public WebElement signUpPageMaleGenderButton;

    @FindBy(xpath="(//input[@id='id_gender2'])[1]")
    public WebElement signUpPageFemaleGenderButton;

    @FindBy(xpath ="(//input[@id='password'])[1]")
    public WebElement signUpPagePassword;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement signUpPagedayDropdown;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement signUpPagemonthDropdown;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement signUpPageyearDropdown;

    @FindBy(xpath="(//input[@id='newsletter'])[1]")
    public WebElement signUpPageNewsletterBox;

    @FindBy(xpath="(//input[@id='optin'])[1]")
    public WebElement signUpPageOfferBox;

    @FindBy(xpath="(//input[@id='first_name'])[1]")
    public WebElement signUpPageFirstName;

    @FindBy(xpath = "(//input[@id='last_name'])[1]")
    public WebElement signUpPageLastName;

    @FindBy(xpath = "(//input[@id='company'])[1]")
    public WebElement signUpPageCompany;

    @FindBy(xpath="(//input[@id='address1'])[1]")
    public WebElement signUpPageAddress1;

    @FindBy(xpath = "(//input[@id='address2'])[1]")
    public WebElement signUpPageAddress2;

    @FindBy(xpath = "(//input[@id='state'])[1]")
    public WebElement signUpPageState;

    @FindBy(xpath = "(//input[@id='city'])[1]")
    public WebElement signUpPageCity;

    @FindBy(xpath = "(//input[@id='zipcode'])[1]")
    public WebElement signUpPageZipcode;

    @FindBy(xpath = "(//input[@id='mobile_number'])[1]")
    public WebElement signUpPageMobileNumber;

    @FindBy(xpath = "(//button[normalize-space()='Create Account'])[1]")
    public WebElement signUpPageCreateAccountButton;

    @FindBy(xpath="(//select[@id='country'])[1]")
    public WebElement signUpPageCountryDropDown;

    @FindBy(xpath="(//b[normalize-space()='Account Created!'])[1]")
    public WebElement signUpPageAccountCreatedText;

    @FindBy(xpath="(//a[normalize-space()='Continue'])[1]")
    public WebElement signUpPageContinueButton;

    @FindBy(css="section#form>div>div>div>h2>b")
    public WebElement signUpPageAccountDeletedText;



}
