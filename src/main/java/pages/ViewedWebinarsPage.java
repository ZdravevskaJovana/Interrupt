package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class ViewedWebinarsPage {
    private By webinarsTitle = By.cssSelector("h3.capitalize ");
    private By backBtn = By.xpath("//button[@type='submit']");

    public String getWebinarsTitle (){
        return SeleniumHelpers.findElement(webinarsTitle).getText();
    }
    public void navigateBackToWebinarsPage(){
        SeleniumHelpers.findElement(backBtn).click();
    }
}
