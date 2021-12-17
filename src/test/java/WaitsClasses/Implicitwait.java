package WaitsClasses;

import Browser.ChromeLaunch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Implicitwait {
    WebDriver driver;
    @BeforeSuite
    public void openChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://gaana.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void mainMethod(){

    }
    @AfterTest
    public void CloseGoogleopenFirefox(){
        driver.quit();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.guru99.com/implicit-explicit-waits-selenium.html");
        driver.manage().window().fullscreen();
        driver.quit();
    }
}
