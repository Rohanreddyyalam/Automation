package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ChromeLaunch {

public static WebDriver driver;
public static WebDriver chromeOpen(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    return driver;
}
public  void urlLoad(String url){

    driver.get(url);
    driver.manage().window().maximize();
}
}
