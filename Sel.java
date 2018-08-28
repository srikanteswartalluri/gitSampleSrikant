import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/talluri/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("hello");
        driver.findElement(By.name("q")).submit();

        driver.quit();
    }
}
