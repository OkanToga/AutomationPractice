package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class LoginPage {
    public LoginPage() {

        PageFactory.initElements(DriverManager.getDriver(),this);

    }
    @FindBy(css="div[class='login-form'] h2")
    public WebElement loginPageLoginText;

    @FindBy(xpath="(//input[@placeholder='Name'])[1]")
    public WebElement loginPageRegisterUsername;

    @FindBy(xpath="(//input[@data-qa='signup-email'])[1]")
    public WebElement loginPageRegisterEmail;

    @FindBy(xpath = "(//button[normalize-space()='Signup'])[1]")
    public WebElement loginPageRegisterSubmit;

    @FindBy(xpath="(//input[@data-qa='login-email'])[1]")
    public WebElement loginPageLoginEmail;

    @FindBy(xpath ="(//input[@placeholder='Password'])[1]")
    public WebElement loginPageLoginPassword;

    @FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
    public WebElement loginPageLoginSubmit;

    @FindBy(xpath="(//p[normalize-space()='Your email or password is incorrect!'])[1]")
    public WebElement loginPageInvalidLoginError;

    @FindBy(xpath="(//p[normalize-space()='Email Address already exist!'])[1]")
    public WebElement loginPageInvalidEmailError;

}
