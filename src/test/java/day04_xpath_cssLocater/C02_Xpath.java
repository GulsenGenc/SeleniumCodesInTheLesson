package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/divers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //3- Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("delete button görunur,test PASSED");
        } else {
            System.out.println("delete button görünmuyor,test FAILED");
        }
        //4- Delete tusuna basin
        deleteButton.click();
        //5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveYazısı = driver.findElement(By.xpath("//h3"));
        if (addRemoveYazısı.isDisplayed()) {
            System.out.println("add remove yazısı  görunur,test PASSED");
        } else {
            System.out.println("add remove yazısı görünmuyor,test FAILED");
        }
        driver.close();
    }
}
