package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {

    public static void main(String[] args) {

        //connect to the web-driver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        //open up fb.com
        driver.get("https://www.facebook.com/");

        //send in the username

        driver.findElement(By.id("email")).sendKeys("Ari");

        //send the password
        driver.findElement(By.name("pass")).sendKeys("Botani");

        //click on the button create New Account

       // driver.findElement(By.linkText("Create new account") ).click();

        driver.findElement(By.partialLinkText("password" )).click();

        driver.quit();

    }
}
