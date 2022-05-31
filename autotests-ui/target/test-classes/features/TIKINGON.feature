@regression @TIKINGON
Feature: TIKI NGON
  Background:
    Given the user is on the main page
    When the user goes to Login Page
    And login with account "LeUser"
    And click Fruit button
    And click any item
    And click Add button
    And click turn off button
    And click Cart button
  @TKN_01 @delete_item_TIKINGON
    Scenario: delete item TIKINGON
      And click detele buton
      And click confirm delete button
      Then should see the message
  @TKN_02 @Add_to_cart_TIKINGON
    Scenario: Add to cart TIKINGON
      Then should see See button on Cart
  @TKN_03 @Change_the_quantity_of_goods_in_TIKINGON
    Scenario: Change the quantity of goods in TIKINGON
      And click see button
      And click plus button
      Then the number quantity should increase "1" unit
  @TKN_04 @error_message_when_order_failed
    Scenario:error message when order failed
      And click see button
      And click Buy button
      And click save address button
      Then Should see message block


  @TKN_05 @Deleting_goods_failed
    Scenario: deleting goods failed
      And click detele buton
      And click No button
      Then no good is deleted
