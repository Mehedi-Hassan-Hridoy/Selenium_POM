package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Publish {
    WebDriver driver;
    public Publish(WebDriver driver){
        this.driver = driver;
    }
    By publishBtn = By.xpath("//span[contains(text(),\"Publish\")]");
    By tripNameBox = By.xpath("(//input[@class = 'form-control rounded'])[1]");
    By category = By.xpath("//div[@id='sport0']");
    By btnPreviewPublish = By.xpath("//span[normalize-space()='Preview and publish']");
    By tripPreviewPubBtn = By.xpath("//span[normalize-space()='Publish']");

    By tripName= By.xpath("//span[normalize-space()='Chittagong']");

    By myBussesNavBar= By.xpath("//button[contains(.,'My busses')]");
    public void clickPublishBtn(){
        driver.findElement(publishBtn).click();
    }
    public void insertData(){
        driver.findElement(tripNameBox).sendKeys("Chittagong");
        driver.findElement(category).click();
    }
    public void previewPublish(){
        driver.findElement(btnPreviewPublish).click();
    }
    public void tripPreview(){
        driver.findElement(tripPreviewPubBtn).click();
    }
    public WebElement getTripName() {
        return driver.findElement(tripName);
    }
    public void clickNavBar(){
        driver.findElement(myBussesNavBar).click();
    }

}
