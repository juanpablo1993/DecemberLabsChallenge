package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import testrunner.BaseTest;

public class SmokeTest extends BaseTest {

    @Test
    public void initialSmokeTest(){
        getLogger().info("Starting initial smoke test");

        HomePage homePage = new HomePage(driver);
        validate.assertTrue(homePage.isLoaded());
     }
}
