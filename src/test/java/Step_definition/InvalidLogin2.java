package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin2 {
    public WebDriver driver;
    @Given("^I get on the homepage$")
    public void iGetOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omistaja\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I press the sign button$")
    public void iPressTheSignButton() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @When("^I enter wrong username$")
    public void iEnterWrongUsername() {

        driver.findElement(By.name("email")).sendKeys("lanre_@gmail.com");
    }

    @And("^i enter correct password$")
    public void iEnterCorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");
    }

    @When("^I click the button to login$")
    public void iClickTheButtonToLogin() {

        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the right error message$")
    public void iShouldGetTheRightErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
        driver.quit();
    }
}
