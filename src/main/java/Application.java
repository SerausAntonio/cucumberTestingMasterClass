
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Application {
    static  WebDriver driver;
    public static void main(String[] args) {
        System.out.println("Hello i am here");
     //   System.out.println(System.getProperty("user.dir"));

     //   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.wikipedia.org");

       System.out.println(driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//*[@class='central-textlogo-wrapper']")).getText());
        driver.findElement(By.id("js-link-box-en")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='mw-headline']")).getText());

        driver.quit();


    }
}


