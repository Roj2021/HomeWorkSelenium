package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {


        //connect to the web-driver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
// go to amazon
        driver.get("https://www.amazon.com/");

        //print all the links in the amazon.com
        driver.findElements(By.tagName("a"));
    }
}

