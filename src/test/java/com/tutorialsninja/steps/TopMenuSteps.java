package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }
    //1.1 Mouse hover on “Desktops” Tab and click
    @And("I hover on the Desktops tab and click")
    public void iHoverOnTheDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    //1.2 call selectMenu method and pass the menu = “Show All Desktops”
    @And("call selectMenu method and pass the menu {string}")
    public void callSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().selectMenu("menu");
    }

    //1.3 Verify the text ‘Desktops
    @Then("I can see the text {string}")
    public void iCanSeeTheTextDesktops() {
        Assert.assertEquals(new DesktopPage().getDesktopsText(), "Desktops", "Error message");
    }

    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    @And("I hover on the Laptops & Notebooks tab and click")
    public void iHoverOnTheLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I hover on the Components tab and click")
    public void iHoverOnTheComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }

    @Then("I can see the text 'Components")
    public void iCanSeeTheTextComponents() {
        Assert.assertEquals(new ComponentsPage().getComponentsText(), "Components", "Error mnessage");

    }
}
