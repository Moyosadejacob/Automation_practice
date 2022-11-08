package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdateDeleteAndAddNewAddress {
    public int random;

    @FindBy(how = How.LINK_TEXT,using = "Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME,using = "email")
    public static WebElement EnterValidEmail;

    @FindBy(how = How.ID_OR_NAME,using = "passwd")
    public static WebElement EnterValidPassword;

    @FindBy(how = How.ID_OR_NAME,using = "SubmitLogin")
    public static WebElement SignInSuccessful;

    @FindBy(how = How.XPATH,using = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    public static WebElement ClickMyAddresses;

    @FindBy(how = How.LINK_TEXT,using = "Update")
    public static WebElement ClickToUpdateAddress;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement City;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement State;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID_OR_NAME, using = "id_country")
    public static WebElement ValidCountry;

    @FindBy(how = How.ID_OR_NAME, using = "phone")
    public static WebElement HomePhone;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement PhoneMobile;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement AddressAlias;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitAddress\"]")
    public static WebElement AddressSaved;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]")
    public static WebElement AddressDeleted;


public void ClickHomePageSignn(){
    SignInLink.click();
}

    public void InputValidUsername(){
        EnterValidEmail.sendKeys("lanre_april@gmail.com");
    }

    public void InputValidPassword(){
        EnterValidPassword.sendKeys("testing");
    }

    public void ClickSubmitLogIn(){
        SignInSuccessful.click();
    }

    public void AddressButtonClicked(){
        ClickMyAddresses.click();
    }

    public void UpdateAddress(){
        ClickToUpdateAddress.click();
    }

    public void EnterAddress()  {
        Address.clear();
        Address.sendKeys("No 4 Real Street");


    }

    public void EnterCity() {
        City.clear();
        City.sendKeys("Chicago");

    }

    public void SelectState() {
        Select state = new Select(State);
        state.selectByVisibleText("Illinois");

    }

    public void EnterPostcode() {
        Postcode.clear();
        Postcode.sendKeys("22222");

    }

    public void EnterHomePhone() {
        HomePhone.clear();
        HomePhone.sendKeys("077654332");

    }





    public void EnterAlias() {
        AddressAlias.clear();
        AddressAlias.sendKeys("QC House");

    }

    public void AddressSubmitted() {
        AddressSaved.click();

    }

}
