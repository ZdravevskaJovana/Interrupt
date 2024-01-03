package tests;

import helpers.SeleniumHelpers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class VerifyRegisterToWebinar extends BaseTestClass{
    @BeforeClass
    public void loginToInterrupt() {
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");
    }

    @Test
    public void verifyRegisteringToWebinarSucc() throws InterruptedException {
        dashboardPage.navigateToWebinars();

        webinarsPage.searchForWebinar("Jovana's Testing");
        String parentHandle = SeleniumHelpers.getDriver().getWindowHandle();
        webinarsPage.clickOnWebinarLinkBtn();
        Set<String> allWindowHandles = SeleniumHelpers.getDriver().getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(parentHandle)) {
                SeleniumHelpers.getDriver().switchTo().window(handle);
                webinarRegistrationPage.registerToWebinar(
                        "ImeJovana", "PrezimeZdr", "jovzdravevskatester@email.com");
                String actualName = registeredWebinarPage.geWebinarsName();
                String expectedName = "Jovana's Testing Webinar";
                Assert.assertEquals(actualName, expectedName);
                SeleniumHelpers.getDriver().switchTo().window(parentHandle);
                break;
            }
        }
    }

    }

