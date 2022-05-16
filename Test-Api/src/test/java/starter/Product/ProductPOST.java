package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import netscape.javascript.JSObject;

public class ProductPOST {
    protected static String url ="https://be-qa.alta.id/api";

    @Step("I set Post api endopoints for Post Product")
    public String setPostApiEndopointsForPostProduct () {
        return url + "product";
    }
    @Step("I send Http request Post Product")
    public void sendHttpResquestPostProduct() {
        JSObject requestBody = new JSObject();
        requestBody.put("name", "Tensi Darah Elektrik");
        requestBody.put("price", "240000");
        requestBody.put("categories", 3,6 );

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setPostApiEndopointsForPostProduct());
    }

    @Step("I receive validate product the status code is response 201")
    public void receiveValidateProductTheStatusCodeIsResponse201 () {
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid data Post Product transaction")
    public void receiveValidDataPostProductTransaction(){
        restAssuredThat(respose -> respose.body(matcher)); "'data'.'id'",equalsTo(1508)));
        restAssuredThat(respose -> respose.body(matcher)); "'data'.'name'",equalsTo("Tensi Darah Elektrik")));
        restAssuredThat(respose -> respose.body(matcher)); "'data'.'descriptions'",equalsTo(" ")));
        restAssuredThat(respose -> respose.body(matcher)); "'data'.'price'",equalsTo("24000")));
        restAssuredThat(respose -> respose.body(matcher)); "'data'.'rating'",equalsTo("0")));
        restAssuredThat (respose -> respose.body(matcher)); "'data'.'categories'",equalsTo(" ")));
        restAssuredThat (respose -> respose.body(matcher)); "'data'.'Categories [0].'id'.'name'.'description'",equalsTo("3", "alat", "6" ,"kesehatan")));

    }
}


