import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/chamith/Downloads/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement btn1 = driver.findElement(By.id("radio-button-1"));
        btn1.click();

        WebElement btn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        btn2.click();

        WebElement btn3 = driver.findElement(By.cssSelector("input[value='option3']"));
        btn3.click();

        driver.quit();
    }
}
