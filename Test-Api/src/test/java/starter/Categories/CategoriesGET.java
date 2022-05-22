package starter.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CategoriesGET {

    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set api endopoints for get categories")
    public String setPostApiEndpointsForGetCategories () {
        return url + "categories";
    }

    @Step("I send Http request get categories")
    public void sendHttpRequestGetCategories () {
        SerenityRest.given().get(setPostApiEndpointsForGetCategories());
    }

    @Step("I receive verify categories HTTP response 200")
    public void receiveVerifyCategoriesHttpRequestResponse200 () {
        restAssuredThat(response ->response.statusCode(200));
    }
    @Step ("I receive valid data get categories")
    public void receiveValidDataGetCategories(){
        restAssuredThat(response -> response.body("'data'.'id'", equalsTo("1")));
        restAssuredThat(response -> response.body("'data'.'name'", equalsTo("kesehatan")));
        restAssuredThat(response -> response.body("'data'.'Description'", equalsTo("  ")));


    }

}
