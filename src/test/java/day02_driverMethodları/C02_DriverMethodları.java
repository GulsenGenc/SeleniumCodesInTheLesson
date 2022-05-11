package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();//browsers açılınca tam sayfa yapmak için :)
        driver.get("https://www.amazon.com");
        System.out.println("achtual title "+driver.getTitle());
        System.out.println("actual url "+driver.getCurrentUrl());
        driver.close();

    }
}
