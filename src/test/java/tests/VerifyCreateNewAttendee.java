package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyCreateNewAttendee extends BaseTestClass {
    @BeforeClass
    public void loginToInterrupt(){
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");  }
    @Test
    public void verifyCreatingNewAttendeeSucc(){
        dashboardPage.navigateToAttendees();
        attendeesPage.createBtnClick();
        createAttendeesPage.createNewAttendee("Jov4", "Zdr4", "zdrjov4@email.com", "55");;
        String actualMsg = createAttendeesPage.getMsg();
        String expectedMsg = "Attendee has been created successfully";
        Assert.assertEquals(actualMsg,expectedMsg);
    }

}
