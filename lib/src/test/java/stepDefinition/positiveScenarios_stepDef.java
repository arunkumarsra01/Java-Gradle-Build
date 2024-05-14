package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;


public class positiveScenarios_stepDef {
    public WebDriver driver;

    @Given("User is in login page")
    public void userIsInLoginPage() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v2/");
    }

    @When("User enters the username as {string} and password as {string}")
    public void userEntersTheUsernameAsAndPasswordAs(String arg0, String arg1) {
        driver.findElement(By.cssSelector("[name='uid']")).sendKeys(arg0);
        driver.findElement(By.cssSelector("[name='password']")).sendKeys(arg1);
    }

    @And("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.cssSelector("[name='btnLogin']")).click();

    }

    @Then("User should able to verify the manager Id")
    public void userShouldAbleToVerifyTheManagerId() {
        driver.findElement(By.cssSelector(".menusubnav>li:nth-of-type(1)>a")).isDisplayed();
        driver.quit();
    }

    @Then("User should able to see the list of banking services provided")
    public void userShouldAbleToSeeTheListOfBankingServicesProvided() {
        List<WebElement> element= driver.findElements(By.cssSelector(".menusubnav li"));
        Assert.assertEquals(11,element.size());
    }


    @And("User clicks on the logout button")
    public void userClicksOnTheLogoutButton() {
        driver.findElement(By.cssSelector(".menusubnav>li:nth-of-type(11)>a")).click();
    }

    @Then("User should able to see the alert window")
    public void userShouldAbleToSeeTheAlertWindow() {
        String msg = driver.switchTo().alert().getText();
        Assert.assertEquals("You Have Succesfully Logged Out!!", msg);
        driver.quit();
    }

    @And("User click on the Edit customer option")
    public void userClickOnTheEditCustomerOption() {
        driver.findElement(By.cssSelector(".menusubnav li:nth-of-type(3) a")).click();

    }

    @And("User enters the account details and updates the city details")
    public void userEntersTheAccountDetailsAndUpdatesTheCityDetails() {
        driver.findElement(By.cssSelector("[name='cusid']")).sendKeys("38535");
        driver.findElement(By.cssSelector("[value='Submit']")).click();
        driver.findElement(By.cssSelector("[name='city']")).clear();
        driver.findElement(By.cssSelector("[name='city']")).sendKeys("Florida");


    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        driver.findElement(By.cssSelector("[type='submit']")).click();
        driver.quit();
    }

    @And("User enters the account details")
    public void userEntersTheAccountDetails() {
        driver.findElement(By.cssSelector("[name='cusid']")).sendKeys("38535");
        driver.findElement(By.cssSelector("[value='Submit']")).click();

    }

    @Then("User should able to see the entered details matched with saved scenario")
    public void userShouldAbleToSeeTheEnteredDetailsMatchedWithSavedScenario() {
        String city = driver.findElement(By.cssSelector("[name='city']")).getAttribute("value");
        Assert.assertEquals("Florida", city);
        driver.quit();
    }


}
