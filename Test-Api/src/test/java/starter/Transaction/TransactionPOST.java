package starter.Transaction;

import netscape.javascript.JSObject;

public class TransactionPOST {
    protected static String url ="https://be-qa.alta.id/api";

    @Step("I set Post api endopoints for Post categories")
    public String setPostApiEndopointForPostTransaction () {
        return url + "transaction";
    }
    @Step("I send Http request Pos categories ")
    public void  sendPostHttpRequestPostTransaction() {
        JSObject requestBody = new JSObject();
        requestBody.put("product_id", "1");
        requestBody.put("quantity", "2");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setPostApiEndopointForPostTransaction());
    }

    @Step("I receive validate categories the status code is response 201")
    public void receiveValidateTransactionTheStatusCodeIsResponse201 () {
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid data Pos categories")
    public void receiveValidDataPosTrasaction(){
        restAssuredThat(respose -> respose.body(matcher)): "'data'.'id'",equalsTo("2932")));
        restAssuredThat(respose -> respose.body(matcher)): "'data'.'User'.'id'",equalsTo("132")));
        restAssuredThat(respose -> respose.body(matcher)): "'data'.'Fullname'",equalsTo("Alex Under")));
        restAssuredThat(respose -> respose.body(matcher)): "'data'.'Email'",equalsTo("alexunder@email.com")));
        restAssuredThat(respose -> respose.body(matcher)): "'data'.'Password'",equalsTo("123123123")));
        restAssuredThat(respose -> respose.body(matcher)): "'data'.'Product'",equalsTo("null")));
        restAssuredThat(respose -> respose.body(matcher)): "'data'.'Quantity'",equalsTo("2")));



    }
}



