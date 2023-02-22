package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class MembershipPage {
    WebDriver driver;
    public MembershipPage(WebDriver driver){
        this.driver = driver;
    }
    By yesBtn = By.xpath("//button[contains(normalize-space(),'Yes')]");
    By clubMenuOption = By.xpath("//i[@class='fi fi-chevron-down']");
    By clubNTNUI = By.xpath("//li[normalize-space()='NTNUI']");
    By continueBtn = By.xpath("//span[normalize-space()='Continue']");
    By noButton = By.xpath("(//button[contains(normalize-space(),'No')])[1]");
    By noBunForDiscount = By.xpath("(//button[contains(normalize-space(),'No')])[2]");
    By createSharebusBtn = By.xpath("//span[normalize-space()='Create Sharebus']");
    public void enterMembershipInfo() throws InterruptedException {
        driver.findElement(yesBtn).click();
        Thread.sleep(1000);
        driver.findElement(clubMenuOption).click();
        Thread.sleep(500);
        Utils.scrollDown2(driver);
        Thread.sleep(500);
        driver.findElement(clubNTNUI).click();
        Thread.sleep(1000);
        driver.findElement(continueBtn).click();
    }
    public void passengerGoal() throws InterruptedException {
        driver.findElement(noButton).click();
        Thread.sleep(500);
        driver.findElement(noBunForDiscount).click();
        Thread.sleep(500);
        driver.findElement(createSharebusBtn).click();
    }
}
