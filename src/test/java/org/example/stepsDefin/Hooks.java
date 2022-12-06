package org.example.stepsDefin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void openBrowser()
    {

        System.setProperty("webdriver.chrome.driver","K:\\FWD-Project\\Automation\\AutomationTesting\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }


    @After
    public static void closeBrowser() throws InterruptedException
    {
        Thread.sleep(3500);
        driver.quit();

    }

}
