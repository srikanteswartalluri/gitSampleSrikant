import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/talluri/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver(); //open chrome browser

        driver.get("http://www.google.com"); //open google.com
        driver.findElement(By.name("q")).sendKeys("hello"); //type "hello"
        driver.findElement(By.name("q")).submit(); //click search

        driver.quit(); //close browser
    }
}
