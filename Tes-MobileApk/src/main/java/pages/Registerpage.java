package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Registerpage extends PageObject {


    private By UsernameField() {
        return By.xpath("//*[label[text()='Email']]/input");
    }

    private By EmailField() {
        return By.xpath("//*[label[text()='password']]/input");
    }

    private By PaswordField() {
        return By.xpath("L ");}

    private By ButtonRegisterField() {
        return By.xpath("//*[label[text()='password']]/input");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(ButtonRegisterField()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(EmailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(PaswordField()).type(password);
    }
    @Step
    public void clickRegisterButton(){
        $(ButtonRegisterField()).click();
    }
}






