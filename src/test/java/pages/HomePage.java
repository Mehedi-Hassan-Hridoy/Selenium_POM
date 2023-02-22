package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By signInButton = By.xpath("//button[@aria-current=\"page\"]");
    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }
}
