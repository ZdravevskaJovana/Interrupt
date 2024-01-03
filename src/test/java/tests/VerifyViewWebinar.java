package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyViewWebinar extends BaseTestClass {
    @BeforeClass
    public void loginToInterrupt() {
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");
    }

    @Test
    public void verifyViewWebinarSucc() throws InterruptedException {
        dashboardPage.navigateToWebinars();

        webinarsPage.searchForWebinar("Jovana's Testing");
        webinarsPage.clickOnViewWebinar();
        String actualTitle =  viewedWebinarsPage.getWebinarsTitle();
        String expectedTitle = "Jovana'S Testing Webinar";

        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
