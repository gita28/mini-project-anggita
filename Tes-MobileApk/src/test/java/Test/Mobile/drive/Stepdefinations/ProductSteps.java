package Test.Mobile.drive.Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.Productpage;
import starter.pages.Ratingpage;
import starter.pages.Transaksipage;


public class ProductSteps {

    Productpage productpage;

    Transaksipage transaksipage;

    Ratingpage ratingpage;

    @Given("I am on the Product page" )
    public void iamOnTheProductPage() {
     productpage.openPage();
     productpage. validateOnProdukfield();;
    }

    @When("I click Select button buy product")
    public void iClickSelectButtonBuyProduct() {
     productpage.clickbuyField();

    }
    @And("click button shopping cart")
    public void clickButtonShoppingCart() {
     productpage.clickShoppingcartButton();

    }

    @Then("I go to transaksi page")
    public void iGoToTransaksiPage() {
      transaksipage.validateOnTransaksiPage();
    }

    @And("click button rating")
    public void cLickButtonRatingPage () {
      productpage.clickratingfield();
    }

    @Then("I go to rating page")
    public void iGoToRatingPage() {
        ratingpage.validateOnRatingPage();
        }
    }



