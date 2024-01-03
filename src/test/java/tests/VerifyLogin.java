package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin extends BaseTestClass {

    @Test
    public void verifyLogin() {
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");

        String actualUrl = dashboardPage.getCurrentUrl();
        String expectedUrl = "https://qainterrapt.brainster.xyz/dashboard";
        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
