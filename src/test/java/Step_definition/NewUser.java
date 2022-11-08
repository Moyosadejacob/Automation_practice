package Step_definition;

import Pages.CreatedNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewUser {
    public WebDriver driver;
    public int random;
    @Given("^I get on the homescreen$")
    public void iGetOnTheHomescreen() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omistaja\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I get o the Login screen$")
    public void iGetOTheLoginScreen() throws InterruptedException {
        CreatedNewUserPage page = PageFactory.initElements(driver, CreatedNewUserPage.class);
        page.ClickHomePageSignIn();
     //   driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(5000);
    }

    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
        CreatedNewUserPage page = PageFactory.initElements(driver, CreatedNewUserPage.class);
        page.EnterEmailToCreateNewUser();

      //  random = 100 + (int) (Math.random() * (1000-1) +1);
       // driver.findElement(By.name("email_create")).sendKeys("lanre_july2022" + random + "@gmail.com");
    }

    @And("^I click the create accunt button$")
    public void iClickTheCreateAccuntButton() throws InterruptedException {

        CreatedNewUserPage page = PageFactory.initElements(driver, CreatedNewUserPage.class);
        page.ClickCreateAccButton();
      //  driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(2000);
    }

    @When("^I enter all required details$")
    public void iEnterAllRequiredDetails() {
        CreatedNewUserPage page = PageFactory.initElements(driver, CreatedNewUserPage.class);
        page.SelectGender();
        page.EnterUserFirstName();
        page.EnterUserLastName();
        page.EnterPassword();
        page.SelectDobDay();
        page.SelectDobMonth();
        page.SelectDobYear();
        page.EnterAddress();
        page.EnterCity();
        page.SelectState();
        page.EnterPostcode();
        page.EnterMobilePhone();
        page.EnterAlias();



       // driver.findElement(By.id("id_gender2")).click();
       // driver.findElement(By.name("customer_firstname")).sendKeys("Lola");
       // driver.findElement(By.name("customer_lastname")).sendKeys("Gold");
        //driver.findElement(By.name("passwd")).sendKeys("testing");
      //  Select day = new Select(driver.findElement(By.id("days")));
      //  day.selectByIndex(10);
      //  Select month = new Select(driver.findElement(By.id("months")));
      //  month.selectByValue("9");

      //  Select year = new Select(driver.findElement(By.id("years")));
       // year.selectByValue("1990");
      //  driver.findElement(By.id("address1")).sendKeys("No 1 testing street");
      //  driver.findElement(By.name("city")).sendKeys("Chicago");
      //  Select state = new Select(driver.findElement(By.id("id_state")));
      //  state.selectByVisibleText("Illinois");
      //  driver.findElement(By.name("postcode")).sendKeys("00000");
      //  driver.findElement(By.name("phone_mobile")).sendKeys("04000566333");
      //  driver.findElement(By.name("alias")).sendKeys("QA House");
      //  driver.findElement(By.name("city")).sendKeys("Chicago");
    }

    @And("^I click the register button$")
    public void iClickTheRegisterButton() {
        CreatedNewUserPage page = PageFactory.initElements(driver, CreatedNewUserPage.class);
        page.ClickRegisterButton();

        //driver.findElement(By.xpath("//span[text() = 'Register']")).click();

    }

    @Then("^My account should be successfully created$")
    public void myAccountShouldBeSuccessfullyCreated() {
        CreatedNewUserPage page = PageFactory.initElements(driver, CreatedNewUserPage.class);
        page.AssertLoggedInUser();

       // String ExpectedLogInUser = "Lola Gold";
       // String ActualLogInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
      //  Assert.assertEquals(ExpectedLogInUser, ActualLogInUser);
      //  System.out.println(ActualLogInUser);

    }
}
