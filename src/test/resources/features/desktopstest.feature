
Feature: Desktop page test cases

  @author-Priya @smoke
  Scenario: verify product arranged in alphabetical order
    Given I am on the homepage
    And I hover on the Desktops tab and click
    And click on "Show AllDesktops"
    And select sort by position "Name: Z to A"
    Then I can see the products in descending order

  @author-Priya @sanity @smoke @regression
  Scenario Outline: verify product arranged in alphabetical order
    Given I am on the homepage
    And I hover on the Desktops tab and click
    And click on "Show AllDesktops"
    And select sort by the position "Name: A to Z"
    And select product '<product>'
    Then I can see the text '<product>'
    And enter qty 1 using select class
    And click on 'Add to Cart' button
    Then I can see the text "Success: You have added '<product>' to your shopping cart!"
    And I click on link 'shopping cart' display into success message
    Then I can see the text 'Shopping Cart'
    Then I can see the Product name '<product>'
    Then I can see the Model '<model>'
    Then I can see the Total '<price>'
    Examples:

      | product              | model                 | price             |
      | HTC                  | Touch HD              | Product 1 £74.73  |
      | iPhone               | product 11            | £75.46            |
      | iPod Classic         | product 20            | £74.73            |
      | MacBook              | Product 16            | £368.73           |
      | MacBook Air          | Product 17            | £736.23           |
      | Sony VAIO            | Product 19            | £736.23           |

