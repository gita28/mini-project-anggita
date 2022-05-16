package starter.Login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import netscape.javascript.JSObject;

import java.io.FileWriter;
import java.io.IOException;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginPOST {
    protected static String url ="https://be-qa.alta.id/api";

    @Step("I set Post api endopoints for post new email and password")
    public String setPostApiEndpointsForPostNewEmailAndPassword() {
        return url + "login";
    }

    @Step("I send Post Http request detail user")
    public void sendPostHttpRequestDetailUserForLogin () {
        JSObject requestBody = new JSObject();
        requestBody.put("email", "alexunder@email.com");
        requestBody.put("password", "123123123");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setPostApiEndpointsForPostNewEmailAndPassword());
    }

    @Step("I receive validate login the status code is response 200")
    public void receiveValidLoginTheStatusCodeIsResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for user")
    public void postLogin (){
        Response response = SerinityRes.lastResponse();
        Integer login = response.body() .path("user[0].login");
        try (FileWriter file = new FileWriter("src//test//resources//login.json//login.json")) {
            file.write(login);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
    }
}

}
