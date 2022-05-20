package Test.Mobile.drive.Stepdefinations;

import Pages.AltaShop;
import Pages.MyTaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.LoginScreen;
import pages.ProductScreen;
import starter.pages.LoginPage;
import starter.pages.Productpage;

public class LoginSteps {

     @Steps
     LoginScreen loginScreen;

     @Steps
    ProductScreen productScreen;


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
      loginScreen.isLoginPage());
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginScreen.inputEmail(String email);
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginScreen.inputPassword(String password);
    }

    @And("click login button")
    public void clickLoginButton() {
        LoginScreen.Onclick(LoginButton())}

    @Then("I go to product page")
    public void iGoToProductPage() {
        productScreen.validateOnProdukfield();
        }
    }
    }

