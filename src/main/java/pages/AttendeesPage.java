package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class AttendeesPage {
    private By createBtn = By.xpath("//button[@type='submit']");

    public void createBtnClick (){
        SeleniumHelpers.findElement(createBtn).click();
    }


}
