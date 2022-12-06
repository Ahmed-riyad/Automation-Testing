package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.example.pages.PG04_ShoppingCart;
import org.example.pages.PG05_WishList;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class C05_ShopingCart {

    PG04_ShoppingCart PG04 = new PG04_ShoppingCart();
    PG03_HomePage PG03 = new PG03_HomePage();
    PG05_WishList PG05 = new PG05_WishList();

    @And("user add item to Shopping cart")
    public void addItemsToShop() throws InterruptedException {
        Thread.sleep(2000);
        PG04.shoesAdd().click();
        Select select = new Select(PG04.size());
        select.selectByVisibleText("9");
        PG04.slectColor().click();
        PG04.addCart().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();

    }


    @Then("user go to Electronics category")
    public void userGoToElectronicsCategory() {
        PG03.electronics().click();


    }

    @And("user select Cell phones Subcategory")
    public void userSelectCellPhonesSubcategory() {
        PG04.SubElctro().click();
    }

    @Then("user select Mobile HTC One M-8")
    public void userSelectMobileHTCOneM() {
        PG04.HTC_M8().click();

    }

    @Then("user add mobiles to Quantity")
    public void userAddMobilesToQuantity() {
        PG04.HTCadd().clear();
        PG04.HTCadd().sendKeys("1");

    }
    @Then("user add mobile to Shopping cart")
    public void userAddMobileToShoppingCart() throws InterruptedException {

        PG04.HTCcart().click();
        Thread.sleep(3000);
        SoftAssert mobbuy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        mobbuy.assertTrue(actual.contains(expect));
        mobbuy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        mobbuy.assertAll();
        Thread.sleep(1500);
    }
    @And("user go to Shopping Cart page")
    public void userGoToShoppingCartPage() throws InterruptedException {
        Thread.sleep(3000);
        PG04.ShopingCartBtn().click();
    }


    @Then("user update Shopping cart Quantity")
    public void userUpdateShoppingCartQuantity() throws InterruptedException {
       Thread.sleep(2000);

        PG04.quant1().clear();
        PG04.quant1().sendKeys("1");
        PG04.quant2().clear();
        PG04.quant2().sendKeys("2");
        PG04.udatCart().click();
        Thread.sleep(2000);
    }

    @And("user remove one of items from cart")
    public void userRemoveOneOfItmesFromCart() throws InterruptedException {
        Hooks.driver.findElement(By.name("updatecart")).click();
        Thread.sleep(3000);
    }

    @Then("user add item to Wishlist")
    public void userAddItemToWishlist() throws InterruptedException {
        PG05.whichBt25().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }


    @Then("user select size and color")
    public void userSelectSizeAndColor() throws InterruptedException {
        Thread.sleep(2000);
        PG04.shoesAdd().click();
        Select select = new Select(PG04.size());
        select.selectByVisibleText("9");
        PG04.slectColor().click();
    }

    @And("user select Windows-8-Pro and added to Wishlist")
    public void userSelectWindowsWishlist() throws InterruptedException {
        PG05.win8add().click();
        PG05.whichBt11().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @Then("user add mobile to compare list")
    public void userAddMobileToCompareList() throws InterruptedException {
        PG04.ComparBtn().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }


    @Then("user select Mobile HTC One Mini Blue")
    public void userSelectMobileHTCOneMiniBlue() throws InterruptedException {

        PG04.HTCblue().click();
        PG04.ComparBtn().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @Then("user go to Compare Page")
    public void userGoToComparePage() {
        PG04.ComparePG().click();
        SoftAssert see1 = new SoftAssert();
        String expect = "Compare products";
        String actual = PG04.pageTxt().getText();
        see1.assertTrue(actual.contains(expect));
        see1.assertTrue(PG04.comparetxt().isDisplayed());
        System.out.println("Your Result :" + actual);
        see1.assertAll();
    }

    @Then("user check Agree Box and press CheckOut")
    public void userCheckAgreeBoxAndPressCheckOut() {
        Hooks.driver.findElement(By.id("termsofservice")).click();
        Hooks.driver.findElement(By.id("checkout")).click();
    }
}
