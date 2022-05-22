package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ProductGET {

    protected static String url = "https://be-qa.alta.id/api/products";

    @Step(" I set api endopoints for get product")
    public String setApiEndopointForGetProduct() {
        return url + "product";
    }
    @Step("I send Http request get product")
    public void sendHttpRequestGetProduct() {
        SerenityRest.given().get(setApiEndopointForGetProduct());
    }
    @Step("I receive verify product HTTP response 200")
    public void receiveVerifyProductHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data get product")
    public void receiveValiddataGetProduct(){

        restAssuredThat(response -> response.body("'data'.'id'", equalsTo("1")));
        restAssuredThat(respose -> respose.body("'data'.'id'",equalsTo("1479")));
        restAssuredThat(respose -> respose.body("'data'.'name'",equalsTo("Tensi Darah Elektrik")));
        restAssuredThat(respose -> respose.body("'data'.'descriptions'",equalsTo(" ")));
        restAssuredThat(respose -> respose.body("'data'.'price'",equalsTo("24000")));
        restAssuredThat(respose -> respose.body("'data'.'rating'",equalsTo("0")));
        restAssuredThat(respose -> respose.body("'data'.'Categories [0].'id'.'name'.'description'",equalsTo("3", "alat", "6" ,"kesehatan")));
    }
}
