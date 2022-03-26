package com.hepsiburada.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Fatih Can Oklay
 * Date: 30.12.2021
 */

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
                            "json:target/cucumber-reports/cucumber.json"},
        features="src/test/resources/features",
        glue = {"com.hepsiburada.stepImplementation"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
