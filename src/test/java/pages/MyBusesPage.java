package pages;

import org.openqa.selenium.*;
import utils.Utils;

public class MyBusesPage {
    WebDriver driver;
    public MyBusesPage(WebDriver driver){
        this.driver = driver;
    }
    By setupShareBus = By.xpath("//span[contains(normalize-space(),'Set up a Sharebus')]");

    public WebElement getFromTextBox() {
        return driver.findElement(fromTextBox);
    }

    By fromTextBox = By.id("startPoint");
    By toTextBox = By.id("destination");
    By departureDateBox = By.xpath("//input[@placeholder='Departure Date']");
    By departureTimeBox = By.xpath("(//input[@placeholder=\"Time\"])[1]");
    By returnDateBox = By.xpath("//input[@placeholder='Return Date']");
    By datePickerNextIcon = By.xpath("//span[@class='p-datepicker-next-icon pi pi-chevron-right']");
    By selectFourteen = By.xpath("//span[normalize-space()='2']");
    By returnTimeBox = By.xpath("(//input[@placeholder=\"Time\"])[3]");
    By todaysDate = By.xpath("(//span[@class=\"p-button-label\"])[1]");

    By continueBtn = By.xpath("//span[normalize-space()='Continue']");
    By osloDrpdwn= By.xpath("(//div[@class='pac-item'])[1]");



    public void clicksetupSharebus(){
        driver.findElement(setupShareBus).click();
    }
    public  WebElement getOsloDrpdwn() {
        return driver.findElement(osloDrpdwn);
    }

    public void enterDeparturePoint(){
        driver.findElement(fromTextBox).sendKeys("O");

    }
    public void enterDestinationPoint() throws InterruptedException {
        driver.findElement(toTextBox).sendKeys("Kolb");
        Thread.sleep(1000);
        driver.findElement(toTextBox).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(toTextBox).sendKeys(Keys.ENTER);
    }
    public void enterDepartureTime(){
        driver.findElement(departureDateBox).click();
        driver.findElement(todaysDate).click();
        driver.findElement(departureTimeBox).click();
    }
    public void enterReturnTime() throws InterruptedException {
        driver.findElement(returnDateBox).click();
        Thread.sleep(2000);
        Utils.scrollup(driver);
        Thread.sleep(2000);
        driver.findElement(datePickerNextIcon).click();
        Thread.sleep(500);
        driver.findElement(selectFourteen).click();
        Thread.sleep(500);
        Utils.scrollDown(driver);
        Thread.sleep(500);
        driver.findElement(returnTimeBox).click();
        Thread.sleep(1000);

    }
    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }
}
