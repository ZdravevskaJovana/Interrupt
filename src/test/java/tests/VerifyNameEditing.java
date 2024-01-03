package tests;

import helpers.SeleniumHelpers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyNameEditing extends BaseTestClass{

    @BeforeClass
    public void loginToInterrupt(){
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");    }

    @Test
    public void verifySuccessfulNameEditing() throws InterruptedException {
        dashboardPage.navigateToYourProfile();

        profilePage.editUsersName("Jovana Zdr");

       String actualMsg = profilePage.getSuccessfulEditMsgText();
       String expectedMsg = "User has been edited successfully";

        Assert.assertEquals(actualMsg,expectedMsg);
    }
}
