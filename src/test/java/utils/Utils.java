package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utils {
    public static void scrollDown(WebDriver driver){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
    public static void scrollDown2(WebDriver driver){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");

    }
    public static void scrollDown3(WebDriver driver){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }
    public static void scrollup(WebDriver driver){
        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-2000)");
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

    }
}
