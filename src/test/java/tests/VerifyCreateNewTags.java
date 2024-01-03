package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyCreateNewTags extends BaseTestClass {
    @BeforeClass
    public void loginToInterrupt() {
        loginPage.loginToInterrupt("zdravevskaj@gmail.com", "Brainster1");
    }

    @Test
    public void verifyCreatingNewUserSucc(){
        dashboardPage.navigateToTags();
        tagsPage.clickOnCreateBtn();
        createTagsPage.createNewTag("New First Free Testing Tag");

        String actualMsg = createTagsPage.getMsg();
        String expectedMsg = "Tag has been created successfully";
        Assert.assertEquals(actualMsg,expectedMsg);
    }
}