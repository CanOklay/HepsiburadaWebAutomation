package com.hepsiburada.manager;

import com.hepsiburada.config.ConfigFileReader;
import com.hepsiburada.logs.Logs;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Created by Fatih Can Oklay
 * Date: 26.03.2022
 */

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    ConfigFileReader configFileReader = new ConfigFileReader();
    Logger logger = LogManager.getLogger(Logs.class.getName());

    public void setDriver(String testBrowser) throws MalformedURLException {
        switch (testBrowser) {
            case "grid-firefox": {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                firefoxOptions.addArguments("--disable-notifications");
                driver = new RemoteWebDriver(new URL(configFileReader.getRemoteUrl()), firefoxOptions);
                logger.info("***** Browser is grid-firefox *****");
                break;
            }
            case "grid-chrome": {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--disable-notifications");
                driver = new RemoteWebDriver(new URL(configFileReader.getRemoteUrl()), chromeOptions);
                logger.info("***** Browser is grid-chrome *****");
                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                firefoxOptions.addArguments("--disable-notifications");
                driver = new FirefoxDriver(firefoxOptions);
                logger.info("***** Browser is firefox *****");
                break;
            }
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--disable-notifications");
                driver = new ChromeDriver(chromeOptions);
                logger.info("***** Browser is chrome *****");
                break;
            }
            case "chrome-headless": {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                logger.info("***** Browser is chrome-headless *****");
                break;
            }
            case "firefox-headless": {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                logger.info("***** Browser is firefox-headless *****");
                break;
            }
            default: {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--disable-notifications");
                driver= new ChromeDriver();
                logger.info("***** Browser is chrome-bonigarcia *****");
                break;
            }
        }
        driver.manage().deleteAllCookies();
        driver.navigate().to(configFileReader.getBaseUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configFileReader.getImplicityWait()));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(configFileReader.getPageLoadTimeout()));
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(configFileReader.getWebDriverWait()));
    }
}
