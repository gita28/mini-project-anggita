package starter.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import netscape.javascript.JSObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CategoriesPOST {
    protected static String url ="https://be-qa.alta.id";

    @Step("I set api endopoints for Post categories")
    public String setApiEndopointsForPostCategories() {
        return url + "categories";
    }
    @Step("I send Http request Post categories ")
    public void sendHttpResquestPostCategories() {
        JSObject requestBody = new JSObject();
        requestBody.put("name", "kesehatan");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setApiEndopointsForPostCategories());
    }

    @Step("I receive validate categories the status code is response 200")
    public void receiveValidateCategoriesTheStatusCodeIsResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data Post categories")
    public void receiveValidDataPostCategories(){
        restAssuredThat(respose -> respose.body("'data'.'id'",equalsTo("1104")));
        restAssuredThat(respose -> respose.body("'data'.'name'",equalsTo("kesehatan")));
        restAssuredThat(respose -> respose.body("'data'.'Description'",equalsTo(" ")));
    }
}


