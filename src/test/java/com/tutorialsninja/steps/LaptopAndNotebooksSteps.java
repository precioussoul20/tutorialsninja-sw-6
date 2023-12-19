package com.tutorialsninja.steps;

import com.tutorialsninja.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopAndNotebooksSteps {
    @And("I hover on Laptops & Notebooks Tab and click")
    public void iHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();

    }

    @And("I click on “Show All Laptops & Notebooks”")
    public void iClickOnShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Show All Laptops & Notebooks");
    }

    @And("I select Sort By {string}")
    public void iSelectSortBy(String arg0) {
        new LaptopsAndNotebooksPage().selectSortByOption("Price (High > Low)");
    }

    @And("I select Product {string}")
    public void iSelectProductMacBook() {
        new ProductPage().selectProductMacBook();
    }

    @And("I click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I click on link {string} displayed into success message")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("I can able to see the Product name {string}")
    public void iCanAbleToSeeTheProductName(String arg0) {
        Assert.assertEquals(new ShoppingCart().getProductName(), "MacBook","Error Message");
    }

    @And("I change Quantity to {int}")
    public void iChangeQuantityTo(int arg0) {
        new ShoppingCart().changeQuantity("2");
    }

    @And("I click on {string} Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCart().clickOnQtyUpdateButton();
    }

    @Then("I can see the Total £{double}")
    public void iCanSeeTheTotal£(int arg0, int arg1) {
        Assert.assertEquals(new ShoppingCart().getTotal(), "£737.45", "Error message");
    }

    @And("I click on {string} button")
    public void iClickOnCheckoutButton() {
        new ShoppingCart().clickOnCheckOutButton();

    }

    @Then("I can see the Text {string}")
    public void iCanSeeTheTextNewCustomer() {
        Assert.assertEquals(new AccountLoginPage().getNewCustomerText(), "New Customer", "Error message");
    }

    @And("I click on {string} radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new AccountLoginPage().clickOnRadioButton();
    }

    @And("I click on {string} tab")
    public void iClickOnContinueTab() {
        new AccountLoginPage().clickOnContinueButton();
    }

    @And("I fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        new AccountLoginPage().fillInMandatoryFields();
    }

    @And("I click on {string} Button")
    public void iClickOnContinueButton() {
        new AccountLoginPage().clickOnContinueButton();
    }

    @And("I add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new AccountLoginPage().addCommentsAboutOrder();
    }

    @And("I check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new AccountLoginPage().clickOnTermsAndConditionCheckbox();
    }

    @Then("I can see the message 'Warning")
    public void iCanSeeTheMessageWarning() {
        Assert.assertEquals(new AccountLoginPage().getTextWarningMessage(), "Warning: Payment method required", "Error message");
    }
}
