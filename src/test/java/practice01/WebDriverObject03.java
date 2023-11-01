package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverObject03 {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();//Selenium 4.6 sonrası direkt WebDriver objesi oluşturulabilir.
        driver.get("https://google.com");
        driver.quit();


    }
}
