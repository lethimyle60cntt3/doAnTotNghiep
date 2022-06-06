@regression @Cart_tiki

Feature: Cart Tiki
Background:
  Given the user is on the main page
  When the user goes to Login Page


  @ca_01 @Delete_product
    Scenario: Delete product
      And login with account "LeUser"
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      And the user clicks on Cart button
      And the user clicks on selection all
      And the user clicks on Delete button
      And the user clicks on confirm button
      Then the user should see Continue shopping button

  @ca_02 @Check_cart_when_there_are_no_products
    Scenario: Check cart when there are no products
      And login with account "LeUser"
      And the user clicks on Cart button
      Then the user should see Continue shopping button

  @ca_03 @Check_cart_when_products_are_available
    Scenario: Check cart when products are available
      And login with account "LeUser"
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      Then the user should see view cart and checkout button

  @ca_04 @Change_order_quantity
    Scenario: Change order quantity
      And login with account "LeUser"
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      And the user clicks on Cart button
      And the user clicks on increase button
      Then the number quantity should increase "1"

    @ca_05 @delete_all_products_in_cart_without_selecting_products
    Scenario: delete all products in cart without selecting products
      And login with account "LeUser"
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      And the user clicks on Cart button
      And the user clicks on Delete button
      Then the user should see Please select the product to delete message

  @ca_06  @Check_shop
    Scenario: Check shop
      And login with account "LeUser"
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      And the user clicks on Cart button
      And the user clicks on shop button


  @ca_07 @Click_pay_but_haven't_selected_the_product_yet
    Scenario: Click pay but haven't selected the product yet
      And login with account "LeUser"
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      And the user clicks on Cart button
      And the user clicks on selection all
      And the user clicks on Buy product button
      Then the user should see message you still have not selected the product to buy

  @ca_08 @Change_of_delivery_address
    Scenario: Change of delivery address
      And login with account "LeUser"
      And the user clicks on Cart button
      And the user clicks on change address
      And the user clicks on fix button
      And the user clicks update button
      Then the user should see address is changed

  @ca_09 @Buy_product
    Scenario: Buy product
      And login with account "LeUser"
      And the user clicks on first products
      And the user clicks on first product
      And the user clicks on choose to buy button
      And the user clicks on Cart button
      And the user clicks on selection all
      And the user clicks on Buy product button
      And the user clicks on Ordered button
      Then the user should see go back to the main page button
