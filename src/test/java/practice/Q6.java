package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Q6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/divers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // Under the  ORIGINAL CONTENTS click on Alerts
       driver.findElement(By.xpath("//a[@id='alerts']")).click();
        // print the URL
        System.out.println(driver.getCurrentUrl());
        // navigate back
        driver.navigate().back();
        // print the URL
        System.out.println(driver.getCurrentUrl());
        // Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        // print the URL
        System.out.println(driver.getCurrentUrl());
        // enter value-> 20 and Enter
        driver.findElement(By.id("lteq30")).sendKeys("20"+Keys.ENTER);
        // and then verify Submitted Values is displayed open page
        System.out.println(driver.findElement(By.xpath("//*[text()='Submitted Values']")).isDisplayed());
        // close driver
        driver.close();
    }
    }
