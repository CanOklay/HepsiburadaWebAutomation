package com.hepsiburada.test;

import com.hepsiburada.manager.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

public class BaseTest extends DriverFactory {

    @Parameters("browser")
    @BeforeMethod
    public void before(@Optional("browser") String browser) throws MalformedURLException {
        setDriver(browser);
    }

    @AfterMethod
    public void after() {
        if (driver != null) {
            driver.quit();
        }
    }
}
