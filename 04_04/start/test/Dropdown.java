import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/chamith/Downloads/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement drpDwn = driver.findElement(By.id("dropdownMenuButton"));
        drpDwn.click();

        WebElement autCmplt = driver.findElement(By.id("autocomplete"));
        autCmplt.click();

        driver.quit();
    }
}
