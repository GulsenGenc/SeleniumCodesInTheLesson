package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/divers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //    Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("20");
        //    Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("30");
        // Click on Calculate
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        // Get the result
        System.out.println(driver.findElement(By.id("answer")).getText());

    }
}
