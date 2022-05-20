package Test.Mobile.drive.Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductScreen;
import pages.RatingScreen;
import pages.TransaksiScreen;
import starter.pages.Productpage;
import starter.pages.Ratingpage;
import starter.pages.Transaksipage;


public class ProductSteps {

    @Step
    ProductScreen productScreen;

    @Step
    RatingScreen ratingScreen;

    @Step
    TransaksiScreen transaksiScreen;

    @Given("I am on the Product page" )
    public void iamOnTheProductPage() {
     productScreen.openPage();

    }

    @When("I click Select button buy product")
    public void iClickSelectButtonBuyProduct() {
     productScreen.clickbuyField();

    }
    @And("click button shopping cart")
    public void clickButtonShoppingCart() {
     productScreen.clickShoppingcartButton();

    }

    @Then("I go to transaksi page")
    public void iGoToTransaksiPage() {
      transaksiScreen.validateOnTransaksiPage();
    }

    @And("click button rating")
    public void cLickButtonRatingPage () {
      productScreen.clickButtonRatingPage();
    }

    @Then("I go to rating page")
    public void iGoToRatingPage() {
        ratingScreen.validateOnRatingPage();
        }
    }



