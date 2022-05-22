package Test.Mobile.drive.Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.LoginScreen;


public class LoginSteps {

     @Steps
     LoginScreen loginScreen;


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

    }
        @When("I input valid email Login")
        public void iInputValidEmailLogin() {
            loginScreen.iInputValidEmailLogin("gita@gmail.com");
        }

        @And("I input valid password Login")
        public void iInputValidPassword () {
            loginScreen.iInputValidPasswordLogin("123");
        }

        @And("click login button Login")
        public void clickLoginButtonLogin () {
            loginScreen.clickLoginButtonLogin();

        }
    }

