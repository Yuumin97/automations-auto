package intiations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Init {
    public WebDriver driver;
    @BeforeTest
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","D:\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void TearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}
