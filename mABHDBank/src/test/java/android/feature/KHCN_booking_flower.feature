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
    And I fill email "abc@gmail.com"
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

  @KHCN_booking_flower-02 @Android
  Scenario: I get bill payment successfully
    Given I open app
    When I login with "lananh2009" and "abc123"
    And I input "123456" OTP code
    Then I do transaction with type is "Đặt hoa" in Home page 2
    And I enable location
    Then I click "Đặt mua hoa"
    And I choose a flower
    And I click "Tiếp tục"
    And I fill email "abc@gmail.com"
    Then I fill receiver name "Nguyen Van A"
    And I fill phone number "0682365489"
    And I fill address "174 phan dang luu,p3,phu nhuan"
    Then I fill booking date
    And I confirm the above transaction
    Then I navigate billing information
    Then I continue this booking
    And I input "123456" OTP code
    Then I confirm again flower booking
    And I navigate transaction results
    And I click "Lấy hóa đơn thanh toán"
    Then I fill The "abc" name company
    And I fill "435567234" tax number
    Then I fill "174 phan dang luu, p3, phu nhuan" billing address
    And I fill "abc@gmail.com" billing email
    Then I submit
    And I confirm billing
    Then I verify content popup is displayed "Quý khách đã gửi yêu cầu lấy thông tin hóa đơn thành công."

  @KHCN_booking_flower-03 @UninstallAndroid
  Scenario: I check bill payment history
    Given I open app
    When I login with "lananh2009" and "abc123" without reset
    Then I choose "Tài khoản"
    And I click account detail
    Then I click payment history page
    Then I verify that transferredAmount is correct