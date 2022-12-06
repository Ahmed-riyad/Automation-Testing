package org.example.stepsDefin;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.PG02_Login;
import org.testng.asserts.SoftAssert;



public class C02_LoginSteps {

    PG02_Login login = new PG02_Login();

    // #Scenario SC2

    @Given("user go to login page")
    public void loginPage() throws InterruptedException {
        login.loginBtn().click();
        Thread.sleep(3000);
    }

    @Then("user enter email {string} and Password {string}")
    public void userEnterEmailAndPassword(String arg0, String arg1) {
        login.email().sendKeys(arg0);
        login.password().sendKeys(arg1);

    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        login.password().submit();
    }

    @Then("Screen Navigate to home page")
    public void screenNavigateToHomePage() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert link = new SoftAssert();
        link.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/", "Login page Successfully ");
        link.assertTrue(login.pageUrl().isDisplayed(), "Account is Logged In");
        link.assertAll();
        System.out.println("#Scenario SC2 Pass");
    }

   // Rest Password #Scenario SC3

    @Then("user clicks on Forget password Link")
    public void userClicksOnForgetPasswordLink() {
        login.forgetPass().click();
    }

    @Then("user enter email {string}")
    public void userEnterEmail(String arg0) {
        SoftAssert page = new SoftAssert();
        page.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/passwordrecovery", "Recover Page");
        login.email().sendKeys(arg0);
        page.assertAll();
    }

    @When("user clicks on Recover button")
    public void userClicksOnRecoverButton() {
        login.sendEmail().click();
    }

    @Then("Success massage appears in green on screen")
    public void successMassageAppearsInGreenOnScreen() throws InterruptedException {
        String expictedResult = "Email with instructions has been sent to you.";
        String aactualResult = login.actual().getText();
        Thread.sleep(2000);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(aactualResult.contains(expictedResult), "Massage Appear");
        soft.assertTrue(login.SuccsesMsg().isDisplayed(), "Text Displayed");

        System.out.println("Your Result is : " + aactualResult);
        soft.assertAll();
        System.out.println("#Scenario SC3 pass");
    }


}
