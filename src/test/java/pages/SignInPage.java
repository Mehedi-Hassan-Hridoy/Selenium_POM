package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver driver;
    public SignInPage(WebDriver driver){
        this.driver = driver;
    }
    By emailBox = By.id("email");
    By passwordBox = By.id("password");
    By signInButton = By.xpath("//button[@class=\"btn sb-btn-lg sb-btn-primary fw-bold rounded-pill w-100\"]");


    public void enterEmail(){
        driver.findElement(emailBox).sendKeys("brainstation23@yopmail.com");
    }
    public void enterPassword(){
        driver.findElement(passwordBox).sendKeys("Pass@1234");
    }
    public void clickOnSignInButton(){
        driver.findElement(signInButton).click();
    }

}
