$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KHCN_booking_train.feature");
formatter.feature({
  "line": 2,
  "name": "Train ticket Booking",
  "description": "",
  "id": "train-ticket-booking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HDbank"
    },
    {
      "line": 1,
      "name": "@KHCN_booking_train"
    }
  ]
});
formatter.before({
  "duration": 18591867300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I book an one way train",
  "description": "",
  "id": "train-ticket-booking;i-book-an-one-way-train",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@KHCN_booking_train-01"
    },
    {
      "line": 4,
      "name": "@UninstallAndroid"
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
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#    And I input \"123456\" OTP code"
    }
  ],
  "line": 9,
  "name": "I do transaction with type is \"Đặt vé tàu\" in Home page 2",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I book an one way train from \"Hà Nội\" to \"Sài Gòn\" with seat type is \"Giường nằm (khoang 6 chỗ)\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I choose departing and return time for one way train",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I fill passenger info as below",
  "rows": [
    {
      "cells": [
        "Nguyen Van A",
        "356116742"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I scroll up page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I fill contact info as below",
  "rows": [
    {
      "cells": [
        "234549958",
        "abc@gmail.com"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I choose \"Không xuất hóa đơn\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I continue to book train",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I get amount total before doing transaction in train booking",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I get transferred amount when booking train ticket",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I scroll up page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I continue to book the train",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I verify \"Nhà cung cấp\" \"Đường sắt Việt Nam\" is displayed after doing transaction successfully",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify \"Dịch vụ\" \"Đặt mua vé tàu\" is displayed after doing transaction successfully",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I input \"123456\" OTP code",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I confirm the booking",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I get amount total after doing transaction in train ticket booking",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify before total amount \u003d after total amount + debit amount",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefsBase.iOpenApp()"
});
formatter.result({
  "duration": 102036000,
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
  "duration": 6643297500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Đặt vé tàu",
      "offset": 31
    },
    {
      "val": "2",
      "offset": 56
    }
  ],
  "location": "FlowerBookingStepdefs.iDoTransactionWithTypeIsInHomePage(String,int)"
});
formatter.result({
  "duration": 7247738000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "one way",
      "offset": 10
    },
    {
      "val": "Hà Nội",
      "offset": 30
    },
    {
      "val": "Sài Gòn",
      "offset": 42
    },
    {
      "val": "Giường nằm (khoang 6 chỗ)",
      "offset": 70
    }
  ],
  "location": "TrainBookingStepdefs.iBookAnOneWayTrainFromToWithSeatTypeIs(String,String,String,String)"
});
formatter.result({
  "duration": 22168166000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "one way",
      "offset": 39
    }
  ],
  "location": "TrainBookingStepdefs.iChooseDepartingAndReturnTimeForOneWayTrain(String)"
});
formatter.result({
  "duration": 14138171100,
  "status": "passed"
});
formatter.match({
  "location": "TrainBookingStepdefs.iFillPassengerInfoAsBelow(DataTable)"
});
formatter.result({
  "duration": 3664149700,
  "status": "passed"
});
formatter.match({
  "location": "TrainBookingStepdefs.iScrollUpPage()"
});
formatter.result({
  "duration": 1137705400,
  "status": "passed"
});
formatter.match({
  "location": "TrainBookingStepdefs.iFillContactInfoAsBelow(DataTable)"
});
formatter.result({
  "duration": 1878700100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Không xuất hóa đơn",
      "offset": 10
    }
  ],
  "location": "FlowerBookingStepdefs.iChoose(String)"
});
formatter.result({
  "duration": 3195070800,
  "status": "passed"
});
formatter.match({
  "location": "TrainBookingStepdefs.iContinueToBookTrain()"
});
formatter.result({
  "duration": 8959973100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "train",
      "offset": 47
    }
  ],
  "location": "TrainBookingStepdefs.iGetAmountTotalBeforeDoingTransactionInHotelBooking(String)"
});
formatter.result({
  "duration": 276015100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "when booking train ticket",
      "offset": 25
    }
  ],
  "location": "TrainBookingStepdefs.iGetTransferredAmountInPaymentService(String)"
});
formatter.result({
  "duration": 1255696400,
  "status": "passed"
});
formatter.match({
  "location": "TrainBookingStepdefs.iScrollUpPage()"
});
formatter.result({
  "duration": 1162185400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "the train",
      "offset": 19
    }
  ],
  "location": "TrainBookingStepdefs.iContinueToBookHotel(String)"
});
formatter.result({
  "duration": 258839000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nhà cung cấp",
      "offset": 10
    },
    {
      "val": "Đường sắt Việt Nam",
      "offset": 25
    }
  ],
  "location": "TrainBookingStepdefs.iVerifyIsDisplayedAfterDoingTransactionSuccessfully(String,String)"
});
formatter.result({
  "duration": 5388957800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dịch vụ",
      "offset": 10
    },
    {
      "val": "Đặt mua vé tàu",
      "offset": 20
    }
  ],
  "location": "TrainBookingStepdefs.iVerifyIsDisplayedAfterDoingTransactionSuccessfully(String,String)"
});
formatter.result({
  "duration": 1417125900,
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
  "duration": 1319730900,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iConfirmTheBooking()"
});
formatter.result({
  "duration": 6570927600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "train ticket",
      "offset": 46
    }
  ],
  "location": "TrainBookingStepdefs.iGetAmountTotalAfterDoingTransactionInHotelBooking(String)"
});
formatter.result({
  "duration": 17603564600,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iVerifyBeforeTotalAmountAfterTotalAmountDebitAmount()"
});
formatter.result({
  "duration": 88200,
  "status": "passed"
});
formatter.after({
  "duration": 883513400,
  "status": "passed"
});
});