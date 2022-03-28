package com.hepsiburada.element;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 26.03.2022
 */

public class HomePageElements {

    public static final By ACCOUNT_BOX = By.id("myAccount");
    public static final By SEARCH_BOX = By.cssSelector("div[role='combobox'] > input[type='text']");
    public static final By SEARCH_BUTTON = By.cssSelector("div[class='SearchBoxOld-buttonContainer']");
    public static final By LOGIN = By.id("login");
}
