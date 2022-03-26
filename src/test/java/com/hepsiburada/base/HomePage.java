package com.hepsiburada.base;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public void hover(By by) {
        try {
            hoverElement(by);
            logger.info("Hovered account box");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Can not hovered account box");
            assertFail();
        }
    }
}
