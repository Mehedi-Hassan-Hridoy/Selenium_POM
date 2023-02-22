package testSharebus;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class SharebusSetup {
    static WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.sharebus.co");
    }
    @Test (priority = 0,description = "Navigate to LoginPage by clicking Sign in button")
    public void signIn() throws InterruptedException {
        HomePage signInButton = new HomePage(driver);
        signInButton.clickSignIn();
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void credentials() throws InterruptedException {
        SignInPage crd = new SignInPage(driver);
        crd.enterEmail();
        crd.enterPassword();
        crd.clickOnSignInButton();
        Thread.sleep(3000);
    }
    @Test (priority = 2)
    public void roleSelection() throws InterruptedException {
        UserRole role = new UserRole(driver);
        Thread.sleep(3000);
        role.clickMenuOption();
        role.selectSharelead();
        role.continueButton();
        Thread.sleep(3000);
    }
    @Test (priority = 3)
    public void insertTripInfo() throws InterruptedException {
        MyBusesPage tripDetails = new MyBusesPage(driver);

        Utils.scrollDown(driver);
        Thread.sleep(2000);
        tripDetails.clicksetupSharebus();
        Thread.sleep(1000);

        tripDetails.enterDeparturePoint();
        Thread.sleep(1000);

        tripDetails.getOsloDrpdwn().click();
        Utils.scrollDown2(driver);
        Thread.sleep(3000);

        tripDetails.enterDestinationPoint();
        Thread.sleep(2000);

        tripDetails.enterDepartureTime();
        Thread.sleep(4000);
        Utils.scrollDown3(driver);
        Thread.sleep(1000);

        tripDetails.enterReturnTime();
        tripDetails.getContinueBtn().click();
        Thread.sleep(10000);

    }
    @Test (priority = 4)
    public void membership() throws InterruptedException {
        MembershipPage membership = new MembershipPage(driver);

        membership.enterMembershipInfo();
        Thread.sleep(5000);
        Utils.scrollDown(driver);
        Thread.sleep(1000);

        membership.passengerGoal();
        Thread.sleep(10000);
    }
    @Test (priority = 5)
    public void publishInfo() throws InterruptedException {
        Publish pub = new Publish(driver);

        pub.clickPublishBtn();
        Thread.sleep(1000);

        pub.insertData();
        Thread.sleep(1000);
        Utils.scrollDown(driver);
        Thread.sleep(1000);

        pub.previewPublish();
        Thread.sleep(1000);

        pub.tripPreview();
        Thread.sleep(5000);
    }
    @Test (priority = 6)
    public void verifyTrip() throws InterruptedException {
        Publish verify = new Publish(driver);

        verify.clickNavBar();
        Thread.sleep(3000);
        Assert.assertEquals(verify.getTripName().getText(),"Chittagong");
    }
    @AfterTest
    public void exit() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
