package Step_definition;

import Base.TestBase;
import Pages.CreatedNewUserPage;
import Pages.UpdateDeleteAndAddNewAddress;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Common2 extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }
    @Given("^I launch application browser$")
    public void iLaunchApplicationBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omistaja\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @When("^I enter application URL$")
    public void iEnterApplicationURL() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I clickLogIn button$")
    public void iClickLogInButton() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.ClickHomePageSignn();
    }


    @And("^I enter correct Username$")
    public void iEnterCorrectUsername() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.InputValidUsername();

    }

    @When("^I enter correct password$")
    public void iEnterCorrectPassword() {
        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.InputValidPassword();
    }

    @Then("^I Log in successfully$")
    public void iLogInSuccessfully() {

        UpdateDeleteAndAddNewAddress page = PageFactory.initElements(driver, UpdateDeleteAndAddNewAddress.class);
        page.ClickSubmitLogIn();
    }
}
