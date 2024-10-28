package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(DriverManager.getDriver(),this);

    }

    @FindBy(xpath = "(//a[normalize-space()='Signup / Login'])[1]")
    public WebElement homePageLoginButton;

    @FindBy(css="header#header>div>div>div>div:nth-of-type(2)>div>ul>li:nth-of-type(10)>a")
    public WebElement homePageLoggedInText;

    @FindBy(xpath="(//a[normalize-space()='Delete Account'])[1]")
    public WebElement homePageDeleteAccountButton;

    @FindBy(xpath ="(//a[normalize-space()='Logout'])[1]")
    public WebElement homePageLogoutButton;

    @FindBy(xpath="(//a[normalize-space()='Contact us'])[1]")
    public WebElement homePageContactUsButton;

    @FindBy(xpath = "(//a[@href='/products'])[1]")
    public WebElement homePageProducts;

    @FindBy(xpath ="(//input[@id='susbscribe_email'])[1]")
    public WebElement homePageSusbscribeEmail;

    @FindBy(xpath ="(//i[@class='fa fa-arrow-circle-o-right'])[1]")
    public WebElement homePageSusbscribeButton;

    @FindBy(xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement homePageSusbscribeSuccessMessage;

    @FindBy(xpath = "(//a[normalize-space()='Cart'])[1]")
    public WebElement homePageCartButton;

    @FindBy(xpath = "(//a[contains(text(),'View Product')])[3]")
    public WebElement homePageViewThirdProductPage;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[1]")
    public WebElement homePageFirstProductOverlay;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[2]")
    public WebElement homePageSecondProductOverlay;

    @FindBy(xpath="(//h4[@class='panel-title'])[1]")
    public WebElement homePageWomenCategory;

    @FindBy(xpath = "(//a[normalize-space()='Saree'])[1]")
    public WebElement homePageWomenSareeCategory;

    @FindBy(xpath = "(//h4[@class='panel-title'])[2]")
    public WebElement homePageMenCategory;

    @FindBy(xpath = "(//a[normalize-space()='Jeans'])[1]")
    public WebElement homePageMenJeansCategory;

    @FindBy(xpath = "(//h2[normalize-space()='Women - Saree Products'])[1]")
    public WebElement homePageWomenSareeProductsText;

    @FindBy(xpath="(//h2[normalize-space()='Men - Jeans Products'])[1]")
    public WebElement homePageMenJeansProductsText;

    @FindBy(xpath = "//p[text()='İzin ver']")
    public WebElement homePagePopup;

}
