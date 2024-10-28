package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class CartPage {

    public CartPage(){

        PageFactory.initElements(DriverManager.getDriver(),this);

    }

    @FindBy(xpath = "(//a[normalize-space()='Blue Top'])[1]")
    public WebElement cartPageFirstProductName;

    @FindBy(xpath = "(//a[normalize-space()='Men Tshirt'])[1]")
    public WebElement cartPageSecondProductName;

    @FindBy(xpath = "(//p[normalize-space()='Rs. 500'])[1]")
    public WebElement cartPageFirstProductPrice;

    @FindBy(xpath = "(//p[@class='cart_total_price'][normalize-space()='Rs. 500'])[1]")
    public WebElement cartPageFirstProductTotalPrice;

    @FindBy(xpath = "(//button[@class='disabled'][normalize-space()='1'])[1]")
    public WebElement cartPageFirstProductQuantity;

    @FindBy(xpath = "(//p[contains(text(),'Rs. 400')])[1]")
    public WebElement cartPageSecondProductPrice;

    @FindBy(xpath = "(//p[@class='cart_total_price'][normalize-space()='Rs. 400'])[1]")
    public WebElement cartPageSecondProductTotalPrice;

    @FindBy(xpath = "(//button[@class='disabled'][normalize-space()='1'])[2]")
    public WebElement cartPageSecondProductQuantity;

    @FindBy(xpath ="(//button[normalize-space()='4'])[1]")
    public WebElement cartPageQuantityCheckTC13;

    @FindBy(xpath = "(//a[normalize-space()='Proceed To Checkout'])[1]")
    public WebElement cartPageProceedToCheckout;

    @FindBy(xpath = "(//u[normalize-space()='Register / Login'])[1]")
    public WebElement cartPageRegisterOrLogin;

    @FindBy(xpath="(//tr[@id='product-2'])[1]")
    public WebElement cartPageFirstProduct;

    @FindBy(xpath = "(//tr[@id='product-28'])[1]")
    public WebElement cartPageSecondProduct;

    @FindBy(xpath = "(//tr[@id='product-28'])[1]")
    public WebElement cartPageThirdProduct;

}
