package Test.Mobile.drive.Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TransaksiScreen;

public class TransaksiSteps {

    @Step
    TransaksiScreen transaksiScreen;

    @Given("I am on the Transaction page")
    public void iAmOnTheTransactionPage() {
    }

    @When ("I am set item quanty")
    public void IamSetItemQuanty(){

    }

    @And("click transaksi button")
    public void cliktransaksiButton() {
        transaksiScreen.cliktransaksiButton();
    }

}







