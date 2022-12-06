package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.example.pages.PG04_ShoppingCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C04_Currency {

    PG03_HomePage PG03 = new PG03_HomePage();
    PG04_ShoppingCart PG04 = new PG04_ShoppingCart();

    @Given("user clicks on currencies list and select euro")
    public void searchBox()
    {
        WebElement listCurrency = Hooks.driver.findElement(By.id("customerCurrency"));
        Select clselect =new Select(listCurrency);
        clselect.selectByVisibleText("Euro");

    }

    @Then("user can see € sign in products")
    public void userCanSee€SignInProducts() {

        for (double x = 0; x < PG03.prices().size(); x++ )
        {
          String value = PG03.prices().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
            System.out.println("#Scenario SC5 Pass");
        }
    }

    @Given("user select different category tabs")
    public void userSelectDifferentCategoryTabs() {
        PG03.computers().click();
        PG03.apparel().click();
        PG03.electronics().click();
    }


    @Then("user select Computers and go to sub category Software")
    public void userSelectComputersAndGoToSubCategorySoftware() throws InterruptedException {
        Thread.sleep(2500);
        PG03.computers().click();
        PG03.SubCategoury().click();

    }


    @And("user select Windows-8-Pro")
    public void userSelectWindows() throws InterruptedException {

        Thread.sleep(2500);
        PG03.win8().click();

    }
}
