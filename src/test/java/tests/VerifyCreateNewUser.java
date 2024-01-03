package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyCreateNewUser extends BaseTestClass{
    @BeforeClass
    public void loginToInterrupt(){
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");  }

     @Test
    public void verifyCreatingUserSucc() throws InterruptedException {
         dashboardPage.navigateToUsers();

         usersPage.createBtnClick();

         createUserPage.createUser("Jovana Test8", "jovana8@test.com", "Brainster1");
         createUserPage.navigateBackToUsersPage();

//         String actualMsg = createUserPage.getMessage();
//         String expectedMsg = "User has been created successfully";
//         Assert.assertEquals(actualMsg,expectedMsg);

         String actualSearchedName = usersPage.searchByName("Jovana Test8");
         String expectedSearchedFeedback = "Jovana Test8";
         Assert.assertEquals(actualSearchedName, expectedSearchedFeedback);

     }
}
