package com.hepsiburada.base;

import org.openqa.selenium.By;

import static com.hepsiburada.element.SearchElements.*;

/**
 * Created by Fatih Can Oklay
 * Date: 26.03.2022
 */

public class Methods extends BasePage {

    public void hover(By by) {
        try {
            hoverElement(by);
            logger.info("Hovered element: " + by);
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Can not hovered account box!");
            assertFail();
        }
    }

    public void click(By by) {
        try {
            clickElement(by);
            logger.info("Clicked element: " + by);
        } catch (
                Exception e) {
            logger.error(e.getMessage());
            logger.info("Can not clicked element!");
            assertFail();
        }

    }

    public void fillText(By by, String text) {
        try {
            sendKeys(by, text);
            logger.info("Text is written");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Text is not written!");
            assertFail();
        }
    }

    public void fillRange(int min, int max) {
        try {
            scrollToElement(RANGE_MIN);
            sendKeys(RANGE_MIN, String.valueOf(min));
            logger.info("Minimum value is written");
            sendKeys(RANGE_MAX, String.valueOf(max));
            logger.info("Maximum value is written");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Can not write minimum or maximum value!");
            assertFail();
        }
    }

    public void selectRandomProduct(By by) {
        try {
            selectRandomElement(by);
            logger.info("Random element is selected");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Random element can not selected");
            assertFail();
        }
    }
}
