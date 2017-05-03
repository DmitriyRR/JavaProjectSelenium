import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D://forSelenium//webdrivers//firefox//geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);

        driver.get("http://52.43.254.234/");
        driver.close();
    }
}