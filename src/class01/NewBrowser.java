package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBrowser {
    public static void main(String[] args) throws InterruptedException {

        //connect to the web-driver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(3000);

        String URL=driver.getCurrentUrl();
        System.out.println(URL);

        String title=driver.getTitle();
        System.out.println("The title "+title + URL);

        driver.close();

    }
}
