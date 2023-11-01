package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_Navigate {

        /*
         Set Driver Path
         Create chrome driver object
         Maximize the window
         Open google home page https://www.google.com/
         Navigate to techproeducation lms home page https://lms.techproeducation.com/login/index.php
         Navigate back to google
         Navigate forward to techproeducation
         Refresh the page
         Close/Quit the browser
         And last step : print "ALL OK" on console
    */

    public static void main(String[] args) throws InterruptedException {

        //  System.setProperty("webdriver.chrome.driver",".idea/drivers/chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

       // Navigate to techproeducation lms home page https://lms.techproeducation.com/login/index.php
        Thread.sleep(2000);
        driver.navigate().to("https://lms.techproeducation.com/login/index.php");

        // Navigate back to google
        Thread.sleep(2000);
        driver.navigate().back();

        // Navigate forward to techproeducation
        Thread.sleep(2000);
        driver.navigate().forward();

        // Refresh the page
        Thread.sleep(2000);//Hard wait --> >Java wait,3 saniye bekler,javanın çalışmasını durdurur.implicitly durdurmaz
        driver.navigate().refresh();

        // Close/Quit the browser
        Thread.sleep(2000);
        driver.quit();

        // And last step : print "ALL OK" on console
        System.out.println("ALL OK");






    }
}
