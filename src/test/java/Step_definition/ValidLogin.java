package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin extends TestBase {
   // public WebDriver driver;
   // @Given("^I am on the homepage$")
   // public void iAmOnTheHomepage() {

      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omistaja\\chromedriver_win32\\chromedriver.exe");
      //  driver=new ChromeDriver();
      //  driver.manage().window().maximize();
      //  driver.navigate().to("http://automationpractice.com/index.php");
   // }

   // @When("^I click the sign in button$")
    // public void iClickTheSignInButton() {
     //   driver.findElement(By.linkText("Sign in")).click();
   // }

    @And("^I enter valid username$")
    public void iEnterValidUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");
    }

    @When("^I click the login button$")
    public void iClickTheLoginButton() {
       driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
       // driver.findElement(By.xpath("//span[text() = 'Sign in']")).click();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        String ExpectedLogInUser = "Dorice Mbonde";
        String ActualLogInUser = driver.findElement(By.xpath("//span[text() = 'Dorice Mbonde']")).getText();
       // String ActualLogInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLogInUser, ActualLogInUser);
        System.out.println(ActualLogInUser);
        driver.quit();
    }
}
