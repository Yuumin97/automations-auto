package duc.min;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.nhaccuatui.com");
        WebElement click = driver.findElement(By.xpath("//body/div[@id='submenu']/div[@class='wrap']/div[@class='content-wrap']/div[@class='menu-top']/ul[@id='menuTop']/li[7]"));
        click.click();
        WebElement choice = driver.findElement(By.xpath("//a[contains(text(),'Nghe Toàn Bộ')]"));
        choice.click();

    }
}
