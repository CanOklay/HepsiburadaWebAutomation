package com.hepsiburada.element;

import org.openqa.selenium.By;

public class ProductElements {

    public static final By ALL_SELLERS = By.xpath("//*[@id=\"merchantTabTrigger\"]");
    public static final By ADD_TO_CART = By.id("addToCart");
    public static final By GO_TO_CART = By.xpath("//button[@type='button'][contains(text(), 'Sepete git')]");
    public static final By PRODUCT_NAME_AT_CART = By.cssSelector("div[class='product_name_3Lh3t'] > a");
    public static final By PRODUCT_NAME = By.xpath("//*[@id=\"product-name\"]/text()");
    public static final By DELETE_PRODUCT = By.cssSelector("a[class='product_delete_1zR-0']");
    public static final By EMPTY_CART = By.cssSelector("div[class='content_Z9h8v'] > h1");
}
