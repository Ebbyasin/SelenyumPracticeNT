package practice01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverObject01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");

        new ChromeDriver().close();
        new EdgeDriver().close();

    }
}
