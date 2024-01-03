package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class MentorsPage {
    By createBtn = By.xpath("//button[@type='submit']");
    By searchField = By.xpath("//input[@type='text']");
    By searchedNameField = By.xpath("html[1]/body[1]/div[1]/main[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/span[1]/div[1]");
    By message =By.id("swal2-title");

    public void createBtnClick (){SeleniumHelpers.findElement(createBtn).click();}
    public String getMsg(){return SeleniumHelpers.waitAndFindElement(message).getText();}

    }


