package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class negativeScenarios_stepDef {
    public WebDriver driver;

    @Given("User is in the login page")
    public void userIsInTheLoginPage() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v2/");
    }

    @And("User enters the invalid login details")
    public void userEntersTheInvalidLoginDetails() {
        driver.findElement(By.cssSelector("[name='uid']")).sendKeys("test");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("test");
        driver.findElement(By.cssSelector("[name='btnLogin']")).click();
    }

    @Then("User should able to see the error message")
    public void userShouldAbleToSeeTheErrorMessage() {
        String msg = driver.switchTo().alert().getText();
        Assert.assertEquals("User is not valid", msg);
        driver.switchTo().alert().accept();
        driver.quit();
    }


    @When("User enters  username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String arg0, String arg1) {
        driver.findElement(By.cssSelector("[name='uid']")).sendKeys(arg0);
        driver.findElement(By.cssSelector("[name='password']")).sendKeys(arg1);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        driver.findElement(By.cssSelector("[name='btnLogin']")).click();
    }


    @And("User click on the edit option")
    public void userClickOnTheEditOption() {
        driver.findElement(By.cssSelector(".menusubnav>li:nth-of-type(6)>a")).click();

    }

    @And("User clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        driver.findElement(By.cssSelector("[value='Submit']")).click();

    }

    @Then("User should able to see the prompt message")
    public void userShouldAbleToSeeThePromptMessage() {
        String msg=driver.switchTo().alert().getText();
        Assert.assertEquals("Please fill all fields",msg);
        driver.switchTo().alert().accept();
        driver.quit();
    }

    @And("User enters character values in the account number text box")
    public void userEntersCharacterValuesInTheAccountNumberTextBox() {
        driver.findElement(By.cssSelector("[name='accountno']")).sendKeys("test");
    }

    @Then("User should able to see the error message to update correct values")
    public void userShouldAbleToSeeTheErrorMessageToUpdateCorrectValues() {
        Assert.assertEquals("Characters are not allowed",driver.findElement(By.cssSelector("#message2")).getText());
        driver.quit();
    }

    @And("User clicks on the new customer option")
    public void userClicksOnTheNewCustomerOption() {
        driver.findElement(By.cssSelector(".menusubnav>li:nth-of-type(2)>a")).click();

    }

    @And("User enters the pin with three numerical characters")
    public void userEntersThePinWithThreeNumericalCharacters() {
        driver.findElement(By.cssSelector("[name='pinno']")).sendKeys("123");
    }


    @Then("User should able to see the message to have six digits")
    public void userShouldAbleToSeeTheMessageToHaveSixDigits() {
        Assert.assertEquals("PIN Code must have 6 Digits",driver.findElement(By.cssSelector("#message6")).getText());
        driver.quit();
    }

    @And("User enters the character values in the Telephone Number text box")
    public void userEntersTheCharacterValuesInTheTelephoneNumberTextBox() {
        driver.findElement(By.cssSelector("[name='telephoneno']")).sendKeys("test");

    }

    @Then("User should able to see the message to update the telephone number")
    public void userShouldAbleToSeeTheMessageToUpdateTheTelephoneNumber() {
        Assert.assertEquals("Characters are not allowed",driver.findElement(By.cssSelector("#message7")).getText());
        driver.quit();
    }
}