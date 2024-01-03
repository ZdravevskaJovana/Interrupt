package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class WebinarRegistrationPage  {
    private By nameField = By.id("name");
    private By surnameField = By.id("surname");
    private By emailField = By.id("email");
    private By registerBtn = By.xpath("//button[@type='submit']");

    RegisteredWebinarPage registeredWebinarPage = new RegisteredWebinarPage();

    public void registerToWebinar (String name, String surname, String email){
        SeleniumHelpers.findElement(nameField).sendKeys(name);
        SeleniumHelpers.findElement(surnameField).sendKeys(surname);
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        SeleniumHelpers.findElement(registerBtn).click();
    }



}
