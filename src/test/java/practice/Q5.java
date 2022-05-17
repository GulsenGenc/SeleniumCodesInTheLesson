package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/divers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  1.  https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
        //    2.  Bir mail adersi giriniz
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gulsengenctuncer@gmail.com");
        //    3.  Bir password giriniz
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("feyzam");
        //    4.  Login butonuna tiklayiniz
        driver.findElement(By.xpath("//button[@name='commit']")).click();
        //    5.  "There was a problem with your login." texti gorunur ise "kayit yapilamadi" yazdiriniz
        // eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        WebElement yazı= driver.findElement(By.xpath("//div[@role='alert']"));
        if (yazı.isDisplayed()){
            System.out.println("kayıt yapılamadı");
        }else System.out.println("kayıt yapıldı");

        //    6.  Tum sayfalari kapatiniz
        driver.close();
    }}
