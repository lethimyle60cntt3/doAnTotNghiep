package com.unsplash.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import com.unsplash.utils.ObjectMap;

@Component
public class MainPage extends BasePage {

    private ObjectMap objectmap = new ObjectMap("./src/test/java/com/unsplash/locators/main_page.properties");
        public By loginBtn = objectmap.getLocator("mainPage.loginBtn");
        public By itemElm = objectmap.getLocator("mainPage.search");
        public By search = objectmap.getLocator("mainPage.searchBtn");
        public By meatElm = objectmap.getLocator("mainPage.tikingon");
        public By profitableShopping = objectmap.getLocator("mainPage.profitablesShopping");
        public By account = objectmap.getLocator("mainPage.myAccount");
        public By orderElm = objectmap.getLocator("mainPage.MyOrder");
        public By myNotice = objectmap.getLocator("mainPage.myNotice");
        public By information = objectmap.getLocator("mainPage.information");
        public By changeElm = objectmap.getLocator("mainPage.change");
        public By notificationElm = objectmap.getLocator("mainPage.notification");
        public By commentProduct = objectmap.getLocator("mainPage.comment");
        public By returnGoods = objectmap.getLocator("mainPage.returnGoods");
        public By logOutElm = objectmap.getLocator("mainPage.logOutBtn");
        public By resultElm = objectmap.getLocator("mainPage.resultSearch");
        public By logoTikiElm = objectmap.getLocator("mainPage.logoTikingon");
        public By downloadApp = objectmap.getLocatorAndFormats("mainPage.downloadApp");
        public By findorder = objectmap.getLocatorAndFormats("mainPage.searchProduct");
        public By informaitonElm = objectmap.getLocatorAndFormats("mainPage.informationAccount");
        public By inputQuestionElm = objectmap.getLocatorAndFormats("mainPage.question");
        public By returnManagement = objectmap.getLocatorAndFormats("mainPage.returnManagement");
        public By mynotification = objectmap.getLocatorAndFormats("mainPage.mynotification");
        public By commentElm = objectmap.getLocator("mainPage.commentProduct");
        public By loginBtnElm = objectmap.getLocatorAndFormats("mainPage.logInBtn");
}
