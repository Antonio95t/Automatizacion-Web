package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }
    public void getItem(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsList);
        if (!items.isEmpty()){
            WebElement firstitem = items.get(0);
            WebElement nombreitem = firstitem.findElement(InventoryPage.productsTitle);
            nombreitem.click();
        }
    }
}
