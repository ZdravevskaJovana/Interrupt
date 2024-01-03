package pages;
import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAttendeesPage {
    private By nameField = By.id("name");
    private By surnameField = By.id("surname");
    private By emailField = By.id("email");
    private By webinarField = By.id("webinar_id");
    private By createBtn = By.xpath("(//button[@type='submit'])[2]");
    private By backBtn = By.xpath("//button[@type='submit']");
    private By message = By.id("swal2-title");

    public void createNewAttendee (String name, String surname, String email, String webinar){
        SeleniumHelpers.findElement(nameField).sendKeys(name);
        SeleniumHelpers.findElement(surnameField).sendKeys(surname);
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        WebElement webinarDropDown = SeleniumHelpers.findElement(webinarField);
        Select webinarsList = new Select(webinarDropDown);
        webinarsList.selectByValue(webinar);
        SeleniumHelpers.findElement(createBtn).click();
    }
    public void navigateBackToAttendees(){
        SeleniumHelpers.findElement(backBtn).click();
    }
    public String getMsg (){
        return SeleniumHelpers.waitAndFindElement(message).getText();
    }
}
