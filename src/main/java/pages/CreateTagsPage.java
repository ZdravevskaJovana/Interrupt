package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class CreateTagsPage {
    private By titleField = By.id("title");
    private By createBtn = By.xpath("(//button[@type='submit'])[2]");
    private By backBtn = By.xpath("//button[@type='submit']");
    private By message = By.id("swal2-title");

    public void createNewTag (String title){
        SeleniumHelpers.findElement(titleField).sendKeys(title);
        SeleniumHelpers.findElement(createBtn).click();
    }
    public String getMsg(){
        return SeleniumHelpers.waitAndFindElement(message).getText();
    }
    public void navigateBackToTags(){
        SeleniumHelpers.findElement(backBtn).click();
    }
}
