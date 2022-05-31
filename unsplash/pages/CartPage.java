package com.unsplash.pages;

import com.unsplash.utils.ObjectMap;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class CartPage extends BasePage {
    private ObjectMap objectmap = new ObjectMap("./src/test/java/com/unsplash/locators/cart_page.properties");

    public By fixAddress = objectmap.getLocator("cartPage.fixAddress");
    public By updateBtn = objectmap.getLocator("cartPage.updateAddress");
    public By cartElm = objectmap.getLocator("cartPage.cartBtn");
    public By productElm = objectmap.getLocator("cartPage.product1");
    public By firstProduct = objectmap.getLocator("cartPage.firstproduct");
    public By chooseToBuyElm = objectmap.getLocator("cartPage.chooseToBuy");
    public By selectionAllElm = objectmap.getLocator("cartPage.sellectionAll");
    public By increaseElm = objectmap.getLocator("cartPage.increase");
    public By deleteProduct = objectmap.getLocator("cartPage.delete");
    public By confirmElm = objectmap.getLocator("cartPage.confirm");
    public By shopElm = objectmap.getLocator("cartPage.shop");
    public By buyBtn = objectmap.getLocator("cartPage.buyBtn");
    public By promotionDivItem = objectmap.getLocator("cartPage.promotionDiv");
    public By changeAddress = objectmap.getLocator("cartPage.changeAddress");
    public By orderedElm = objectmap.getLocator("cartPage.ordered");
    public By qtyNumberEle = objectmap.getLocator("cartPage.qtyNumber");
    public By goBackMainPage = objectmap.getLocatorAndFormats("cartPage.goBackMainPage");
    public By continueShoppingElm = objectmap.getLocatorAndFormats("cartPage.continueShopping");
    public By viewCardCheckoutBtn = objectmap.getLocatorAndFormats("cartPage.ViewCardCheckout");
    public By viewShopElm = objectmap.getLocatorAndFormats("cartPage.follow");
    public By selectProduct = objectmap.getLocatorAndFormats("cartPage.selectproduct");
    public By notselectProduct = objectmap.getLocatorAndFormats("cartPage.notselect");
    public By successMessage = objectmap.getLocatorAndFormats("cartPage.message");
}
