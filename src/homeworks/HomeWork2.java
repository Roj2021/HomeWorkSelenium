package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {

          /*
    Task 2:
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop-up
    close the browser
    TIP for HW2:
    just fill in text boxes or button, no need to deal with other webElements
    also u will need a Thread.sleep after clicking on create new account
     */
        //connect to the web-driver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        //navigate facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        //name

        driver.findElement(By.name("firstname")).sendKeys("Roj");
        Thread.sleep(2500);
        //last name
        driver.findElement(By.name("lastname")).sendKeys("Ava");
        Thread.sleep(2000);
//email address
        driver.findElement(By.name("reg_email__")).sendKeys("avaroj@gmail.com");
        Thread.sleep(1900);
        //re enter email
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("avaroj@gmail.com");
        //password
        driver.findElement((By.id("password_step_input"))).sendKeys("Ava123");
        Thread.sleep(2000);

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2500);

        driver.quit();




    }
}
