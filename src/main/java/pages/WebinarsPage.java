package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Set;

public class WebinarsPage  {
    private By searchField = By.xpath("//input[@type='text']");
    private By searchedResult = By.xpath("html[1]/body[1]/div[1]/main[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/span[1]/div[1]");
    private By viewWebinarBtn = By.xpath("(//div[contains(@class,'flex items-center')]//a)[3]");
    private By searchedWebinarLink = By.xpath("//a[@class='underline text-purple-600']");

    WebinarRegistrationPage webinarRegistrationPage = new WebinarRegistrationPage();

    public void searchForWebinar(String title) {
        SeleniumHelpers.findElement(searchField).sendKeys(title + Keys.ENTER);
    }

    public String getSearchedWebinarTitle() {
        return SeleniumHelpers.waitAndFindElement(searchedResult).getText();
    }

    public void clickOnViewWebinar() throws InterruptedException {
        Thread.sleep(3000);
        SeleniumHelpers.findElement(viewWebinarBtn).click();
    }

    public void clickOnWebinarLinkBtn() throws InterruptedException {
        Thread.sleep(3000);
        SeleniumHelpers.findElement(searchedWebinarLink).click();
            }
        }

