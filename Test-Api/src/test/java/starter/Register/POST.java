package starter.Register;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import netscape.javascript.JSObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {

    protected static String url ="https://be-qa.alta.id/api";

    @Step("I set api endopoints for Post new username email and password")
    public String setApiEndopointzforPostNewUsernameEmailPassword() {
        return url + "register";
    }
    @Step("I send Post Http request detail user")
    public void sendPostHttpRequestDetailUser() {
        JSObject requestBody = new JSObject();
        requestBody.put("fullname","Alex Under");
        requestBody.put("Email", "anggita@email.com");
        requestBody.put("password", "123123123");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setApiEndopointzforPostNewUsernameEmailPassword());
    }

    @Step("I receive validate register the status code is response 201")
    public void receiveValidateRegisterTheStatusCodeIsResponse400 () {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new user")
    public void validateDatailnewUser(){
        restAssuredThat(respose -> respose.body( "'data'.'id'",equalsTo(4183)));
        restAssuredThat(respose -> respose.body( "'data'.'fullname'",equalsTo("Alex Under")));
        restAssuredThat(respose -> respose.body( "'data'.'email'",equalsTo("gita@email.com")));
        restAssuredThat(respose -> respose.body( "'data'.'password'",equalsTo(123123123)));

        }



    }

