$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KHCN_booking_air.feature");
formatter.feature({
  "line": 2,
  "name": "Air Booking",
  "description": "",
  "id": "air-booking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HDbank"
    },
    {
      "line": 1,
      "name": "@KHCN_booking_air"
    }
  ]
});
formatter.before({
  "duration": 13327914899,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I check bill payment history",
  "description": "",
  "id": "air-booking;i-check-bill-payment-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@KHCN_booking_air-01"
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
  "name": "I login with \"lananh2009\" and \"abc123\" without new install",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I do transaction with type is \"Đặt vé máy bay\" in Home page 2 without new install",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I book an one way domestic flight from \"TP Hồ Chí Minh\" to \"Hà Nội\" on VietJet Air airline with method is Pay now",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I fill \"Nguyen Van A\" full name, \"Nam\" gender, \"abc123@gmail.com\" email, \"0335642318\" phone number with \"AUTO DESCRIPTION\" description",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I check on use for Passenger information",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I confirm the above flight with method is Pay now",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I get amount total before doing transaction for booking airline",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I scroll up page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I get transferred amount",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I continue to book the above flight",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I input \"123456\" OTP code",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I confirm the above air transaction",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I get information about the air booking",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I click air booking history",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I click air booking detail",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify all information about the air booking",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefsBase.iOpenApp()"
});
formatter.result({
  "duration": 56885900,
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
  "location": "FlowerBookingStepdefs.iLoginWithAndWithoutNewInstall(String,String)"
});
formatter.result({
  "duration": 7978280201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Đặt vé máy bay",
      "offset": 31
    },
    {
      "val": "2",
      "offset": 60
    }
  ],
  "location": "AirBookingStepdefs.iDoTransactionWithTypeIsInHomePageWithoutNewInstall(String,int)"
});
formatter.result({
  "duration": 6637240200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "one way",
      "offset": 10
    },
    {
      "val": "domestic",
      "offset": 18
    },
    {
      "val": "TP Hồ Chí Minh",
      "offset": 40
    },
    {
      "val": "Hà Nội",
      "offset": 60
    },
    {
      "val": "VietJet Air",
      "offset": 71
    },
    {
      "val": "Pay now",
      "offset": 106
    }
  ],
  "location": "AirBookingStepdefs.iBookAnOneWayDomesticFlightFromTo(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 38255446700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nguyen Van A",
      "offset": 8
    },
    {
      "val": "Nam",
      "offset": 34
    },
    {
      "val": "abc123@gmail.com",
      "offset": 48
    },
    {
      "val": "0335642318",
      "offset": 74
    },
    {
      "val": "AUTO DESCRIPTION",
      "offset": 105
    }
  ],
  "location": "AirBookingStepdefs.iFillFullNameWithGenderEmailPhoneNumberAndDescription(String,String,String,String,String)"
});
formatter.result({
  "duration": 9827391000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "check",
      "offset": 2
    }
  ],
  "location": "AirBookingStepdefs.iCheckOnUseForPassengerInformation(String)"
});
formatter.result({
  "duration": 1310134299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pay now",
      "offset": 42
    }
  ],
  "location": "AirBookingStepdefs.iConfirmTheAboveFlight(String)"
});
formatter.result({
  "duration": 12968193800,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iGetAmountTotalBeforeDoingTransactionForBookingAirline()"
});
formatter.result({
  "duration": 2582218500,
  "status": "passed"
});
formatter.match({
  "location": "TrainBookingStepdefs.iScrollUpPage()"
});
formatter.result({
  "duration": 1136672000,
  "status": "passed"
});
formatter.match({
  "location": "FlowerBookingStepdefs.iGetTransferredAmount()"
});
formatter.result({
  "duration": 221762300,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iContinueToBookTheAboveFlight()"
});
formatter.result({
  "duration": 229105700,
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
  "duration": 5270618901,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iConfirmTheAboveAirTransaction()"
});
formatter.result({
  "duration": 4643762599,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iGetInformationAboutTheAirBooking()"
});
formatter.result({
  "duration": 10294795600,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iClickAirBookingHistory()"
});
formatter.result({
  "duration": 2234071600,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iClickAirBookingDetail()"
});
formatter.result({
  "duration": 4600569301,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iVerifyAllInformationAboutTheAirBooking()"
});
formatter.result({
  "duration": 2361910300,
  "status": "passed"
});
formatter.after({
  "duration": 811773500,
  "status": "passed"
});
formatter.before({
  "duration": 12283783501,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "I pay air booking ticket with payment code",
  "description": "",
  "id": "air-booking;i-pay-air-booking-ticket-with-payment-code",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@KHCN_booking_air-02"
    },
    {
      "line": 24,
      "name": "@UninstallAndroid"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I login with \"lananh2009\" and \"abc123\" without new install",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I do transaction with type is \"Đặt vé máy bay\" in Home page 2 without new install",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I book an one way domestic flight from \"TP Hồ Chí Minh\" to \"Hà Nội\" on VietJet Air airline with method is Pay now",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I fill \"Nguyen Van A\" full name, \"Nam\" gender, \"abc123@gmail.com\" email, \"0335642318\" phone number with \"AUTO DESCRIPTION\" description",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I check on use for Passenger information",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I confirm the above flight with method is Pay later",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I get payment code",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I input payment code for payment",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I payment air ticket booking",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I input \"123456\" OTP code",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I confirm the above air transaction",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I get amount total after doing transaction for booking airline",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I verify before total amount \u003d after total amount + ticket price amount",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefsBase.iOpenApp()"
});
formatter.result({
  "duration": 73600,
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
  "location": "FlowerBookingStepdefs.iLoginWithAndWithoutNewInstall(String,String)"
});
formatter.result({
  "duration": 7521921400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Đặt vé máy bay",
      "offset": 31
    },
    {
      "val": "2",
      "offset": 60
    }
  ],
  "location": "AirBookingStepdefs.iDoTransactionWithTypeIsInHomePageWithoutNewInstall(String,int)"
});
formatter.result({
  "duration": 6735587600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "one way",
      "offset": 10
    },
    {
      "val": "domestic",
      "offset": 18
    },
    {
      "val": "TP Hồ Chí Minh",
      "offset": 40
    },
    {
      "val": "Hà Nội",
      "offset": 60
    },
    {
      "val": "VietJet Air",
      "offset": 71
    },
    {
      "val": "Pay now",
      "offset": 106
    }
  ],
  "location": "AirBookingStepdefs.iBookAnOneWayDomesticFlightFromTo(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 32813764200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nguyen Van A",
      "offset": 8
    },
    {
      "val": "Nam",
      "offset": 34
    },
    {
      "val": "abc123@gmail.com",
      "offset": 48
    },
    {
      "val": "0335642318",
      "offset": 74
    },
    {
      "val": "AUTO DESCRIPTION",
      "offset": 105
    }
  ],
  "location": "AirBookingStepdefs.iFillFullNameWithGenderEmailPhoneNumberAndDescription(String,String,String,String,String)"
});
formatter.result({
  "duration": 10473764700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "check",
      "offset": 2
    }
  ],
  "location": "AirBookingStepdefs.iCheckOnUseForPassengerInformation(String)"
});
formatter.result({
  "duration": 1384706000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pay later",
      "offset": 42
    }
  ],
  "location": "AirBookingStepdefs.iConfirmTheAboveFlight(String)"
});
formatter.result({
  "duration": 13291658000,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iGetPaymentCode()"
});
formatter.result({
  "duration": 5232992501,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iInputPaymentCodeForPayment()"
});
formatter.result({
  "duration": 3737235001,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iPaymentAirTicketBooking()"
});
formatter.result({
  "duration": 8101659599,
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
  "duration": 6174396100,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iConfirmTheAboveAirTransaction()"
});
formatter.result({
  "duration": 4671914400,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iGetAmountTotalAfterDoingTransactionForBookingAirline()"
});
formatter.result({
  "duration": 7825202400,
  "status": "passed"
});
formatter.match({
  "location": "AirBookingStepdefs.iVerifyBeforeTotalAmountAfterTotalAmountTicketPriceAmount()"
});
formatter.result({
  "duration": 19199,
  "status": "passed"
});
formatter.after({
  "duration": 777323999,
  "status": "passed"
});
});