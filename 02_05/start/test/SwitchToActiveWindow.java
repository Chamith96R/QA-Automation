import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/chamith/Downloads/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTbBtn = driver.findElement(By.id("new-tab-button"));
        newTbBtn.click();

        String OrgHandle = driver.getWindowHandle();

        for(String handle1 : driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(OrgHandle);

        driver.quit();
    }
}
