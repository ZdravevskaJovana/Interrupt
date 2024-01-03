package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyLogout extends BaseTestClass {
    @BeforeClass
    public void loginToInterrupt() {
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");
    }

    @Test
    public void verifyLogoutSucc(){
        dashboardPage.clickOnLogout();
        String actualUrl = loginPage.getLoginPageUrl();
        String expectedUrl = "https://qainterrapt.brainster.xyz/login";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
