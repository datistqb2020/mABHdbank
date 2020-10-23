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
    Then I choose "Đặt mua hoa"
    And I click "Tiếp tục"
    And I fill all information booking
    Then I fill booking date
    And I confirm flower booking
    And I get amount total before doing transaction for booking flower
    Then I scroll up
    And I get transferred amount
    Then I continue this booking
    And I input "123456" OTP code
    Then I confirm again flower booking
    And I get amount total after doing transaction in booking flower
    Then I verify before total amount = after total amount + debit amount
