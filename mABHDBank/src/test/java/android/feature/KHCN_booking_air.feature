@HDbank @KHCN_booking_air
Feature: Air Booking

  @KHCN_booking_air-01 @UninstallAndroid
  Scenario: I check bill payment history
    Given I open app
    Then I login with "lananh2009" and "abc123" without new install
    And I do transaction with type is "Đặt vé máy bay" in Home page 2 without new install
    Then I book an one way domestic flight from "TP Hồ Chí Minh" to "Hà Nội" on VietJet Air airline with method is Pay now
    And I fill "Nguyen Van A" full name, "Nam" gender, "abc123@gmail.com" email, "0335642318" phone number with "AUTO DESCRIPTION" description
    And I check on use for Passenger information
    Then I confirm the above flight with method is Pay now
    And I get amount total before doing transaction for booking airline
    And I scroll up page
    And I get transferred amount
    And I continue to book the above flight
    And I input "123456" OTP code
    Then I confirm the above air transaction
    Then I get information about the air booking
    Then I click air booking history
    And I click air booking detail
    Then I verify all information about the air booking

  @KHCN_booking_air-02 @UninstallAndroid
  Scenario: I pay air booking ticket with payment code
    Given I open app
    Then I login with "lananh2009" and "abc123" without new install
    And I do transaction with type is "Đặt vé máy bay" in Home page 2 without new install
    Then I book an one way domestic flight from "TP Hồ Chí Minh" to "Hà Nội" on VietJet Air airline with method is Pay now
    And I fill "Nguyen Van A" full name, "Nam" gender, "abc123@gmail.com" email, "0335642318" phone number with "AUTO DESCRIPTION" description
    And I check on use for Passenger information
    Then I confirm the above flight with method is Pay later
    And I get payment code
    And I input payment code for payment
    Then I payment air ticket booking
    And I input "123456" OTP code
    Then I confirm the above air transaction
    And I get amount total after doing transaction for booking airline
    Then I verify before total amount = after total amount + ticket price amount

