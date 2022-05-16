package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import starter.Register.POST;

public class RegisterSteps {

    @Step
    POST post;

    @Given("I set api endopoints for Post new username email and password")
    public void setApiEndopointzforPostNewUsernameEmailPassword() {
        post.setApiEndopointzforPostNewUsernameEmailPassword();
    }

    @When("I send Post Http request detail user")
    public void sendPostHttpRequestDetailUser() {
        post.sendPostHttpRequestDetailUser();
    }

    @Then("I receive validate register the status code is response 400")
    public void receiveValidateRegisterTheStatusCodeIsResponse400(){
    post.receiveValidateRegisterTheStatusCodeIsResponse400();
    }

    @And("I receive valid data for new user")
    public void receiveValidDataFornewUser(){
        post.validateDatailnewUser();
    }

}
