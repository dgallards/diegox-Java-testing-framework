package cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import base.DriverManager;
import reporter.ExtentManager;
import pages.MainPage;

public class Cura {

    private WebDriver driver;
    private DriverManager driverManager;
    private ExtentReports extent;
    private ExtentTest test;
    private String url = "https://katalon-demo-cura.herokuapp.com/";

    @Before
    public void setUp() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Cura main page", "Test to validate CURA main page");

        driverManager = new DriverManager();
        driver = driverManager.initializeDriver("chrome");

        driver.get(url);
        test.log(Status.INFO, "Driver initialized");
    }

    @Test
    public void testCuraMain() {
        MainPage mainPage = new MainPage(driver)

        mainPage.openMenu();
        test.log(Status.INFO, "Menu opened");
        
        mainPage.clickLoginLink();
        test.log(Status.INFO, "Login link clicked");

        mainPage.enterUsername("John Doe");
        mainPage.enterPassword("ThisIsNotAPassword");
        mainPage.clickLoginButton();
        test.log(Status.INFO, "Login performed");
        test.pass("Test passed");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driverManager.quitDriver();
            test.log(Status.INFO, "Driver quit");
            extent.flush();
        }
    }
}