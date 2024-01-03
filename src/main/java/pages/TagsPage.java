package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class TagsPage {
    private By createBtn = By.xpath("//button[@type='submit']");

    public void clickOnCreateBtn(){SeleniumHelpers.findElement(createBtn).click();}

}
