package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import starter.Login.LoginPOST;

public class LoginSteps {

    @Step
    LoginPOST loginPOST;

    @Given("I set Post api endopoints for post new email and password")
    public void setPostApiEndpointsForPostNewEmailAndPassword() {

        loginPOST.setPostApiEndpointsForPostNewEmailAndPassword();
    }

    @When("I send Post Http request detail user for login")
    public void sendPostHttpRequestDetailUserForLogin() {

        loginPOST.sendPostHttpRequestDetailUserForLogin();
    }

    @Then("I receive validate login the status code is response 200")
    public void receiveValidLoginTheStatusCodeIsResponse200() {

        loginPOST.receiveValidLoginTheStatusCodeIsResponse200();
    }

    @And("I receive valid data for user")
    public void receiveValidDatailForUser();
    {
        loginPOST.postLogin();
    }
}