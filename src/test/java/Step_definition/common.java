package Step_definition;

import Base.TestBase;
import Pages.CreatedNewUserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class common extends TestBase {


    @Before
    public void setup() throws IOException{
        initialize();
    }
    @Given("^I am on app homepage$")
    public void iAmOnAppHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I click on signin$")
    public void iClickOnSignin() {
        CreatedNewUserPage page = PageFactory.initElements(driver, CreatedNewUserPage.class);
        page.ClickHomePageSignIn();
    }
}
