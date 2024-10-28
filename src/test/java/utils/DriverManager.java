package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            switch (browser.toLowerCase()) {
                case "chrome":
                    /*Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("profile.default_content_settings_values.notification", 1);
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", prefs);*/
                    driver = new ChromeDriver(/*options*/);
                    break;
                case "edge":
                    driver=new EdgeDriver();
                    break;
                case "firefox":
                    driver=new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Geçersiz tarayıcı: " + browser);
            }
        }
        driver.manage().window().maximize();
        return driver;
    }


    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}