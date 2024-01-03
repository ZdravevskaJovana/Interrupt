package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class VerifyCreateNewMentor extends BaseTestClass{

    @BeforeClass
    public void loginToInterrupt(){
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");  }
    @Test
    public void verifyCreatingNewMentor () throws InterruptedException {
        dashboardPage.navigateToMentors();
        mentorsPage.createBtnClick();
        createMentorsPage.createNewMentor(
                "Mentor6", "Mentor6","testiram6@gmail.com", "new mentor6", "mentor tester");
       String actualMsg = createMentorsPage.getMessage();
       String expectedMsg = "Mentor has been created successfully";
        Assert.assertEquals(actualMsg, expectedMsg);
    }
}
