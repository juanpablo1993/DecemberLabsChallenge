package tests;

import org.testng.annotations.Test;
import pages.AustinPage;
import pages.HomePage;
import testrunner.BaseTest;

public class DecemberLabsTests extends BaseTest {

    private final String TITLE_HOMEPAGE = "December Labs: UX/UI Design and Mobile App & Web Development";

    private final String TITLE_AUSTINPAGE = "Austin Web & App Developers | December Labs";

    private final String URL_AUSTINPAGE = "https://inhouse.decemberlabs.com/locations/austin/";

    @Test
    public void initialValidations() {
        getLogger().info("Starting challenge part 3");

        HomePage homePage = new HomePage(driver);
        validate.assertTrue(homePage.isLoaded());

        //First validations
        validate.assertEquals(homePage.getPageTitle(),TITLE_HOMEPAGE, "The title is not expected");
        validate.assertTrue(homePage.mainMenuIsPresent(), "Main menu is not present");

        AustinPage austinPage = homePage.austinPageClickLink();
        validate.assertTrue(austinPage.isLoaded());

        //Austin Validations
        validate.assertEquals(austinPage.getPageTitle(), TITLE_AUSTINPAGE, "The title is not expected");
        validate.assertEquals(austinPage.getPageURL(), URL_AUSTINPAGE, "The URL is not expected");

        //Schedule Validations
        austinPage.scheduleButtonClick();


        validate.assertTrue(austinPage.calendarIsDisplayed(),"The calendar is not displayed");

        austinPage.closeModal();

        validate.assertTrue(austinPage.calendarIsNotDisplayed(),"The calendar is displayed");
        validate.assertTrue(austinPage.isLoaded());
     }





}
