package Test.Mobile.drive.Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterScreen;

public class RegisterSteps {

    RegisterScreen registerScreen;

    @Given("I am on the Register page")
    public void iAmOnTheRegisterPage() {
    }

    @When("I input valid username")
    public void iInputValidUsername(){
        registerScreen.iInputValidUsernameRegister("Anggita");

    }

    @And("I input valid email")
    public void iInputValidEmailRegister() {
        registerScreen.iInputValidEmailRegister("Anggitaaprilia2001@gmail.com");

    }

    @And("I input valid password")
    public void inputPasswordRegister() {
        registerScreen.inputPasswordRegister("12345");

    }

    @And("click register button")
    public void clickLoginButtonRegister() {
registerScreen.clickLoginButtonRegister();


    }

}
