package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRole {
    WebDriver driver;
    public UserRole(WebDriver driver){
        this.driver = driver;
    }

    By menuOption = By.xpath("//div[@role='button']");
    By sharelead = By.xpath("//span[contains(text(),'Sharelead')]");
    By continueBtn = By.xpath("//span[contains(text(),'Continue')]");
    public void clickMenuOption(){
        driver.findElement(menuOption).click();
    }
    public void selectSharelead(){
        driver.findElement(sharelead).click();
    }
    public void continueButton(){
        driver.findElement(continueBtn).click();
    }
}
