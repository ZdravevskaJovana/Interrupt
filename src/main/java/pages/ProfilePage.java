package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ProfilePage {

    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By saveBtn = By.xpath("(//button[contains(@class,'inline-flex items-center')])[2]");
    private By message = By.id("swal2-title");

    public void editUsersName(String editedName) throws InterruptedException {
        SeleniumHelpers.findElement(nameField).clear();
        SeleniumHelpers.findElement(nameField).sendKeys(editedName + Keys.ENTER);
    }

    public String getSuccessfulEditMsgText() {
        return SeleniumHelpers.waitAndFindElement(message).getText();
    }

    public void navigateBack() {
        SeleniumHelpers.getDriver().navigate().back();
        SeleniumHelpers.refreshPage();
    }

}
