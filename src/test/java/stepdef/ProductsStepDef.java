package stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.*;
import utils.ConfigReader;
import utils.DriverManager;
import utils.ReusableMethods;
import static org.junit.Assert.assertTrue;

public class ProductsStepDef {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    IndivicualProductPage indivicualProductPage = new IndivicualProductPage();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();

//TC8
    @Given("User opens products page")
    public void user_opens_products_page() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.jsClick(homePage.homePageProducts);

    }

    @When("User in page views product")
    public void user_in_page_views_product() {
        ReusableMethods.waitForVisibility(productsPage.productsPageAllProductsText, 3);
        Assert.assertTrue(productsPage.productsPageAllProductsText.isDisplayed());

        ReusableMethods.waitForVisibility(productsPage.productsPageProductList, 3);
        Assert.assertTrue(productsPage.productsPageProductList.isDisplayed());

        ReusableMethods.jsClick(productsPage.productsPageViewFirstProduct);
    }

    @Then("User sees product info")
    public void user_sees_product_info() {
        ReusableMethods.waitForVisibility(indivicualProductPage.indivicualProductName, 3);
        Assert.assertTrue(indivicualProductPage.indivicualProductName.isDisplayed());
        Assert.assertTrue(indivicualProductPage.indivicualProductCategory.isDisplayed());
        Assert.assertTrue(indivicualProductPage.indivicualProductAvailability.isDisplayed());
        Assert.assertTrue(indivicualProductPage.indivicualProductCondition.isDisplayed());
        Assert.assertTrue(indivicualProductPage.indivicualProductPrice.isDisplayed());
        Assert.assertTrue(indivicualProductPage.indivicualProductBrand.isDisplayed());

    }

//TC9
    @Given("User opens products page TC9")
    public void user_opens_products_page_TC9() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.jsClick(homePage.homePageProducts);

        ReusableMethods.waitForVisibility(productsPage.productsPageAllProductsText, 3);
        Assert.assertTrue(productsPage.productsPageAllProductsText.isDisplayed());

    }
    @When("User searches a product {string}")
    public void user_searches_a_product(String productName) {
        ReusableMethods.sendText(productsPage.productsPageProductSearchBox, productName);
        ReusableMethods.jsClick(productsPage.productsPageProductSearchButton);

        ReusableMethods.waitForVisibility(productsPage.productsPageProductSearchResultsText, 2);
        Assert.assertTrue(productsPage.productsPageProductSearchResultsText.isDisplayed());

    }
    @Then("User sees searched products")
    public void user_sees_searched_products() {

        ReusableMethods.waitForVisibility(productsPage.productsPageProductSearchResults, 2);
        Assert.assertTrue(productsPage.productsPageProductSearchResults.isDisplayed());

    }
//TC12
    @Given("User opens products page TC12")
    public void user_opens_products_page_TC12() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.jsClick(homePage.homePageProducts);

        ReusableMethods.waitForVisibility(productsPage.productsPageAllProductsText, 3);
        Assert.assertTrue(productsPage.productsPageAllProductsText.isDisplayed());


    }

    @When("User adds first product to cart")
    public void user_adds_first_product_to_cart() {
        ReusableMethods.wait(1000);
        ReusableMethods.jsScroll(productsPage.productsPageFirstProductBox);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(productsPage.productsPageScrolledProductAddToCartButton);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(productsPage.productsPageContinueShoppingButton);


    }
    @And("User adds second product to cart")
    public void user_adds_second_product_to_cart() {
        ReusableMethods.wait(1000);
        ReusableMethods.jsScroll(productsPage.productsPageSecondProductBox);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(productsPage.productsPageScrolledProductAddToCartButton2);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(productsPage.productsPageContinueShoppingButton);
    }
    @Then("User checks the cart")
    public void user_checks_the_cart() {
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(homePage.homePageCartButton);

        ReusableMethods.waitForVisibility(cartPage.cartPageFirstProductName, 1);
        Assert.assertTrue(cartPage.cartPageFirstProductName.isDisplayed());

        ReusableMethods.waitForVisibility(cartPage.cartPageSecondProductName, 1);
        Assert.assertTrue(cartPage.cartPageSecondProductName.isDisplayed());

        ReusableMethods.waitForVisibility(cartPage.cartPageFirstProductPrice, 1);
        Assert.assertTrue(cartPage.cartPageFirstProductPrice.isDisplayed());

        ReusableMethods.waitForVisibility(cartPage.cartPageFirstProductQuantity, 1);
        Assert.assertTrue(cartPage.cartPageFirstProductQuantity.isDisplayed());

        ReusableMethods.waitForVisibility(cartPage.cartPageFirstProductTotalPrice, 1);
        Assert.assertTrue(cartPage.cartPageFirstProductTotalPrice.isDisplayed());

        ReusableMethods.waitForVisibility(cartPage.cartPageSecondProductPrice, 1);
        Assert.assertTrue(cartPage.cartPageSecondProductPrice.isDisplayed());

        ReusableMethods.waitForVisibility(cartPage.cartPageSecondProductQuantity, 1);
        Assert.assertTrue(cartPage.cartPageSecondProductQuantity.isDisplayed());

        ReusableMethods.waitForVisibility(cartPage.cartPageSecondProductTotalPrice, 1);
        Assert.assertTrue(cartPage.cartPageSecondProductTotalPrice.isDisplayed());
    }

