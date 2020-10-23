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
  "duration": 49297098200,
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
  "name": "I fill email \"datnt14@hdbank.com.vn\"",
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
  "duration": 228435400,
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
  "duration": 26825818600,
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
