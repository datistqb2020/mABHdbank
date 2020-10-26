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
  "duration": 21380773700,
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
  "name": "I confirm again flower booking",
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
  "duration": 133734600,
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
  "duration": 9911664300,
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
  "duration": 5045397400,
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
  "duration": 11865644300,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iEnableLocation()"
});
formatter.result({
  "duration": 2728088600,
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
  "duration": 2486623400,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iChooseAFlower()"
});
formatter.result({
  "duration": 7152296300,
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
  "duration": 3799521400,
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
  "duration": 10350790400,
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
  "duration": 8528020900,
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
  "duration": 10453079600,
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
  "duration": 16232664000,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iFillBookingDate()"
});
formatter.result({
  "duration": 18191513200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmTheAboveTransaction()"
});
formatter.result({
  "duration": 5173883700,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetAmountTotalBeforeDoingTransactionForBookingFlower()"
});
formatter.result({
  "duration": 4283163200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iScrollUp()"
});
formatter.result({
  "duration": 1168809400,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetTransferredAmount()"
});
formatter.result({
  "duration": 185982400,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iContinueThisBooking()"
});
formatter.result({
  "duration": 284231200,
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
  "duration": 5743585900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmAgainFlowerBooking()"
});
formatter.result({
  "duration": 8199766800,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetAmountTotalAfterDoingTransactionInBookingFlower()"
});
formatter.result({
  "duration": 7522718200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iVerifyBeforeTotalAmountAfterTotalAmountDebitAmount()"
});
formatter.result({
  "duration": 2433200,
  "status": "passed"
});
formatter.after({
  "duration": 1003667600,
  "status": "passed"
});
formatter.before({
  "duration": 17892886600,
  "status": "passed"
});
formatter.scenario({
  "line": 60,
  "name": "I check bill payment history",
  "description": "",
  "id": "flower-booking;i-check-bill-payment-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@KHCN_booking_flower-03"
    },
    {
      "line": 59,
      "name": "@UninstallAndroid"
    }
  ]
});
formatter.step({
  "line": 61,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "I login with \"lananh2009\" and \"abc123\" without reset",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "I choose \"Tài khoản\"",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "I click account detail",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "I click payment history page",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "I verify that transferredAmount is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefsBase.iOpenApp()"
});
formatter.result({
  "duration": 53600,
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
  "location": "FlowerBookingStepdefs.iLoginWithAndWithoutReset(String,String)"
});
formatter.result({
  "duration": 7413655500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tài khoản",
      "offset": 10
    }
  ],
  "location": "FlowerBookingStepdefs.iChoose(String)"
});
formatter.result({
  "duration": 6317024200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iClickAccountDetail()"
});
formatter.result({
  "duration": 2218147800,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iClickPaymentHistoryPage()"
});
formatter.result({
  "duration": 3473845700,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iVerifyThatTransferredAmountIsCorrect()"
});
formatter.result({
  "duration": 2629365200,
  "status": "passed"
});
formatter.after({
  "duration": 996340000,
  "status": "passed"
});
});