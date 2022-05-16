package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Registerpage extends PageObject {


    private By UsernameField() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[1]");
    }

    private By EmailField() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[2]");
    }

    private By PaswordField() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/div ");}

    private By ButtonRegisterField() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button");
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
    public void inputUsername (String username) {
        $(UsernameField()).type(username);

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






