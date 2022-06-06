@regression @Login_Tiki
Feature: Login Tiki

  Background:
    Given the user is on the main page
    When the user goes to Login Page

  @LI_success-01 @Login_with_phone_number
    Scenario: Successful login with phone number
      And input phone number "0979041105"
      And click on Next button
      And input password "Lethimyle090900"
      And click on Login button
      Then should see logo Tiki

  @LI_Failed-02 @Login_failed_with_phone_number @unit_test
  Scenario Outline: Login failed with phone number
    And input phone number "<phone number>"
    And click on Next button
    Then should see message phone number is not formatted
    Examples:
      |phone number          |
      |                      |
      |123456                |
      |3427645874134545143254|
      |egfyasfdyshfd         |
      |#%$#^%$&*^&           |














