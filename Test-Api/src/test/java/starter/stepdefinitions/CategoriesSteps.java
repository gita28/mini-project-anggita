package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import starter.Categories.CategoriesGET;
import starter.Categories.CategoriesPOST;


public class CategoriesSteps {

    @Step
    CategoriesGET categoriesGET;

    @Step
    CategoriesPOST categoriesPOST;

    @Given("I set api endopoints for get categories")
    public void setPostApiEndpointsForGetCategories() {

        categoriesGET.setPostApiEndpointsForGetCategories();
    }
    @When("I send Http request get categories ")
    public void sendHttpRequestGetCategories(){

        categoriesGET.sendHttpRequestGetCategories();
    }

    @Then("I receive verify categories HTTP response 200 ")
    public void receiveVerifyCategoriesHttpRequestResponse200(){
        categoriesGET.receiveVerifyCategoriesHttpRequestResponse200();
    }

    @And("I receive valid data get categories ")
    public void receiveValidDataGetCategories(){
        categoriesGET.receiveValidDataGetCategories();

    }
    @Given("I set api endopoints for Post categories")
    public void setPostApiEndopointsForPostCategories(){
        categoriesPOST.setApiEndopointsForPostCategories();
    }

    @When("I send Http request Pos categories")
    public void sendHttpResquestPostCategories(){
        categoriesPOST.sendHttpResquestPostCategories();
    }

    @Then("I receive validate categories the status code is response 200")
    public void receiveValidateCategoriesTheStatusCodeIsResponse200(){
        categoriesPOST.receiveValidateCategoriesTheStatusCodeIsResponse200();
    }

    @And("I receive valid data Post categories")
    public void receiveValidDataPostCategories(){
        categoriesPOST.receiveValidDataPostCategories();
    }
}


