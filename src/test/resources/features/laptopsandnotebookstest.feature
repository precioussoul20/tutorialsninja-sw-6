Feature: Laptops and Notebook page test cases

  @author-Priya @smoke
  Scenario: Verify that products price display High To Low successfully
    Given I am on the homepage
    And I hover on Laptops & Notebooks Tab and click
    And I click on “Show All Laptops & Notebooks”
    And I select Sort By "Price (High > Low)"
    Then I can see the Product price will arrange in High to Low order.

  @author-Priya @sanity @smoke @regression
  Scenario: Verify that user place order successfully
    Given I am on the homepage
    And I hover on Laptops & Notebooks Tab and click
    And I click on “Show All Laptops & Notebooks”
    And I select Sort By "Price (High > Low)"
    And I select Product 'MacBook'
    Then I can see the text 'MacBook'
    And I click on ‘Add To Cart’ button
    Then I can see the message 'Success: You have added MacBook to your shopping cart!'
    And I click on link 'shopping cart' displayed into success message
    Then I can able to see the text "Shopping Cart"
    Then I can able to see the Product name "MacBook"
    And I change Quantity to 2
    And I click on 'Update' Tab
    Then I can see the message 'Success: You have modified your shopping cart!'
    Then I can see the Total £737.45
    And I click on 'Checkout' button
    Then I can see the text 'Checkout'
    Then I can see the Text 'New Customer'
    And I click on 'Guest Checkout' radio button
    And I click on 'Continue' tab
    And I fill the mandatory fields
    And I click on 'Continue' Button
    And I add Comments About your order into text area
    And I check the Terms & Conditions check box
    And I click on 'Continue' button
    Then I can see the message 'Warning