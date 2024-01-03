package tests;

import helpers.SeleniumHelpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.time.Duration;

public class BaseTestClass {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProfilePage profilePage;
    UsersPage usersPage;
    CreateUserPage createUserPage;
    AttendeesPage attendeesPage;
    CreateAttendeesPage createAttendeesPage;
    MentorsPage mentorsPage;
    CreateMentorsPage createMentorsPage;
    TagsPage tagsPage;
    CreateTagsPage createTagsPage;
    WebinarsPage webinarsPage;
    ViewedWebinarsPage viewedWebinarsPage;
    WebinarRegistrationPage webinarRegistrationPage;
    RegisteredWebinarPage registeredWebinarPage;


    @BeforeClass
    public void setUp() {
        SeleniumHelpers.initializingWebDriver();
        SeleniumHelpers.getDriver().manage().window().maximize();
        SeleniumHelpers.getDriver().get("https://qainterrapt.brainster.xyz/login");
        SeleniumHelpers.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeTest
    public void initPages() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        profilePage = new ProfilePage();
        usersPage = new UsersPage();
        createUserPage = new CreateUserPage();
        attendeesPage = new AttendeesPage();
        createAttendeesPage = new CreateAttendeesPage();
        mentorsPage = new MentorsPage();
        createMentorsPage = new CreateMentorsPage();
        tagsPage = new TagsPage();
        createTagsPage = new CreateTagsPage();
        webinarsPage = new WebinarsPage();
        viewedWebinarsPage = new ViewedWebinarsPage();
        webinarRegistrationPage = new WebinarRegistrationPage();
        registeredWebinarPage = new RegisteredWebinarPage();

    }
    @AfterClass
    public void tearDown(){
        SeleniumHelpers.getDriver().quit();
    }

}
