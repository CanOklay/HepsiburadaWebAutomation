package com.hepsiburada.stepImplementation;

import com.hepsiburada.base.HomePage;
import com.hepsiburada.logs.Logs;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import static com.hepsiburada.element.HomePageElements.*;

public class HomeTest extends HomePage {

    Logger logger = LogManager.getLogger(Logs.class.getName());

    @Test(testName = "Search cell phone, filter price range, select random product, go to product detail page, add the product that has the lowest seller point and check the basket")
    public void testCase1() {
        hover(ACCOUNT_BOX);
    }
}
