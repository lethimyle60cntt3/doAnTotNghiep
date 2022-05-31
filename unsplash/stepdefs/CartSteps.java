package com.unsplash.stepdefs;

import com.unsplash.apihelper.CollectionHelper;
import com.unsplash.pages.*;
import com.unsplash.utils.Context;
import cucumber.api.java8.Th;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java8.En;
import jdk.nashorn.internal.ir.LiteralNode;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps extends AbstractStep implements En {
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
    @Autowired
    private BasePage basePage;

    public CartSteps() {

        And("^the user clicks on Cart button$", () -> {
            Thread.sleep(4000);
            cartPage.clickElement(cartPage.cartElm);
        });
        Then("^the user should see Continue shopping button$", () -> {
            Thread.sleep(5000);
            assertThat(cartPage.isElementDisplayed(cartPage.continueShoppingElm)).isTrue();
        });
        And("^the user clicks on first products$", () -> {
            Thread.sleep(3000);
            cartPage.clickElement(cartPage.productElm);
        });
        And("^the user clicks on first product$", () -> {
            Thread.sleep(3000);
            cartPage.clickElement(cartPage.firstProduct);
        });

        And("^the user clicks on choose to buy button$", () -> {
            Thread.sleep(2000);
            cartPage.clickElement(cartPage.chooseToBuyElm);
        });
        Then("^the user should see view cart and checkout button$", () -> {
            Thread.sleep(2000);
            assertThat(cartPage.isElementDisplayed(cartPage.viewCardCheckoutBtn)).isTrue();
        });
        And("^the user clicks on selection all$", () -> {
            Thread.sleep(2000);
            cartPage.clickElement(cartPage.selectionAllElm);
        });

        And("^the user clicks on increase button$", () -> {
            String qtyNumber = cartPage.getValue(cartPage.qtyNumberEle);
            world.scenarioContext.setContext(Context.QUALITY_NUMBER, qtyNumber);
            Thread.sleep(5000);
            cartPage.clickElement(cartPage.increaseElm);
        });
        And("^the user clicks on Delete button$", () -> {
            Thread.sleep(3000);
            cartPage.clickElement(cartPage.deleteProduct);
        });
        And("^the user clicks on confirm button$", () -> {
            Thread.sleep(3000);
            cartPage.clickElement(cartPage.confirmElm);
        });
        And("^the user clicks on shop button$", () -> {
            Thread.sleep(2000);
            cartPage.clickElement(cartPage.shopElm);
        });
        Then("^the user goes to Shop page$", () -> {
            Thread.sleep(2000);
            assertThat(cartPage.isElementDisplayed(cartPage.viewShopElm)).isTrue();
        });
        Then("^the user should see Please select the product to delete message$", () -> {
            assertThat(cartPage.isElementDisplayed(cartPage.selectProduct)).isTrue();
        });
        And("^the user clicks on Buy product button$", () -> {
            Thread.sleep(2000);
            cartPage.scrollIntoView(cartPage.promotionDivItem,false);
            cartPage.clickElement(cartPage.buyBtn);

        });
        Then("^the user should see message you still have not selected the product to buy$", () -> {
            Thread.sleep(2000);
            assertThat(cartPage.isElementDisplayed(cartPage.notselectProduct)).isTrue();
        });
        And("^the user clicks on change address$", () -> {
            Thread.sleep(2000);
            cartPage.clickElement(cartPage.changeAddress);
        });
        And("^the user clicks on fix button$", () -> {
            Thread.sleep(2000);
            cartPage.clickElement(cartPage.fixAddress);
        });
        And("^the user clicks update button$", () -> {
            Thread.sleep(2000);
            cartPage.clickElement(cartPage.updateBtn);
        });
        And("^the user clicks on Ordered button$", () -> {
            Thread.sleep(2000);
            cartPage.clickElement(cartPage.orderedElm);
        });
        Then("^the user should see go back to the main page button$", () -> {
            Thread.sleep(4000);
            assertThat(cartPage.isElementDisplayed(cartPage.goBackMainPage)).isTrue();
        });
        Then("^the user should see address is changed$", () -> {
            assertThat(cartPage.isElementDisplayed(cartPage.successMessage)).isTrue();
        });

        Then("^the number quantity should increase \"([^\"]*)\"$", (String number) -> {
            Thread.sleep(3000);
            String oldQty = (String)world.scenarioContext.getContext(Context.QUALITY_NUMBER);
            int newQty =  Integer.parseInt(cartPage.getValue(cartPage.qtyNumberEle));
            int expectedQty = Integer.parseInt(oldQty) + Integer.parseInt(number);
            assertThat(newQty).isEqualTo(expectedQty);
        });


    }


}






