package com.nttdata.page;

import org.openqa.selenium.By;

public class CardPage {
    public static By quantity = By.xpath("//input[@id='quantity_wanted' and @name='qty']");
    public static By addbutton = By.className("add-to-cart");
    public static By modalProductAgregate = By.xpath("//h4[@class='modal-title h6 text-sm-center' and @id='myModalLabel']");
    public static By precio_compra = By.xpath("//div[@class='col-md-6']//p[@class='product-price']");
    public static By cantidad_compra = By.xpath("//div[@class='col-md-6']//span[@class='product-quantity']");
    public static By precio_final = By.xpath("//p[@class='product-total']//span[@class='value']");
    public static By finalizar_compra = By.xpath("//a[@class='btn btn-primary' and contains(text(),'Finalizar compra')]");
    public static By title_carrito = By.xpath("//h1[@class='h1' and text()='Carrito']");
    public static By precio_carrito = By.xpath("//div[@class='current-price']//span[@class='price']");
    public static By cantidad_carrito = By.xpath("//input[@name='product-quantity-spin']");
    public static By precio_final_carrito = By.xpath("//span[@class='product-price']");
}
