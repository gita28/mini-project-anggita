package Test.Mobile.drive.Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductScreen;



public class ProductSteps {

    @Step
    ProductScreen productScreen;


    @Given("I am on the Product page")
    public void iamOnTheProductPage() {

    }

    @When("I click Select button buy product")
    public void iClickSelectButtonBuyProduct() {
        productScreen.iClickSelectButtonBuyProduct();

    }

    @And("click button shopping cart")
    public void clickButtonShoppingCart() {
        productScreen.clickShoppingcartButton();
    }
}


