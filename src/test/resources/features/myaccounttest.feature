Feature: User Accounts test cases


  @author-Priya @smoke
  Scenario: Verify user should navigate to register page successfully
    Given I am on the homepage
    And I click on My Account link
    And call the method selectMyAccountOptions method with parameter "Register"
    Then I can see the text 'Register Account'


  @author-Priya @smoke @sanity @regression
  Scenario: Verify user should navigate to login page successfully
    Given I am on the homepage
    And I click on My Account link
    And I call the method selectMyAccountOptions method with parameter "Login"
    Then I can see the text 'Returning Customer'

  @author-Priya @smoke @sanity @regression
  Scenario: Verify that user register account successfully
    Given I am on the homepage
    And I click on My Account link
    And I can call the method selectMyAccountOptions method with parameter "Register"
    And I enter First Name and I enter Last Name and I enter Email and I enter Telephone and I enter Password and I enter Password Confirm and I select Subscribe Yes radio button and I click on Privacy Policy check box and I click on Continue button
    Then I can see the message 'Your Account Has Been Created!'
    And I click on Continue button
    And I click on my Accounts Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    Then I can see the text 'Account Logout'
    And I click on the continue button

  @author-Priya @smoke @sanity @regression
  Scenario: Verify that user should Login and Logout successfully
    Given I am on the homepage
    And I click on My Account link
    And I can call the method selectMyAccountOptions method with the parameter "Login"
    And I enter Email address and and I enter Password and I click on Login button
    Then I can see the text “My Account”
    And I click on the My Account Link.
    And I call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    Then I can see text “Account Logout”
    And I click on Continue button