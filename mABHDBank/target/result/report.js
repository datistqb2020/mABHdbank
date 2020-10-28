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
  "duration": 21167793700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I book a flower with login successfully",
  "description": "",
  "id": "flower-booking;i-book-a-flower-with-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@KHCN_booking_flower-01"
    },
    {
      "line": 4,
      "name": "@Android"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with \"lananh2009\" and \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I input \"123456\" OTP code",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I do transaction with type is \"Đặt hoa\" in Home page 2",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enable location",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click \"Đặt mua hoa\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I choose a flower",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click \"Tiếp tục\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I fill email \"abc@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I fill receiver name \"Nguyen Van A\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I fill phone number \"0682365489\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I fill address \"174 phan dang luu,p3,phu nhuan\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I fill booking date",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I confirm the above transaction",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I get amount total before doing transaction for booking flower",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I scroll up",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I get transferred amount",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I continue this booking",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I input \"123456\" OTP code",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I confirm this booking",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I get amount total after doing transaction in booking flower",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify before total amount \u003d after total amount + debit amount",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefsBase.iOpenApp()"
});
formatter.result({
  "duration": 158633700,
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
  "duration": 10210934000,
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
  "duration": 4871879900,
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
  "duration": 9942221900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iEnableLocation()"
});
formatter.result({
  "duration": 2772682400,
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
  "duration": 2316350700,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iChooseAFlower()"
});
formatter.result({
  "duration": 6476381900,
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
  "duration": 3421565200,
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
  "duration": 9908110700,
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
  "duration": 8535526700,
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
  "duration": 10141685900,
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
  "duration": 13684328900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iFillBookingDate()"
});
formatter.result({
  "duration": 16937311900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmTheAboveTransaction()"
});
formatter.result({
  "duration": 5515797200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetAmountTotalBeforeDoingTransactionForBookingFlower()"
});
formatter.result({
  "duration": 4523549900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iScrollUp()"
});
formatter.result({
  "duration": 1206375800,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetTransferredAmount()"
});
formatter.result({
  "duration": 173232600,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iContinueThisBooking()"
});
formatter.result({
  "duration": 208653000,
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
  "duration": 6385674100,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmThisBooking()"
});
formatter.result({
  "duration": 8423813200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetAmountTotalAfterDoingTransactionInBookingFlower()"
});
formatter.result({
  "duration": 6748913300,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iVerifyBeforeTotalAmountAfterTotalAmountDebitAmount()"
});
formatter.result({
  "duration": 2550600,
  "status": "passed"
});
formatter.after({
  "duration": 1076079300,
  "status": "passed"
});
});