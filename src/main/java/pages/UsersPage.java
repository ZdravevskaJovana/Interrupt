package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UsersPage {

   private By createBtn = By.xpath("//button[@type = \"submit\"]");
   private By nameSearchField = By.xpath("//input[@data-id='name']");
   private By searchedResultField = By.xpath("(//tr[contains(@class,'border border-slate-100')]//td)[3]");

   public void createBtnClick (){
       SeleniumHelpers.findElement(createBtn).click();
   }
   public String searchByName (String nameOrPartialName) throws InterruptedException {
       SeleniumHelpers.waitAndFindElement(nameSearchField).sendKeys(nameOrPartialName);
       Thread.sleep(3000);
       return SeleniumHelpers.waitAndFindElement(searchedResultField).getText();
   }



}
