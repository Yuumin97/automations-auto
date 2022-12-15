package duc.min;

import intiations.Init;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Init {
    @Test
    public void TestActions() throws Exception {
        driver.navigate().to("https://www.facebook.com");
        Actions action = new Actions(driver);
        WebElement account = driver.findElement(By.xpath("//*[@id='email']"));
        action.sendKeys(account,"account hoac email cua ban").build().perform();
        WebElement pass = driver.findElement(By.xpath("//*[@id='pass']"));
        action.sendKeys(pass,"mat khau cua ban").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        //link message cua nguoi day.
        driver.navigate().to("https://www.facebook.com/messages/t/100067921929896");
        Thread.sleep(1000);
        //xpath ban đầu nó sẽ là như này tùy vào mỗi account của mỗi người nó sẽ thay đổi.
        WebElement search = driver.findElement(By.xpath("//p[@class='xat24cr xdj266r']"));
        // lời muốn spam
        action.click(search).sendKeys(search,"1.Minh Duc").sendKeys(Keys.ENTER).build().perform();
        // vì facebook thay xpath lần 2 lần này là ok rồi không phải đổi nữa (bảo mật của facebook )
        WebElement sentText = driver.findElement(By.xpath("//div[@aria-label='Tin nhắn']"));
        for (int i = 2; i <= 10; i++) {
            action.sendKeys(sentText,i+".Minh Duc").sendKeys(Keys.ENTER).build().perform();
            // chổ này mình cài độ trễ 1s để tránh lag và nghi ngờ chạy auto.
            Thread.sleep(1000);
        }
        }

}
