package org.example.pages;

import org.example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PG05_WishList {

    public WebElement whichBt11()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-11"));
    }
    public WebElement whichBt25()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-25"));
    }
    public WebElement win8add(){return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/windows-8-pro\"]"));}
}
