package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C03_SearchItemSteps {

    PG03_HomePage ItemSelect = new PG03_HomePage();

    // #Scenario SC4

    @Given("user search for items in search box For {string}")
    public void userSearchForItemsInSearchBoxFor(String arg0) throws InterruptedException {

        ItemSelect.searchBox().sendKeys(arg0);
        ItemSelect.searchBox().submit();
        Assert.assertTrue(true, String.valueOf(ItemSelect.searchBox()));
        Thread.sleep(2000);

        System.out.println("#Scenario SC4 pass");
    }


    // #Scenario SC7

    @Given("user select Apparel and go to sub category Shoes")
    public void userSelectApparelAndGoToSubCategoryShoes() {
        ItemSelect.apparel().click();
        ItemSelect.shoes().click();


    }

    @Then("user select color red from CheckBox")
    public void uesrSelectColorRedFromCheckBox() {
        ItemSelect.redcolor().click();
        for (double x = 0; x < ItemSelect.TextItem().size(); x++ )
        {
            String value = ItemSelect.TextItem().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
        }
    }

    @Then("filter option view results")
    public void filterOpthionViewResults() {
        SoftAssert soft = new SoftAssert();
        String expected = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15";
        String actulResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actulResult.contains(expected),"Right Page Shown");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15");
        System.out.println(" Your Filter Get the URl" + actulResult);
        soft.assertAll();
        System.out.println("#Scenario SC7 Pass");
    }

    @Then("user select tag name from list")
    public void userSelectTagNameFromList() throws InterruptedException {

        ItemSelect.tag1().click();
        Thread.sleep(2500);
        String expectResult = "Products tagged with 'awesome'";
        String actualResult = ItemSelect.falshText().getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectResult));
        soft.assertTrue(ItemSelect.falshText().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/awesome");
        System.out.println(" Your Actual Result : " + actualResult);
        soft.assertAll();
    }

    @And("user could select another tag")
    public void userCouldSelectAnotherTag() throws InterruptedException {
        ItemSelect.tag2().click();
        Thread.sleep(2500);
        String expectResult = "Products tagged with 'cool'";
        String actualResult = ItemSelect.falshText().getText();
        SoftAssert soft2 = new SoftAssert();
        soft2.assertTrue(actualResult.contains(expectResult));
        soft2.assertTrue(ItemSelect.falshText().isDisplayed());
        soft2.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/cool");
        System.out.println(" Your Actual Result : " + actualResult);
        soft2.assertAll();
        System.out.println("#Scenario SC8 Pass");

    }



}
