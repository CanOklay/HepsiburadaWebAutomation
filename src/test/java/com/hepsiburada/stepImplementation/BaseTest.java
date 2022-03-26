package com.hepsiburada.stepImplementation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Fatih Can Oklay
 * Date: 30.12.2021
 */

public class BaseTest {

    protected static WebDriver driver;
    protected static WebDriverWait webDriverWait;

    @Before
    public void user_is_on_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-translate");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver.get("https://www.hepsiburada.com/");
    }

    @After
    public void driver_tears_down() {
        if (driver != null) {
            driver.quit();
        }
    }
}
