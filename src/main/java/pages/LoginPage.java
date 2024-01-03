package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class LoginPage {

    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By rememberMeCheckBox = By.id("remember_me");
    private By loginBtn = By.cssSelector("button.inline-flex");

    public void loginToInterrupt(String email, String password){
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        SeleniumHelpers.findElement(passwordField).sendKeys(password);
        SeleniumHelpers.findElement(loginBtn).click();
    }

    public void loginToIntAndRemMe (String email, String password){
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        SeleniumHelpers.findElement(passwordField).sendKeys(password);
        SeleniumHelpers.findElement(rememberMeCheckBox).click();
        SeleniumHelpers.findElement(loginBtn).click();
    }
    public String getLoginPageUrl (){
        return SeleniumHelpers.getDriver().getCurrentUrl();
    }


}
