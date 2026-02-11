import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Lesson_9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.mts.by");
        Thread.sleep(2000); // Даем время загрузиться

        String title = driver.findElement(By.xpath("//section[@class='pay']//h2")).getText();
        System.out.println("Блок: " + title);

        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        System.out.println("Логотипов найдено: " + logos.size());

        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        Thread.sleep(2000);
        System.out.println("URL после клика: " + driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("10");

        WebElement btn = driver.findElement(By.xpath("//form[@id='pay-connection']//button"));
        btn.click();

        Thread.sleep(5000);
        driver.quit();
    }
}