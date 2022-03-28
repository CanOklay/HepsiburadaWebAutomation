package com.hepsiburada.element;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 28.03.2022
 */

public class SearchElements {

    public static final By RANGE_MIN = By.cssSelector("#fiyat > div > div > div > div > div.content-rangeInputRoot > div > div:nth-child(1) > input");
    public static final By RANGE_MAX = By.cssSelector("#fiyat > div > div > div > div > div.content-rangeInputRoot > div > div:nth-child(2) > input");
    public static final By PRODUCT_LIST = By.cssSelector("div[class='productListContent-innerWrapper'] > ul > li");
    public static final By OKAY_BUTTON = By.cssSelector("div.content-rangeInputRoot > button");
}
