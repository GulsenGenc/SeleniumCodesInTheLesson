package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_cssSelector {
    //1 ) Bir class oluşturun : Locators_css
    //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/divers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //  b. Locate email textbox
        // WebElement emailTextBox = driver.findElement(By.cssSelector("input[name='session[email]']"));
        WebElement emailTextBox = driver.findElement(By.cssSelector("#session_email"));

        //  c. Locate password textbox ve
        //WebElement passwordTextBox = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement passwordTextBox = driver.findElement(By.cssSelector("#session_password"));
        //  d. Locate signin button
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Sign in']"));

        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!
        signInButton.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        signInButton.sendKeys("Test1234!");
        signInButton.click();
    }
}
