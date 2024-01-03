package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class CreateMentorsPage {
    private By nameField = By.id("name");
    private By surnameFiled = By.id("surname");
    private By emailField = By.id("email");
    private By bioField = By.id("bio");
    private By occupationField = By.id("occupation");
    private By createBtn = By.xpath("(//button[@type='submit'])[2]");
    private By backBtn = By.xpath("//button[@type='submit']");
    private By message = By.id("swal2-title");

    public void createNewMentor (String name, String surname, String email, String bio, String occupation) throws InterruptedException {
        SeleniumHelpers.findElement(nameField).sendKeys(name);
        SeleniumHelpers.findElement(surnameFiled).sendKeys(surname);
        Thread.sleep(2000);
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        SeleniumHelpers.findElement(bioField).sendKeys(bio);
        SeleniumHelpers.findElement(occupationField).sendKeys(occupation);
        Thread.sleep(2000);
        SeleniumHelpers.findElement(createBtn).click();

    }

    public String getMessage(){return SeleniumHelpers.waitAndFindElement(message).getText();}
    public void navigateBackToMentors (){SeleniumHelpers.findElement(backBtn).click();}


}
