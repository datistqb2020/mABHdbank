@HDbank @KHCN_booking_flower
Feature: Flower Booking

  @KHCN_booking_flower-01 @Android
  Scenario: I book a flower with login successfully
    Given I open app
    When I login with "lananh2009" and "abc123"
    And I input "123456" OTP code
    Then I do transaction with type is "Đặt hoa" in Home page 2
    And I enable location
    Then I click "Đặt mua hoa"
    And I choose a flower
    And I click "Tiếp tục"
    And I fill email "datnt14@hdbank.com.vn"
    Then I fill receiver name "Nguyen Van A"
    And I fill phone number "0682365489"
    And I fill address "174 phan dang luu,p3,phu nhuan"
    Then I fill booking date
    And I confirm the above transaction
    And I get amount total before doing transaction for booking flower
    Then I scroll up
    And I get transferred amount
    Then I continue this booking
    And I input "123456" OTP code
    Then I confirm again flower booking
    And I get amount total after doing transaction in booking flower
    Then I verify before total amount = after total amount + debit amount
