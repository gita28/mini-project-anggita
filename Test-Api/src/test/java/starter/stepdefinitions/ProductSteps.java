package starter.stepdefinitions;

import starter.Product.GETID;
import starter.Product.ProductGET;
import starter.Product.ProductPOST;

public class ProductSteps {

    @Step
    GETID getid;

    @Step
    ProductGET productGET;

    @Step
    ProductPOST productPOST;

    @Given("I set api endopoints for get product")
    public void setApiEndopointForGetProduct() {
        productGET.setApiEndopointForGetProduct();
    }

    @When("I send Http request get product")
    public void sendHttpRequestGetProduct (){
        productGET.sendHttpRequestGetProduct();
    }

    @Then("I receive verify product HTTP response 200")
    public void receiveVerifyProductHttpResponse200(){
        productGET.receiveVerifyProductHttpResponse200();
    }

    @And("I receive valid data get product")
    public void receiveValiddataGetProduct(){
        productGET.receiveValiddataGetProduct();
    }

    @Given ("I set Post api endopoints for Post Product")
    public void setPostApiEndopointsForPostProduct() {
        productPOST.setPostApiEndopointsForPostProduct();
    }

    @When ("I send Http request Post Product")
    public void sendHttpResquestPostProduct() {
        productPOST.sendHttpResquestPostProduct();

    }
        @Then("I receive validate product the status code is response 200")
        public void receiveValidateProductTheStatusCodeIsResponse200 () {
            productPOST.receiveValidateProductTheStatusCodeIsResponse200();
        }

        @And("I receive valid data Post Product transaction")
        public void receiveValidDataPostProductTransaction() {
            productPOST.receiveValidDataPostProductTransaction();
        }

    @Given ("I set api endopoints for get id product")
    public void setApiEndopointsForGetIdProduct() {
        getid.sendtHttpRequestGetIdProduct();
    }

    @When ("I send Http request get id product")
    public void sendtHttpRequestGetIdProduct() {
        getid.sendtHttpRequestGetIdProduct();
    }
    @Then("I receive verify product id HTTP response 200")
    public void receiveVerifyProductIdHttpResponse200(){
        getid.receiveVerifyProductIdHttpResponse200();
    }

    @And("I receive valid data get id product ")
    public void validateDataGetIdProduct(){
        getid.validateDataGetIdProduct();
    }

}

