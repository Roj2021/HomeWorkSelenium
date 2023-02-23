package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {

        //connect to the web-driver
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        //send first name
        driver.findElement(By.id("customer.firstName")).sendKeys("Roj");

        //send last name
        driver.findElement(By.name("customer.lastName")).sendKeys("Botani");

        // send the address
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Lawrence st");

        //send the city
        driver.findElement(By.name("customer.address.city")).sendKeys("Rahway");
//send the state
        driver.findElement(By.name("customer.address.state")).sendKeys("New York");
//send zipcode
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
//phone number
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9176779900");

        //send ssn

        driver.findElement(By.id("customer.ssn")).sendKeys("12367822345");

        //send username
        driver.findElement(By.id("customer.username")).sendKeys("rojnav2020");
//send the password
        driver.findElement(By.name("customer.password")).sendKeys("Botani123");

        //confirm password
        driver.findElement(By.name("repeatedPassword")).sendKeys("Botani123");

        driver.findElement(By.linkText("Register")).click();

        driver.close();



    }
}
