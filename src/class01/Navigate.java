package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {


        //connect to webDriver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");

        //initiate the instance of WebDriver

        WebDriver driver =new ChromeDriver();

        //Open google .com


        //now navigate to facebook.com

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);

        //go back
        driver.navigate().back();
        Thread.sleep(2000);

        //go to facebook
        driver.navigate().forward();

        //refresh the page
        Thread.sleep(3000);
        driver.navigate().refresh();

        //close the browser

        driver.close();
    }
}
