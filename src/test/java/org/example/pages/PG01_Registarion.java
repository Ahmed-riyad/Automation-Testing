package org.example.pages;

import org.example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PG01_Registarion {

    public WebElement registerBtn()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }


    public WebElement fName()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lName()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement day()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement month()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement year()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }


    public WebElement email()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordtxt()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmpassTxt()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement result()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}
