package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class ProductsPage {

    public ProductsPage(){

        PageFactory.initElements(DriverManager.getDriver(),this);

    }

    @FindBy(xpath = "(//h2[normalize-space()='All Products'])[1]")
    public WebElement productsPageAllProductsText;

    @FindBy(xpath = "(//div[@class='col-sm-9 padding-right'])[1]")
    public WebElement productsPageProductList;

    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    public WebElement productsPageViewFirstProduct;

    @FindBy(xpath = "(//input[@id='search_product'])[1]")
    public WebElement productsPageProductSearchBox;

    @FindBy(xpath = "(//i[@class='fa fa-search'])[1]")
    public WebElement productsPageProductSearchButton;

    @FindBy(xpath = "(//h2[normalize-space()='Searched Products'])[1]")
    public WebElement productsPageProductSearchResultsText;

    @FindBy(xpath ="(//div[@class='features_items'])[1]")
    public WebElement productsPageProductSearchResults;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[1]")
    public WebElement productsPageFirstProductBox;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    public WebElement productsPageScrolledProductAddToCartButton;

    @FindBy(xpath = "(//button[normalize-space()='Continue Shopping'])[1]")
    public WebElement productsPageContinueShoppingButton;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[2]")
    public WebElement productsPageSecondProductBox;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]")
    public WebElement productsPageScrolledProductAddToCartButton2;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[1]")
    public WebElement productsPageFirstProductAddToCart;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[3]")
    public WebElement productsPageSecondProductAddToCart;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[5]")
    public WebElement productsPageThirdProductAddToCart;



}
