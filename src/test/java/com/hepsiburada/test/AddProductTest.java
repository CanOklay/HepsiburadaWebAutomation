package com.hepsiburada.test;

import com.hepsiburada.base.Methods;
import com.hepsiburada.listener.RetryAnalyzer;
import org.testng.annotations.Test;

import static com.hepsiburada.constant.Constants.*;
import static com.hepsiburada.element.HomePageElements.*;
import static com.hepsiburada.element.LoginPageElements.*;

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
    }
}
