package Test.Mobile.drive.Stepdefinations;

import Pages.AltaShop;
import Pages.MyTaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.LoginPage;
import starter.pages.LoginPage;
import starter.pages.Productpage;

public class LoginSteps {

     @Steps
      LoginPage loginPage;


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.isLoginPage();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputEmail(String email);
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword(String password);
    }

    @And("click login button")
    public void clickLoginButton() {
    }

    @Then("I go to product page")
    public void iGoToProductPage() {
        productpage.validateOnProdukfield();
        }
    }
    }

