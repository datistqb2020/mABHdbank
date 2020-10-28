@HDbank @KHCN_booking_train
Feature: Train ticket Booking

  @KHCN_booking_train-01 @UninstallAndroid
  Scenario: I book an one way train
    Given I open app
    Then I login with "lananh2009" and "abc123"
#    And I input "123456" OTP code
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
    Then I confirm the booking
    And I get amount total after doing transaction in train ticket booking
    Then I verify before total amount = after total amount + debit amount

  @KHCN_booking_train-02 @UninstallAndroid
  Scenario: I get invoice successfully
    Given I open app
    Then I login with "lananh2009" and "abc123"
    And I do transaction with type is "Đặt vé tàu" in Home page 2
    Then I book an one way train from "Hà Nội" to "Sài Gòn" with seat type is "Giường nằm (khoang 6 chỗ)"
    And I choose departing and return time for one way train
    And I fill passenger info as below
      |Nguyen Van A|356116742|
    Then I scroll up page
    And I fill contact info as below
      |234549958|abc@gmail.com|
    Then I choose "Xuất hóa đơn"
    And I scroll up
    Then I fill "Abc" company name
    And I fill "2802887502" company tax number
    And I fill "174 phan dang luu, p3, phu nhuan,hcm" company address
    Then I fill "0958738712" company phone number
    And I click "Có" to book train
    And I get transferred amount when booking train ticket
    And I scroll up page
    Then I continue to book the train
    Then I input "123456" OTP code
    Then I confirm the booking
    #change

    And I get amount total after doing transaction in train ticket booking
    Then I verify before total amount = after total amount + debit amount