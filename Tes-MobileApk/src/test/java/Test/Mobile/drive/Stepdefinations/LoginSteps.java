package Test.Mobile.drive.Stepdefinations;

import Pages.AltaShop;
import Pages.MyTaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.Productpage;

public class LoginSteps {

    AltaShop altaShop = new AltaShop();
    MyTaskPage myTaskPage = new MyTaskPage();

    Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputEmail("gita@gmail.com");


    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("123");
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I go to product page")
    public void iGoToProductPage() {
        productpage.validateOnProdukfield();
        }
    }

