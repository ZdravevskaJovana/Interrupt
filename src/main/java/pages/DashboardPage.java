package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class DashboardPage {

    private By ThreeDotsProfileBtn = By.cssSelector("svg.h-5");
    private By profileName = By.cssSelector("p.text-md.font-medium");
    private By yourProfileLinkBtn = By.partialLinkText("profile");
    private By logoutLinkBtn = By.linkText("Logout");
    private By usersLinkBtn = By.linkText("Users");
    private By attendeesLinkBtn = By.linkText("Attendees");
    private By mentorsLinkBtn = By.linkText("Mentors");
    private By tagsLinkBtn = By.linkText("Tags");
    private By webinarsLinkBtn = By.linkText("Webinars");


    public String getProfileName() {
        return SeleniumHelpers.findElement(profileName).getText();
    }

    public void navigateToYourProfile() {
        SeleniumHelpers.findElement(ThreeDotsProfileBtn).click();
        SeleniumHelpers.waitAndFindElement(yourProfileLinkBtn).click();
    }
    public void navigateToUsers(){SeleniumHelpers.findElement(usersLinkBtn).click();}
    public void navigateToAttendees(){SeleniumHelpers.findElement(attendeesLinkBtn).click();}
    public void navigateToMentors(){SeleniumHelpers.findElement(mentorsLinkBtn).click();}
    public void navigateToTags(){SeleniumHelpers.findElement(tagsLinkBtn).click();}
    public void navigateToWebinars(){SeleniumHelpers.findElement(webinarsLinkBtn).click();};
    public void clickOnLogout (){
        SeleniumHelpers.findElement(ThreeDotsProfileBtn).click();
        SeleniumHelpers.findElement(logoutLinkBtn).click();
    }
    public String getCurrentUrl(){
      return   SeleniumHelpers.getDriver().getCurrentUrl();
    }
}
