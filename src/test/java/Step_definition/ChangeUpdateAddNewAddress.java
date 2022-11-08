package Step_definition;

import Pages.UpdateDeleteAndAddNewAddress;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ChangeUpdateAddNewAddress {
  public  WebDriver driver;
    @Given("^I launch app browser$")
    public void iLaunchAppBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omistaja\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("^I enter apps URL$")
    public void iEnterAppsURL() {
        driver.navigate().to("http://automationpractice.com/index.php");

    }

    @And("^I click on LogIn button$")
    public void iClickOnLogInButton() throws InterruptedException {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.ClickHomePageSignn();
        Thread.sleep(5000);
    }

    @And("^I enter a valid Username$")
    public void iEnterAValidUsername() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.InputValidUsername();

    }

    @When("^I enter a valid password$")
    public void iEnterAValidPassword() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.InputValidPassword();
    }

    @Then("^I am successfully log in$")
    public void iAmSuccessfullyLogIn() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.ClickSubmitLogIn();
    }

    @When("^I click on My addresses$")
    public void iClickOnMyAddresses() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.AddressButtonClicked();

    }

    @And("^I should be able to Update$")
    public void iShouldBeAbleToUpdate() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.UpdateAddress();
        page.EnterAddress();
        page.EnterCity();
        page.SelectState();
        page.EnterPostcode();
        page.EnterHomePhone();
        page.EnterAlias();

    }

    @Then("^I should be able to submit address$")
    public void iShouldBeAbleToSubmitAddress() {

        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.AddressSubmitted();
        driver.quit();

    }

}
