package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GETID {

    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set api endopoints for get id product")
    public String setApiEndopointForGetIdProduct() {
        return url + "product";
    }
    @Step("I send Http request get id product")
    public void sendtHttpRequestGetIdProduct() {
        SerenityRest.given().get(setApiEndopointForGetIdProduct());
    }
    @Step("I receive verify product id HTTP response 200")
    public void receiveVerifyProductIdHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data get id product")
    public void validateDataGetIdProduct(){

        restAssuredThat();(respose -> respose.body("'data'.'id'",equalsTo(1468)));
        restAssuredThat();(respose -> respose.body("'data'.'name'",equalsTo("Tensi Darah Elektrik")));
        restAssuredThat();(respose -> respose.body("'data'.'descriptions'",equalsTo(" ")));
        restAssuredThat();(respose -> respose.body("'data'.'price'",equalsTo("24000")));
        restAssuredThat();(respose -> respose.body("'data'.'rating'",equalsTo("0")));
        restAssuredThat();(respose -> respose.body("'data'.'Categories [0].'id'.'name'.'description'",equalsTo("3", "alat", "6" ,"kesehatan")));
    }
}









