package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;
    //By returningCustomerText = By.xpath("//div[@id='content']/div/div[2]//h2");
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;
    //By newCustomerText = By.xpath("//div[@id='content']/div/div[1]//h2");
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;
    //By emailAddressField = By.id("input-email");
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    //By passwordField = By.id("input-password");
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;
    //By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");
    @CacheLookup
    @FindBy(css = "input[value='guest']")
    WebElement radioButton;
    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueButton;
    @CacheLookup
    @FindBy(css = "#input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(css = "#input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(css = "#input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(css = "#input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(css = "#input-payment-city")
    WebElement city;
    @CacheLookup
    @FindBy(css = "#input-payment-postcode")
    WebElement postcode;
    @CacheLookup
    @FindBy(css = "#input-payment-zone")
    WebElement zone;
    @CacheLookup
    @FindBy(css = "#button-guest")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(css = "textarea[name='comment']")
    WebElement comments;
    @CacheLookup
    @FindBy(css = "input[type='checkbox']")
    WebElement tncCheckbox;
    @CacheLookup
    @FindBy(css = "#button-payment-method")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(css = ".alert.alert-danger.alert-dismissible")
    WebElement warningText;
    @CacheLookup
    @FindBy(xpath = "(//h2)[1]")
    WebElement myAccountText;
    @CacheLookup
    @FindBy(xpath = "(//h1)[2]")
    WebElement accountLogOutText;



    public String getReturningCustomerText() {
        return getTextFromElement(returningCustomerText);

    }

    public String getNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }
    public void clickOnRadioButton() {
        clickOnElement(radioButton);

    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void fillInMandatoryFields() {

        sendTextToElement(firstName, "Priya");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "priyapatel@gmail.com");
        sendTextToElement(telephone, "76895433452");
        sendTextToElement(address, "Kings Street");
        sendTextToElement(city, "London");
        sendTextToElement(postcode, "WC11BC");
        selectByVisibleTextFromDropDown(zone, "Berkshire");

    }
    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }
    public void addCommentsAboutOrder() {
        sendTextToElement(comments, "Thank You for Your Order");
    }
    public void clickOnTermsAndConditionCheckbox() {
        clickOnElement(tncCheckbox);
    }
    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
    public String getTextWarningMessage() {
        return getTextFromElement(warningText);
    }
    public String getMyAccountText() {
        return getTextFromElement(myAccountText);
    }
    public String getaccountLogOutText() {
        return getTextFromElement(accountLogOutText);
    }
}
