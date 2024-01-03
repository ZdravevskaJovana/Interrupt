package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class RegisteredWebinarPage {
    private By webinarsName = By.xpath("//p[contains(@class,'text-xl lg:text-2xl')]");

    public String geWebinarsName(){
      return  SeleniumHelpers.findElement(webinarsName).getText();
    }
}
