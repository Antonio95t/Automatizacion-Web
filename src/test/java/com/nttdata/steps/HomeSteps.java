package com.nttdata.steps;

import com.nttdata.page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeSteps{
    private WebDriver driver;
    public HomeSteps(WebDriver driver){
        this.driver = driver;
    }
    public void redInicio_sesion(){
        this.driver.findElement(HomePage.menuLogin).click();
    }

    public void redMenucategoria(String categoria,String subcategoria) {
        String menuXpath = "//a[contains(.,'"+categoria+"')]";
        this.driver.findElement(By.xpath(menuXpath)).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li/a[text()='" + subcategoria + "']")));
        String submenuXpath ="//li/a[text()='"+subcategoria+"']";
        this.driver.findElement(By.xpath(submenuXpath)).click();
    }
}
