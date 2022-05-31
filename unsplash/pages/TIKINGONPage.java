package com.unsplash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.springframework.stereotype.Component;
import com.unsplash.utils.ObjectMap;

import java.util.ArrayList;
import java.util.List;


@Component
public class TIKINGONPage extends BasePage {

    private static ObjectMap objectMap = new ObjectMap("./src/test/java/com/unsplash/locators/TIKINGON_page.properties");

    public By fruitBtn = objectMap.getLocator("tikiNgonPage.Fruit");
    public By addBtn = objectMap.getLocator("tikiNgonPage.AddBtn");
    public By turnOffElm = objectMap.getLocator("tikiNgonPage.turnOff");
    public By cartBtn = objectMap.getLocator("tikiNgonPage.cartBtn");
    public By seeBtn = objectMap.getLocator("tikiNgonPage.seeCart");
    public By plusElm = objectMap.getLocator("tikiNgonPage.plusBtn");
    public By buyELm = objectMap.getLocator("tikiNgonPage.buyBtn");
    public By deleteElm = objectMap.getLocator("tikiNgonPage.deleteBtn");
    public By deleteBtn = objectMap.getLocator("tikiNgonPage.deleteElm");
    public By noElm = objectMap.getLocator("tikiNgonPage.NoBtn");
    public By saveAddress = objectMap.getLocator("tikiNgonPage.saveAddress");
    public By seeCart = objectMap.getLocator("tikiNgonPage.seeCart");
    public By qtyNumberEle = objectMap.getLocator("tikiNgonPage.qtity");
    public By messageBlock = objectMap.getLocator("tikiNgonPage.mesageBlock");
    public By message = objectMap.getLocator("tikiNgonPage.message");

    public void clickAnyItem(String index) throws InterruptedException {
        By anyFruit = objectMap.getLocatorAndFormats("tikiNgonPage.AnyItem", index);
        clickElement(anyFruit);
        Thread.sleep(3000);
        open(getCurrentURL());
    }
    public List<String> getStoreNames(){
        By storeNamesEle = objectMap.getLocator("tikiNgonPage.storeName");
        List<String> storeNames = new ArrayList();
        List<WebElement> listStore = getListElements(storeNamesEle);
        for(WebElement ele: listStore){
            String textValue = getText(ele);
            storeNames.add(textValue);
        }
        return storeNames;
    }


}
