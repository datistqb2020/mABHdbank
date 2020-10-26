$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KHCN_booking_flower.feature");
formatter.feature({
  "line": 2,
  "name": "Flower Booking",
  "description": "",
  "id": "flower-booking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HDbank"
    },
    {
      "line": 1,
      "name": "@KHCN_booking_flower"
    }
  ]
});
formatter.before({
  "duration": 19623219000,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "I get bill payment successfully",
  "description": "",
  "id": "flower-booking;i-get-bill-payment-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@KHCN_booking_flower-02"
    },
    {
      "line": 29,
      "name": "@Android"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I login with \"lananh2009\" and \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I input \"123456\" OTP code",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I do transaction with type is \"Đặt hoa\" in Home page 2",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I enable location",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click \"Đặt mua hoa\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I choose a flower",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click \"Tiếp tục\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I fill email \"abc@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I fill receiver name \"Nguyen Van A\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I fill phone number \"0682365489\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I fill address \"174 phan dang luu,p3,phu nhuan\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I fill booking date",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I confirm the above transaction",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I navigate billing information",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I continue this booking",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "I input \"123456\" OTP code",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I confirm again flower booking",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "I navigate transaction results",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click \"Lấy hóa đơn thanh toán\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I fill The \"abc\" name company",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I fill \"435567234\" tax number",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I fill \"174 phan dang luu, p3, phu nhuan\" billing address",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I fill \"abc@gmail.com\" billing email",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I submit",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "I confirm billing",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I verify content popup is displayed \"Quý khách đã gửi yêu cầu lấy thông tin hóa đơn thành công.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefsBase.iOpenApp()"
});
formatter.result({
  "duration": 156709000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lananh2009",
      "offset": 14
    },
    {
      "val": "abc123",
      "offset": 31
    }
  ],
  "location": "FlowerBookingStepdefs.iLoginWithAnd(String,String)"
});
formatter.result({
  "duration": 25346574700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 9
    }
  ],
  "location": "FlowerBookingStepdefs.iInputOTPCode(String)"
});
formatter.result({
  "duration": 7125156100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Đặt hoa",
      "offset": 31
    },
    {
      "val": "2",
      "offset": 53
    }
  ],
  "location": "FlowerBookingStepdefs.iDoTransactionWithTypeIsInHomePage(String,int)"
});
formatter.result({
  "duration": 12059523100,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iEnableLocation()"
});
formatter.result({
  "duration": 23100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Đặt mua hoa",
      "offset": 9
    }
  ],
  "location": "FlowerBookingStepdefs.iClick(String)"
});
formatter.result({
  "duration": 6102236500,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iChooseAFlower()"
});
formatter.result({
  "duration": 10044927000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tiếp tục",
      "offset": 9
    }
  ],
  "location": "FlowerBookingStepdefs.iClick(String)"
});
formatter.result({
  "duration": 4219150400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 14
    }
  ],
  "location": "FlowerBookingStepdefs.iFillEmail(String)"
});
formatter.result({
  "duration": 8943023400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nguyen Van A",
      "offset": 22
    }
  ],
  "location": "FlowerBookingStepdefs.iFillReceiverName(String)"
});
formatter.result({
  "duration": 6607054100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0682365489",
      "offset": 21
    }
  ],
  "location": "FlowerBookingStepdefs.iFillPhoneNumber(String)"
});
formatter.result({
  "duration": 5275747600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "174 phan dang luu,p3,phu nhuan",
      "offset": 16
    }
  ],
  "location": "FlowerBookingStepdefs.iFillAddress(String)"
});
formatter.result({
  "duration": 15613297500,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iFillBookingDate()"
});
formatter.result({
  "duration": 19754936500,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmTheAboveTransaction()"
});
formatter.result({
  "duration": 6755468300,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iNavigateBillingInformation()"
});
formatter.result({
  "duration": 3830134500,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iContinueThisBooking()"
});
formatter.result({
  "duration": 186674300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 9
    }
  ],
  "location": "FlowerBookingStepdefs.iInputOTPCode(String)"
});
formatter.result({
  "duration": 5775698300,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmAgainFlowerBooking()"
});
formatter.result({
  "duration": 3961852200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iNavigateTransactionResults()"
});
formatter.result({
  "duration": 7140735300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lấy hóa đơn thanh toán",
      "offset": 9
    }
  ],
  "location": "FlowerBookingStepdefs.iClick(String)"
});
formatter.result({
  "duration": 1616003600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 12
    }
  ],
  "location": "FlowerBookingStepdefs.iFillTheNameCompany(String)"
});
formatter.result({
  "duration": 2573370200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "435567234",
      "offset": 8
    }
  ],
  "location": "FlowerBookingStepdefs.iFillTaxNumber(String)"
});
formatter.result({
  "duration": 1233940100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "174 phan dang luu, p3, phu nhuan",
      "offset": 8
    }
  ],
  "location": "FlowerBookingStepdefs.iFillBillingAddress(String)"
});
formatter.result({
  "duration": 1291832800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 8
    }
  ],
  "location": "FlowerBookingStepdefs.iFillBillingEmail(String)"
});
formatter.result({
  "duration": 1348868600,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iSubmit()"
});
formatter.result({
  "duration": 755139400,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmBilling()"
});
formatter.result({
  "duration": 2067024900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Quý khách đã gửi yêu cầu lấy thông tin hóa đơn thành công.",
      "offset": 37
    }
  ],
  "location": "FlowerBookingStepdefs.iVerifyContentPopupIsDisplayed(String)"
});
formatter.result({
  "duration": 2055291800,
  "status": "passed"
});
formatter.after({
  "duration": 971879200,
  "status": "passed"
});
});