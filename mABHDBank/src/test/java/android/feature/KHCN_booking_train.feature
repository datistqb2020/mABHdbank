@HDbank @KHCN_booking_train
Feature: Train ticket Booking

  @KHCN_booking_train-01 @UninstallAndroid
  Scenario: I book an one way train
    Given I open app
    Then I login with "lananh2009" and "abc123"
    And I input "123456" OTP code
    And I do transaction with type is "Đặt vé tàu" in Home page 2
    Then I book an one way train from "Hà Nội" to "Sài Gòn" with seat type is "Giường nằm (khoang 6 chỗ)"
    And I choose departing and return time for one way train
    And I fill passenger info as below
      |Nguyen Van A|356116742|
    Then I scroll up page
    And I fill contact info as below
      |234549958|abc@gmail.com|
    Then I choose "Không xuất hóa đơn"
    And I click "Đồng ý" to book train
    Then I get amount total before doing transaction in train booking
    And I get transferred amount when booking train ticket
    And I scroll up page
    Then I continue to book the train
    And I verify "Nhà cung cấp" "Đường sắt Việt Nam" is displayed after doing transaction successfully
    And I verify "Dịch vụ" "Đặt mua vé tàu" is displayed after doing transaction successfully
    Then I input "123456" OTP code
    Then I confirm this booking
    And I get amount total after doing transaction in train ticket booking
    Then I verify before total amount = after total amount + debit amount

  @KHCN_booking_train-02 @UninstallAndroid
  Scenario: I get invoice successfully
    Given I open app
    Then I login with "lananh2009" and "abc123" without reset
    And I do transaction with type is "Đặt vé tàu" in Home page 2
    Then I book an one way train from "Hà Nội" to "Sài Gòn" with seat type is "Giường nằm (khoang 6 chỗ)"
    And I choose departing and return time for one way train
    And I fill passenger info as below
      |Nguyen La C|98868942|
    Then I scroll up page
    And I fill contact info as below
      |302745258|gdaf23ah34fd@gmail.com|0903472891|
    Then I choose "Xuất hóa đơn"
    And I scroll up
    Then I fill "Abc" company name
    And I fill "2856887502" company tax number
    And I fill "104 phan dang luu, p14, phu nhuan,hcm" company address
    Then I fill "0902238192" company phone number
    Then I confirm invoice and get invoice information
    Then I payment this train booking
    And I get transferred amount when booking train ticket
    And I scroll up
    Then I continue this booking
    Then I input "123456" OTP code
    Then I confirm this booking
    And I choose another exchange
    Then I click booking history
    And I choose booked train
    And I click invoice information
    Then I verify invoice information is correct

  @KHCN_booking_train-03 @UninstallAndroid
  Scenario: I check bill payment history
    Given I open app
    When I login with "lananh2009" and "abc123" without reset
    Then I choose "Tài khoản" without reset
    And I click account detail
    Then I click payment history page
    Then I verify that transferredAmount is correct