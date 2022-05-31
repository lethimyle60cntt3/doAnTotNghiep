package com.unsplash.stepdefs;

import com.unsplash.apihelper.CollectionHelper;
import com.unsplash.pages.CartPage;
import com.unsplash.pages.LoginPage;
import com.unsplash.pages.MainPage;
import com.unsplash.pages.TIKINGONPage;
import com.unsplash.utils.Context;
import cucumber.api.java8.En;
import io.cucumber.java8.Th;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class TIKINGONSteps extends AbstractStep implements io.cucumber.java8.En {
    @Autowired
    private MainPage mainPage;
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private CollectionHelper collectionHelper;
    @Autowired
    private CartPage cartPage;
    @Autowired
    private World world;
    @Autowired
    private TIKINGONPage tikingonPage;

    public TIKINGONSteps() {
        And("^click Fruit button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.fruitBtn);
        });
        And("^click any item", () -> {
            Thread.sleep(2000);
            Random randomUtil = new Random();
            int random = randomUtil.nextInt(72);
            tikingonPage.clickAnyItem(String.valueOf(random));
        });
        And("^click Add button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.addBtn);
        });
        And("^click turn off button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.turnOffElm);
        });
        And("^click Cart button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.cartBtn);
        });
        Then("^should see See button on Cart$", () -> {
            Thread.sleep(2000);
            assertThat(tikingonPage.isElementDisplayed(tikingonPage.seeCart)).isTrue();

        });
        And("^click see button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.seeBtn);
        });
        And("^click plus button$", () -> {
            Thread.sleep(2000);
            world.scenarioContext.setContext(Context.QUALITY_NUMBER, tikingonPage.getValue(tikingonPage.qtyNumberEle));
            tikingonPage.clickElement(tikingonPage.plusElm);
        });
        Then("^the number quantity should increase \"([^\"]*)\" unit$", (String number) -> {
            Thread.sleep(3000);
            String oldQty = (String)world.scenarioContext.getContext(Context.QUALITY_NUMBER);
            int newQty =  Integer.parseInt(tikingonPage.getValue(tikingonPage.qtyNumberEle));
            int expectedQty = Integer.parseInt(oldQty) + Integer.parseInt(number);
            assertThat(newQty).isEqualTo(expectedQty);
        });
        And("^click Buy button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.buyELm);
        });
        And("^click save address button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.saveAddress);
        });
        Then("^Should see message block$", () -> {
            Thread.sleep(2000);
            assertThat(tikingonPage.isElementDisplayed(tikingonPage.messageBlock)).isTrue();
        });
        And("^click detele buton$", () -> {
            world.scenarioContext.setContext(Context.GOOD_NAMES_CART, tikingonPage.getStoreNames());
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.deleteElm);
        });
        And("^click confirm delete button$", () -> {
            Thread.sleep(3000);
            tikingonPage.clickElement(tikingonPage.deleteBtn);
        });
        Then("^should see the message$", () -> {
            Thread.sleep(2000);
            assertThat(tikingonPage.isElementDisplayed(tikingonPage.message)).isTrue();
        });
        And("^click No button$", () -> {
            Thread.sleep(2000);
            tikingonPage.clickElement(tikingonPage.noElm);
        });

        Then("^no good is deleted$", () -> {
            List listSaved = (List)world.scenarioContext.getContext(Context.GOOD_NAMES_CART);
            List listCurrent = tikingonPage.getStoreNames();

            assertThat(listSaved.size()==listCurrent.size());
        });



    }
}