//TC13
    @Given("User opens a product from home page")
    public void user_opens_a_product_from_home_page() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.jsClick(homePage.homePageViewThirdProductPage);

    }
    @When("User makes quantity 4 and adds to cart")
    public void user_makes_quantity_4_and_adds_to_cart() {
        ReusableMethods.sendText(indivicualProductPage.indivicualProductQuantity,"4");
        ReusableMethods.wait(2000);
        ReusableMethods.jsclick(indivicualProductPage.indivicualProductAddToCart);
        ReusableMethods.wait(2000);
        ReusableMethods.jsClick(productsPage.productsPageContinueShoppingButton);

    }
    @Then("User checks cart product quantity")
    public void user_checks_cart_product_quantity() {
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(homePage.homePageCartButton);
        String quantity = cartPage.cartPageQuantityCheckTC13.getText();
        String neededQuantity = "4";
        Assert.assertTrue(quantity.equals(neededQuantity));


    }

//TC15
    @Given("User clicks women category and a sub category")
    public void user_clicks_women_category_and_a_sub_category() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));

        ReusableMethods.jsClick(homePage.homePageWomenCategory);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(homePage.homePageWomenSareeCategory);
        ReusableMethods.waitForVisibility(homePage.homePageWomenSareeProductsText, 1);
        Assert.assertTrue(homePage.homePageWomenSareeProductsText.isDisplayed());



    }
    @And("User clicks men category and a sub category")
    public void user_clicks_men_category_and_a_sub_category() {
        ReusableMethods.jsClick(homePage.homePageMenCategory);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(homePage.homePageMenJeansCategory);
        ReusableMethods.waitForVisibility(homePage.homePageMenJeansProductsText, 1);
        Assert.assertTrue(homePage.homePageMenJeansProductsText.isDisplayed());
    }
//TC16
    @Given("User opens products page TC16")
    public void user_opens_products_page_TC16() {
        String automationExerciseUrl = ConfigReader.getProperty("automationExerciseUrl");
        DriverManager.getDriver().get(automationExerciseUrl);
        String currentUrl = ReusableMethods.getCurrentUrl();
        assertTrue(currentUrl.equals("https://automationexercise.com/"));
        ReusableMethods.jsClick(homePage.homePagePopup);
        ReusableMethods.jsClick(homePage.homePageProducts);

        ReusableMethods.waitForVisibility(productsPage.productsPageAllProductsText, 3);
        Assert.assertTrue(productsPage.productsPageAllProductsText.isDisplayed());
    }
    @When("User searches a product TC16 {string}")
    public void user_searches_a_product_TC16(String productName) {
        ReusableMethods.sendText(productsPage.productsPageProductSearchBox, productName);
        ReusableMethods.jsClick(productsPage.productsPageProductSearchButton);
        ReusableMethods.waitForVisibility(productsPage.productsPageProductSearchResultsText, 3);
        Assert.assertTrue(productsPage.productsPageProductSearchResultsText.isDisplayed());
    }
    @Then("User adds searched product to cart")
    public void user_adds_searched_product_to_cart() {
        ReusableMethods.jsClick(productsPage.productsPageFirstProductAddToCart);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(productsPage.productsPageSecondProductAddToCart);
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(productsPage.productsPageThirdProductAddToCart);
        ReusableMethods.wait(1000);
    }
    @And("User checks cart")
    public void user_checks_cart() {
        ReusableMethods.jsClick(homePage.homePageCartButton);
        ReusableMethods.wait(1000);
        Assert.assertTrue(cartPage.cartPageFirstProduct.isDisplayed());
        Assert.assertTrue(cartPage.cartPageSecondProduct.isDisplayed());
        Assert.assertTrue(cartPage.cartPageThirdProduct.isDisplayed());
    }
    @Then("User logs in and check cart {string} {string}")
    public void user_logs_in_and_check_cart(String email, String password) {
        ReusableMethods.wait(1000);
        ReusableMethods.jsClick(homePage.homePageLoginButton);
        ReusableMethods.wait(1000);
        ReusableMethods.sendText(loginPage.loginPageLoginEmail, email);
        ReusableMethods.sendText(loginPage.loginPageLoginPassword, password);
        ReusableMethods.jsClick(loginPage.loginPageLoginSubmit);
        ReusableMethods.wait(3000);
        ReusableMethods.jsClick(homePage.homePageCartButton);
        ReusableMethods.wait(1000);
        Assert.assertTrue(cartPage.cartPageFirstProduct.isDisplayed());
        Assert.assertTrue(cartPage.cartPageSecondProduct.isDisplayed());
        Assert.assertTrue(cartPage.cartPageThirdProduct.isDisplayed());

        ReusableMethods.jsClick(homePage.homePageLogoutButton);
    }


}
