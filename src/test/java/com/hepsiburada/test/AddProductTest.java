package com.hepsiburada.test;

import com.hepsiburada.base.Methods;
import com.hepsiburada.listener.RetryAnalyzer;
import org.testng.annotations.Test;

import static com.hepsiburada.constant.Constants.*;
import static com.hepsiburada.element.HomePageElements.*;
import static com.hepsiburada.element.LoginPageElements.*;
import static com.hepsiburada.element.ProductElements.*;
import static com.hepsiburada.element.SearchElements.*;

/**
 * Created by Fatih Can Oklay
 * Date: 26.03.2022
 */

public class AddProductTest extends Methods {

    @Test(testName = "Search cell phone, filter price range, select random product, go to product detail page, add the product that has the lowest seller point and check the basket",
    retryAnalyzer = RetryAnalyzer.class)
    public void search_cellphone_filter_price_select_random_product_get_product_detail_page_add_basket_lowest_seller_point() throws InterruptedException {
        hover(ACCOUNT_BOX);
        click(LOGIN);
        fillText(EMAIL, USER_EMAIL);
        click(LOGIN_BUTTON_EMAIL);
        fillText(PASSWORD, USER_PASSWORD);
        click(LOGIN_BUTTON_PASSWORD);
        assertEquals(driver.getTitle(), TITLE);
        fillText(SEARCH_BOX, CELL_PHONE_TEXT);
        click(SEARCH_BUTTON);
        fillRange(3000, 5000);
        click(OKAY_BUTTON);
        selectRandomProduct(PRODUCT_LIST);
        String productName = getText(PRODUCT_NAME);
        click(ADD_TO_CART);
        click(GO_TO_CART);
        String productNameAtCart = getText(PRODUCT_NAME_AT_CART);
        assertEquals(productName, productNameAtCart);
        click(DELETE_PRODUCT);
        assertEquals(getText(EMPTY_CART), EMPTY_CART_TEXT);
    }
}
