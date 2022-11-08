package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreatedNewUserPage {
    public int random;

    //declare your locators

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email_create")
    public static WebElement CreateNewUserEmailField;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitCreate")
    public static WebElement CreateAnAccountButton;

    @FindBy(how = How.ID_OR_NAME, using = "id_gender2")
    public static WebElement FemaleGenderButton;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    public static WebElement CustomerFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    public static WebElement CustomerLastNmae;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement PassWord;

    @FindBy(how = How.ID_OR_NAME, using = "days")
    public static WebElement DObDays;

    @FindBy(how = How.ID_OR_NAME, using = "months")
    public static WebElement DobMonths;

    @FindBy(how = How.ID_OR_NAME, using = "years")
    public static WebElement DobYears;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement City;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement State;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement PhoneMobile;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement AddressAlias;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Register']")
    public static WebElement RegisterButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedInUser;


    //declare your methods

    public void ClickHomePageSignIn() {
        SignInLink.click();
    }

    public void EnterEmailToCreateNewUser() {
        random = 100 + (int) (Math.random() * (1000-1) +1);
        CreateNewUserEmailField.sendKeys("lanre_july2022" + random + "@gmail.com");
    }

    public void ClickCreateAccButton() throws InterruptedException {
        CreateAnAccountButton.click();
        Thread.sleep(5000);
    }

    public void SelectGender() {
        FemaleGenderButton.click();
    }

    public void EnterUserFirstName() {
        CustomerFirstName.sendKeys("Lola");
    }

    public void EnterUserLastName() {
        CustomerLastNmae.sendKeys("Gold");
    }

    public void EnterPassword() {
        PassWord.sendKeys("testing");
    }

    public void SelectDobDay() {
        Select day = new Select(DObDays);
        day.selectByIndex(10);
    }

    public void SelectDobMonth() {
        Select month = new Select(DobMonths);
        month.selectByValue("9");

    }

        public void SelectDobYear() {
            Select year = new Select(DobYears);
            year.selectByValue("1990");

        }

    public void EnterAddress() {
      Address.sendKeys("No 1 testing street");

    }

    public void EnterCity() {
        City.sendKeys("Chicago");

    }

    public void SelectState() {
        Select state = new Select(State);
        state.selectByVisibleText("Illinois");

    }

    public void EnterPostcode() {
        Postcode.sendKeys("00000");

    }

    public void EnterMobilePhone() {
        PhoneMobile.sendKeys("0444535289");

    }

    public void EnterAlias() {
        AddressAlias.sendKeys("QA House");

    }

    public void ClickRegisterButton() {
        RegisterButton.click();

    }

    public void AssertLoggedInUser() {

        String ExpectedLoggedInUser = "Lola Gold";
        String ActualLoggedInUser =  LoggedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);

    }
}
