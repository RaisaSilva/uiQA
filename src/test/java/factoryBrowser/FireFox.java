package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFox implements IBrowser {
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.gecko.driver","/Users/raisasilva/Desktop/Directorios/QA/uiQA/src/test/resources/geckodriver");
        FirefoxDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}

