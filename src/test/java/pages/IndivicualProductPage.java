package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class IndivicualProductPage {

    public IndivicualProductPage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(css = "div[class='product-information'] h2")
    public WebElement indivicualProductName;

    @FindBy(xpath="(//p[normalize-space()='Category: Women > Tops'])[1]")
    public WebElement indivicualProductCategory;

    @FindBy(xpath = "//div[@class='product-details']//p[2]")
    public WebElement indivicualProductAvailability;

    @FindBy(css="div[class='product-information'] span span")
    public WebElement indivicualProductPrice;

    @FindBy(xpath = "//body//section//p[3]")
    public WebElement indivicualProductCondition;

    @FindBy(xpath = "//body//section//p[4]")
    public WebElement indivicualProductBrand;

    @FindBy(xpath = "(//input[@id='quantity'])[1]")
    public WebElement indivicualProductQuantity;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[2]")
    public WebElement indivicualProductAddToCart;

}
