@regression @home_Page_tiki
Feature: Home Page
  Background:
    Given the user is on the main page
  @hp_001 @Check_the_product_search_box
    Scenario Outline: check the product search box
      And the user inputs "<value>"
      And click on Search button
      Then The screen should display a list of products similar to the product you want to find
      Examples:
      | value |
      | áo    |
      | asf   |
      | AO    |
      | áO    |
      | a1    |


  @hp_002 @Check_out_the_product_catalog
    Scenario: Check out the product catalog
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on product catalog
      Then User should redirect to product category page

  @hp_003 @Add_item_to_cart
    Scenario: Add item to cart
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      And login with account "LeUser"
      Then the user should see view cart and checkout button


  @hp_004 @verify_my_account
    Scenario: verify my account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user clicks on my account
      Then the user should see infomation account

  @hp_005 @Verify_my_order_in_account
    Scenario: verify my oder in account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user clicks on My order
      Then the user should see Find Orders button

  @hp_006 @verify_my_notifications_in_my_account_ERROR
    Scenario: verify my notifications in my account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user clicks on my notice
      Then the user should see Continue shopping button

  @hp_007 @My_Notification_in_my_account
    Scenario: My notification in my account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user clicks on notification
      Then the user should see My notification


  @hp_008 @Easy_exchange_and_return_in_my_account
    Scenario: Easy exchange and return in my account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user clicks on Easy exchange and return button
      Then the user should see text return Management

  @hp_9 @comment_product_in_my_account
    Scenario: Comment product in my account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user cliks on review product
      Then the user should see text Review purchased products

  @hp_10 @Return_goods_in_my_account
    Scenario: Return goods in my account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user clicks on return goods in my account
      Then the user should see text Hello, how can Tiki help you?
  @hp_11 @Logout_account
    Scenario: Logout account
      When the user goes to Login Page
      And login with account "LeUser"
      And the user clicks on account
      And the user clicks on logout button
      Then the user should see Login button






