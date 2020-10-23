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
  "duration": 20531426200,
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
  "name": "I choose \"Đặt mua hoa\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click \"Tiếp tục\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I fill all information booking",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I fill booking date",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I confirm flower booking",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I get amount total before doing transaction for booking flower",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I scroll up",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I get transferred amount",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I continue this booking",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I input \"123456\" OTP code",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I confirm again flower booking",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I get amount total after doing transaction in booking flower",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify before total amount \u003d after total amount + debit amount",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefsBase.iOpenApp()"
});
formatter.result({
  "duration": 176638800,
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
  "duration": 23731600400,
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
  "duration": 5858473100,
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
  "duration": 10044487000,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iEnableLocation()"
});
formatter.result({
  "duration": 2492593800,
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
  "duration": 1958391100,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iChooseAFlower()"
});
formatter.result({
  "duration": 8860256000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Đặt mua hoa",
      "offset": 10
    }
  ],
  "location": "FlowerBookingStepdefs.iChoose(String)"
});
formatter.result({
  "duration": 2189828000,
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
  "duration": 2484274700,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iFillAllInformationBooking()"
});
formatter.result({
  "duration": 24411719300,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iFillBookingDate()"
});
formatter.result({
  "duration": 39377637900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmFlowerBooking()"
});
formatter.result({
  "duration": 3636875600,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetAmountTotalBeforeDoingTransactionForBookingFlower()"
});
formatter.result({
  "duration": 3364486300,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iScrollUp()"
});
formatter.result({
  "duration": 1053296400,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetTransferredAmount()"
});
formatter.result({
  "duration": 87389900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iContinueThisBooking()"
});
formatter.result({
  "duration": 141879900,
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
  "duration": 5592875200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmAgainFlowerBooking()"
});
formatter.result({
  "duration": 3295865200,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetAmountTotalAfterDoingTransactionInBookingFlower()"
});
formatter.result({
  "duration": 6810387700,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iVerifyBeforeTotalAmountAfterTotalAmountDebitAmount()"
});
formatter.result({
  "duration": 13172600,
  "status": "passed"
});
formatter.after({
  "duration": 5003939700,
  "status": "passed"
});
});