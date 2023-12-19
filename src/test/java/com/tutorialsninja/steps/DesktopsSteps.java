package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopsSteps {
    @And("click on {string}")
    public void clickOn(String menu) {
        new HomePage().selectMenu("Show All Desktops");
    }

    @And("select sort by position {string}")
    public void selectSortByPosition(String ZToA) {
        new DesktopPage().selectSortByOption("Name: Z to A");
    }

    @Then("I can see the products in descending order")
    public void iCanSeeTheProductsInDescendingOrder() {
        Assert.assertEquals(new DesktopPage().getProductsNameList(), "Name: Z to A", "Error Message");
    }

    @And("select sort by the position {string}")
    public void selectSortByThePosition(String AToZ) {
        new DesktopPage().selectSortByOption("Name: A to Z");
    }

    @And("select product {string}")
    public void selectProduct(int product) {
        new DesktopPage().selectProductByName("product");
    }

    @And("enter qty {int} using select class")
    public void enterQtyUsingSelectClass(String qty) {
        new ProductPage().enterQuantity("");

    }

    @And("click on {string} button")
    public void clickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I click on link {string} display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();

    }
    @Then("I can see the Product name {string}")
    public void iCanSeeTheProductName(String arg0) {
        Assert.assertEquals(new ShoppingCart().getProductName(), "<product>", "Error message displayed");

    }

    @Then("I can see the Model {string}")
    public void iCanSeeTheModel(String arg0) {
        Assert.assertEquals(new ShoppingCart().getModel(), "", "Error Message");

    }

    @Then("I can see the Total {string}")
    public void iCanSeeTheTotal(String arg0) {
        Assert.assertEquals(new ShoppingCart().getTotal(), "", "Error message");
    }
}
