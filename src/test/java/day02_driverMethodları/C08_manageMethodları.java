package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //maximize durumunda ıken konum ve olculerı alalım
        System.out.println("maximize iken konum-->"+driver.manage().window().getPosition());
        System.out.println("maximize iken ölçüler->"+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        //fulscreen ıken konum ve ölçüleri alalım
        System.out.println("fullscreen iken konum-->"+driver.manage().window().getPosition());
        System.out.println("fullscreen iken ölçüler->"+driver.manage().window().getSize());


    }
}
