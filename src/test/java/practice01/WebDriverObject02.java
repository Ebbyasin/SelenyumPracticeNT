package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverObject02 {
    public static void main(String[] args) {

        // WebDriverManager.chromedriver().setup();//Selenium 4.6 sonrası gerek yok
        WebDriver driver=new ChromeDriver();
        driver.quit();
    }
}
