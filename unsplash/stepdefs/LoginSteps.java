package com.unsplash.stepdefs;

import com.unsplash.apihelper.CollectionHelper;
import com.unsplash.pages.*;
import com.unsplash.testdata.CommonData;
import com.unsplash.utils.Props;
import io.cucumber.java8.En;
import io.cucumber.java8.Th;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class LoginSteps extends AbstractStep implements En {
    @Autowired
    private MainPage mainPage;
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private CollectionHelper collectionHelper;
    @Autowired
    private TIKINGONPage tikingonPage;

    public LoginSteps() {
        When("^the user is on the main page$", () -> {
            mainPage.open(Props.getProp("baseUrl"));
        });

        When("^the user goes to Login Page$", () -> {
            mainPage.clickElement(mainPage.loginBtn);
            Thread.sleep(1000);
        });

        And("^input phone number \"([^\"]*)\"$", (String phoneNumber) -> {
            loginPage.setValue(loginPage.phoneNumberElm, phoneNumber);
        });
        And("^click on Next button$", () -> {
            loginPage.clickElement(loginPage.continueElm);
        });

        And("^input password \"([^\"]*)\"$", (String password) -> {
            Thread.sleep(1000);
            loginPage.setValue(loginPage.passwordElm, password);
        });
        And("^click on Login button$", () -> {
            Thread.sleep(1000);
            loginPage.clickElement(loginPage.loginBtnElm);
        });

        And("^login with account \"(.*)\"", (String account) -> {
            String phoneNumber = CommonData.accountInfo.get(account)[0];
            String password = CommonData.accountInfo.get(account)[1];
            loginPage.setValue(loginPage.phoneNumberElm, phoneNumber);
            loginPage.clickElement(loginPage.continueElm);
            Thread.sleep(1000);
            loginPage.setValue(loginPage.passwordElm, password);
            Thread.sleep(1000);
            loginPage.clickElement(loginPage.loginBtnElm);
        });


        Then("^should see logo Tiki$", () -> {
            assertThat(loginPage.isElementDisplayed(loginPage.logoTikiElm)).isTrue();
        });

        Then("^should see message phone number is not formatted$", () -> {
            assertThat(loginPage.isElementDisplayed(loginPage.errorMessageElm)).isTrue();
        });

    }
}
