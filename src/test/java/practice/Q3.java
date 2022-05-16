package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/divers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        driver.findElement(By.xpath("(//a[@class='cookie-choices-button'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gülşen");
        //fill the firstname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Genç");
        //check the gender
        driver.findElement(By.xpath("//input[@value='Female']")).click();
        //check the experience
        driver.findElement(By.xpath("//input[@value='6']")).click();
        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("16-05-2022");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
        //choose your continent -> Antartica
        driver.findElement(By.xpath("//*[text()='Antartica']")).click();
        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//*[text()='Browser Commands']")).click();
        //click submit button
        driver.findElement(By.xpath("//button[@name='submit']")).click();
    }
}
