package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/divers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        /*
        findelement(By..locator) istediğimiz webelementını bıze dondurur
        bızde o webelementını kullanmak ıcın bır variable a assign ederız.
        locator alırken gözumuzden kaçan detaylar olBILIR.aldıgımız bır locator çalışmazsa,
        alternatıf locatorlar denemelıyız.
         */
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        //herhangı bır webelementıne ıstedıgımız yazıyı yollamak ıstersek

        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

    }
}
