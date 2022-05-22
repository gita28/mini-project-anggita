package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import starter.Transaction.TransactionGET;
import starter.Transaction.TransactionPOST;

public class TransactionSteps {
    @Step
    TransactionGET transactionGET;

    @Step
    TransactionPOST transactionPOST;

    @Given("I set api endopoints for get transaction")
    public void setPostApiEndpointsForGetTransaction() {
        transactionGET.setPostApiEndpointsForGetTransaction();
    }

    @When("I send Http request get transaction")
    public void sendPostHttpRequestGetTransaction() {
        transactionGET.sendPostHttpRequestGetTransaction();
    }

    @Then("I receive verify transaction HTTP response 200")
    public void receiveVerifyTransactionHTTPResponse200() {
        transactionGET.receiveVerifyTransactionHTTPResponse200();
    }

    @And("I receive valid data get transaction")
    public void receiveValidDataGetTransaction() {
        transactionGET.receiveValidDataGetTransaction();
    }


    @Given("I set Post api endopoints for Post transaction")
    public void setPostApiEndopointForPostTransaction() {
        transactionPOST.setPostApiEndopointForPostTransaction();
    }

    @When("I send Http request Post transaction")
    public void sendPostHttpRequestPostTransaction() {
        transactionPOST.sendPostHttpRequestPostTransaction();
    }

    @Then("I receive validate transaction the status code is response 201")
    public void receiveValidateTransactionTheStatusCodeIsResponse201() {
        transactionPOST.receiveValidateTransactionTheStatusCodeIsResponse201();
    }

    @And("I receive valid data Pos transaction")
    public void receiveValidDataPosTrasaction() {
        transactionPOST.receiveValidDataPosTrasaction();
    }

}

