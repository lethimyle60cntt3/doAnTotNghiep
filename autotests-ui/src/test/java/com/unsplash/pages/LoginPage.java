package com.unsplash.pages;

import org.openqa.selenium.By;

import org.springframework.stereotype.Component;
import com.unsplash.utils.ObjectMap;

@Component
public class LoginPage extends BasePage {

    private ObjectMap objectmap = new ObjectMap("./src/test/java/com/unsplash/locators/login_page.properties");
    public By phoneNumberElm = objectmap.getLocator("loginPage.inputPhoneNb");
    public By continueElm = objectmap.getLocator("loginPage.continueBtn");
    public By passwordElm = objectmap.getLocator("loginPage.inputPassword");
    public By loginBtnElm = objectmap.getLocator("loginPage.loginBtn");
    public By logoTikiElm = objectmap.getLocator("loginPage.logoTiki");
    public By errorMessageElm = objectmap.getLocator("loginPage.errorMessageElm");
}
