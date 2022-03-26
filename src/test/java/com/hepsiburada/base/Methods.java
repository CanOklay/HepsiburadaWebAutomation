package com.hepsiburada.base;

import org.openqa.selenium.By;

public class Methods extends BasePage{

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
        } catch (Exception e) {
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
}
