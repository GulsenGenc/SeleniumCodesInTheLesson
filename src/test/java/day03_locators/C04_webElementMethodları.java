package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_webElementMethodları {
    public static void main(String[] args) {
        /*
        1->amazon.com a gidip arama kutusunu locate edin
        2->arama kutusunun tag name nın input oldugunu test edın
        3->arama kutusunun name attribute nun değerinin.... oldugunu test edın.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1->arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //  2->arama kutusunun tag name nın input oldugunu test edın
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("tagname testi PASSED");
        } else{
            System.out.println("tagname testi FAILED");
        }

        //3->arama kutusunun name attribute nun değerinin.... oldugunu test edın.

        String  expectedNameDegeri="field-keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attribute testi PASSED");
        } else{
            System.out.println("name attribute testi FAILED");
        }
        driver.close();

    }
}
