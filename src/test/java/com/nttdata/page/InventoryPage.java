package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.xpath(".//h2[@class='h3 product-title']/a");
    public static By itemsCards = By.cssSelector("div.inventory_item");

    public static By itemsList = By.xpath("//div[@class='js-product product col-xs-12 col-sm-6 col-xl-4']");
}
