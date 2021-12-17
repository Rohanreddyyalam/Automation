package TestNew;

import Browser.ChromeLaunch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newclass extends ChromeLaunch {
    @BeforeTest
    public void ParallelMethod() {
        WebDriver driver;
        driver = chromeOpen();
        String url = "http://demo.automationtesting.in/Register.html";
        urlLoad(url);
        driver.manage().window().maximize();
      }
      @Test
    public void mainmethod(){

      }
}
