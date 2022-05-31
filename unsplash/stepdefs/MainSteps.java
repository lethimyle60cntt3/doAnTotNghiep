package com.unsplash.stepdefs;
import com.unsplash.apihelper.CollectionHelper;
import com.unsplash.pages.*;
import com.unsplash.testdata.CommonData;
import com.unsplash.utils.Props;
import io.cucumber.java8.En;
import io.cucumber.java8.Th;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

public class MainSteps extends AbstractStep implements En {
    @Autowired
    private MainPage mainPage;
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private CollectionHelper collectionHelper;
    @Autowired
    private CartPage cartPage;
    @Autowired
    private TIKINGONPage tikingonPage;


    public MainSteps(){

        And("^the user inputs \"([^\"]*)\"$", (String iteam) -> {
            Thread.sleep(2000);
            mainPage.setValue(mainPage.itemElm,iteam);
        });
        And("^click on Search button$", () -> {
           Thread.sleep(2000);
            mainPage.clickElement(mainPage.search);

        });
        Then("^The screen should display a list of products similar to the product you want to find$", () -> {
            Thread.sleep(2000);
            assertThat(mainPage.isElementDisplayed(mainPage.resultElm)).isTrue();
        });
        When("^the user clicks on product catalog$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.meatElm);
        });
        Then("^User should redirect to product category page$", () -> {
            Thread.sleep(2000);
            assertThat(mainPage.isElementDisplayed(mainPage.logoTikiElm)).isTrue();
        });
        And("^the user click on profitable shopping$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.profitableShopping);
        });
        Then("^the user should see Download the app now button$", () -> {
            assertThat(mainPage.isElementDisplayed(mainPage.downloadApp)).isTrue();
        });

        And("^the user clicks on account$", () -> {
            Thread.sleep(3000);
            mainPage.clickElement(mainPage.account);
        });
        And("^the user clicks on My order$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.orderElm);
        });
        Then("^the user should see Find Orders button$", () -> {
            assertThat(mainPage.isElementDisplayed(mainPage.findorder)).isTrue();
        });
        ///////////////////////
        And("^the user clicks on my notice$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.myNotice);
        });
        And("^the user clicks on my account$", () -> {
            Thread.sleep(3000);
            mainPage.clickElement(mainPage.information);
        });
        Then("^the user should see infomation account$", () -> {
            Thread.sleep(2000);
            assertThat(mainPage.isElementDisplayed(mainPage.informaitonElm)).isTrue();
        });
        And("^the user clicks on Easy exchange and return button$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.changeElm);
        });
        Then("^the user should see Question input box for Tiki$", () -> {
            Thread.sleep(2000);
            assertThat(mainPage.isElementDisplayed(mainPage.inputQuestionElm)).isTrue();
        });
        Then("^the user should see text return Management$", () -> {
            Thread.sleep(2000);
            assertThat(mainPage.isElementDisplayed(mainPage.returnManagement)).isTrue();
        });
        And("^the user clicks on notification$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.notificationElm);
        });
        Then("^the user should see My notification$", () -> {
            Thread.sleep(2000);
            assertThat(mainPage.isElementDisplayed(mainPage.mynotification)).isTrue();
        });
        And("^the user cliks on review product$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.commentProduct);
        });
        Then("^the user should see text Review purchased products$", () -> {
            Thread.sleep(2000);
            assertThat(mainPage.isElementDisplayed(mainPage.commentElm)).isTrue();
        });
        And("^the user clicks on return goods in my account$", () -> {
            Thread.sleep(4000);
            mainPage.clickElement(mainPage.returnGoods);
        });
        Then("^the user should see text Hello, how can Tiki help you\\?$", () -> {
            assertThat(mainPage.isElementDisplayed(mainPage.inputQuestionElm)).isTrue();
        });
        And("^the user clicks on logout button$", () -> {
            Thread.sleep(2000);
            mainPage.clickElement(mainPage.logOutElm);
        });
        Then("^the user should see Login button$", () -> {
            Thread.sleep(5000);
            assertThat(mainPage.isElementDisplayed(mainPage.loginBtnElm)).isTrue();
        });


    }
}
