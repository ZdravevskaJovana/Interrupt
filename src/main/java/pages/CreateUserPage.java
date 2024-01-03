package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateUserPage {
   private By nameField = By.id("user.name");
   private By emailField = By.id("user.email");
   private By passwordField = By.id("password");
   private By createBtnOnCreateForm = By.xpath("(//button[@type='submit'])[2]");
   private By message = By.id("swal2-title");
   private By backBtn = By.xpath("//button[@type='submit']");

   public void createUser (String userName, String userEmail, String password){
       SeleniumHelpers.findElement(nameField).sendKeys(userName);
       SeleniumHelpers.findElement(emailField).sendKeys(userEmail);
       SeleniumHelpers.findElement(passwordField).sendKeys(password);
       SeleniumHelpers.findElement(createBtnOnCreateForm).click();
   }
   public String getMessage (){
       return SeleniumHelpers.waitAndFindElement(message).getText();
   }
   public void navigateBackToUsersPage(){
       SeleniumHelpers.findElement(backBtn).click();
   }


}
