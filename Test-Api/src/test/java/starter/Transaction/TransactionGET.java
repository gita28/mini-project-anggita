package starter.Transaction;

public class TransactionGET {
    protected static String url = "https://be-qa.alta.id/api/categories";

    @Step("I set api endopoints for get categories")
    public String setPostApiEndpointsForGetTransaction() {
        return url + "transaction";
    }

    @Step("I send Http request get categories")
    public void sendPostHttpRequestGetTransaction() {
        SerenityRest.given().get(setPostApiEndpointsForGetTransaction());
    }

    @Step("I receive verify categories HTTP response 200")
    public void receiveVerifyTransactionHTTPResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data get categories")
    public void receiveValidDataGetTransaction() {

        restAssuredThat();(response -> response.body("'data'",equalsTo("[ ]")));


    }


}
