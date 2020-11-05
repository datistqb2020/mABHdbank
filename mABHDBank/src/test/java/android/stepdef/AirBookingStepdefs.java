package android.stepdef;

import android.base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.gl.E;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AirBookingStepdefs extends TestBase {
    String datetime, code,status;

    @Then("^I book an (one way|round trip) (domestic|international) flight from \"([^\"]*)\" to \"([^\"]*)\" on (Vietnam Airlines|Pacific Airlines|VietJet Air|Bamboo Airways) airline with method is (Pay later|Pay now)$")
    public void iBookAnOneWayDomesticFlightFromTo(String type, String flightType, String fromFlight, String toFlight, String airline, String method) throws Exception {
        waitElement(By.xpath("//android.widget.TextView[@text='Đặt vé máy bay Nội địa']"));
        Calendar now = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        String s_day = String.valueOf(now.get(Calendar.DAY_OF_MONTH)+4);
//        double d_day = Double.parseDouble(s_day);
        int d_day = Integer.parseInt(s_day);
        int d_s_day_later = d_day + 2;
        int d_e_day = d_day + 1;
        int d_e_day_later = d_e_day + 2;
        String e_day = String.valueOf(d_e_day);
        String s_day_later = String.valueOf(d_s_day_later);
        String e_day_later = String.valueOf(d_e_day_later);
        switch (type) {
            case "one way":
                if (flightType.equals("domestic")) {
                    androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Đặt vé máy bay Nội địa']")).click();
                } else if (flightType.equals("international")) {
                    androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Đặt vé máy bay Quốc tế']")).click();
                }
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Một chiều']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn điểm khởi hành']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='" + fromFlight + "']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + fromFlight + "']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn điểm đến']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='" + toFlight + "']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + toFlight + "']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn ngày']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='" + s_day + "']"));
                switch (method) {
                    case "Pay later":
                        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + s_day_later + "']")).click();
                        break;
                    case "Pay now":
                        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + s_day + "']")).click();
                        break;
                }
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Xác nhận']")).click();
                switch (airline) {
                    case "VietJet Air":
//                        androidDriver.findElement(By.xpath("//android.widget.CheckBox[@text='Vietnam Airlines']")).click();
//                        androidDriver.findElement(By.xpath("//android.widget.CheckBox[@text='Pacific Airlines']")).click();
//                        androidDriver.findElement(By.xpath("//android.widget.CheckBox[@text='Bamboo Airways']")).click();
                        break;
                }
                Thread.sleep(1000);
                scrollToUp();
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tìm chuyến bay']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='Danh sách chuyến bay']"));
                androidDriver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[@index='0']")).click();
                Thread.sleep(2000);
                waitElement(By.xpath("//android.widget.TextView[@text='Đặt vé']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Đặt vé']")).click();
                break;
            case "round trip":
                if (flightType.equals("domestic")) {
                    androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Đặt vé máy bay Nội địa']")).click();
                } else if (flightType.equals("international")) {
                    androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Đặt vé máy bay Quốc tế']")).click();
                }
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Khứ hồi']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn điểm khởi hành']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='" + fromFlight + "']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + fromFlight + "']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn điểm đến']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='" + toFlight + "']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + toFlight + "']")).click();
                // Choose start & end day
                androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.TextView]")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='Chọn ngày bay']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + s_day + "']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + e_day + "']")).click();
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Xác nhận']")).click();
                Thread.sleep(1000);
                scrollToUp();
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tìm chuyến bay']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='Danh sách chuyến bay']"));
                androidDriver.findElement(By.xpath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='0']")).click();
                Thread.sleep(2000);
                waitElement(By.xpath("//android.widget.TextView[@text='Đặt vé']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Đặt vé']")).click();
                break;
        }
    }

    @And("^I fill \"([^\"]*)\" full name, \"([^\"]*)\" gender, \"([^\"]*)\" email, \"([^\"]*)\" phone number with \"([^\"]*)\" description$")
    public void iFillFullNameWithGenderEmailPhoneNumberAndDescription(String name, String gender, String email, String phoneNumber, String description) throws Exception {
        waitElement(By.xpath("//android.widget.TextView[@text='Thông tin đặt vé']"));
        String hotendem = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.EditText[@index='0']")).getText();
        if(hotendem != null){
            androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.EditText[@index='0']")).clear();
            androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + gender + "']")).clear();
            androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.EditText[@index='4']")).clear();
            androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.EditText[@index='6']")).clear();
        }
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.EditText[@index='0']")).sendKeys(name);
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + gender + "']")).click();
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.EditText[@index='4']")).sendKeys(email);
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.EditText[@index='6']")).sendKeys(phoneNumber);

        androidDriver.findElement(By.xpath("//android.widget.EditText[@text='Nội dung (tùy chọn)']")).sendKeys(description);
    }

    @And("^I (check|uncheck) on use for Passenger information$")
    public void iCheckOnUseForPassengerInformation(String type) throws Exception {
        switch (type) {
            case "check":
                androidDriver.findElement(By.xpath("//android.widget.CheckBox[@text='Dùng làm thông tin hành khách bay']")).click();
                break;
            case "uncheck":
                break;
        }
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tiếp tục']")).click();
    }

    @Then("^I confirm the above flight with method is (Pay later|Pay now)$")
    public void iConfirmTheAboveFlight(String type) throws Exception {
        waitElement(By.xpath("//android.widget.TextView[@text='Xác nhận chuyến bay']"));
        androidDriver.findElement(By.xpath("//android.widget.CheckBox")).click();
        switch (type) {
            case "Pay later":
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Thanh toán sau']")).click();
                break;
            case "Pay now":
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Thanh toán']")).click();
                break;
        }
        Thread.sleep(10000);
    }

    @And("^I get amount total before doing transaction for booking airline$")
    public void iGetAmountTotalBeforeDoingTransactionForBookingAirline() throws Exception {
        waitElement(By.xpath("//android.widget.TextView[@text='Thanh toán vé máy bay']"));
        List<AndroidElement> transferredAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String transferredAmount = transferredAmountList.get(0).getText();
        transferredAmount = transferredAmount.replace(" VND", "");
        transferredAmount = transferredAmount.replace(",", "");
        System.out.println("**************** Before Amount   " + transferredAmount);
        d_beforeAmount = Double.parseDouble(transferredAmount);
        Thread.sleep(1000);
    }

    @And("^I continue to book the above flight$")
    public void iContinueToBookTheAboveFlight() throws Exception {
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tiếp tục']")).click();
    }

    @And("^I get amount total after doing transaction for booking airline$")
    public void iGetAmountTotalAfterDoingTransactionForBookingAirline() throws Exception {
        Thread.sleep(3000);
        //        List<?> text = androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String afterAmount = androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'VND')]")).getText();
        afterAmount = afterAmount.replace(" VND", "");
        afterAmount = afterAmount.replace(",", "");
        System.out.println("**************** After Amount   " + afterAmount);
        d_afterAmount = Double.parseDouble(afterAmount);
    }

    @And("^I do transaction with type is \"([^\"]*)\" in Home page (\\d+) without new install$")
    public void iDoTransactionWithTypeIsInHomePageWithoutNewInstall(String arg0, int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        waitElement(By.xpath("//android.widget.TextView[@text='Tài khoản']"));
        swipeToLeft();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" +arg0 + "']")).click();
    }

    @Then("^I confirm the above air transaction$")
    public void iConfirmTheAboveAirTransaction() throws Exception {
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Xác nhận']")).click();
    }

    @Then("^I get information about the air booking$")
    public void iGetInformationAboutTheAirBooking() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Chia sẻ']"));
        datetime = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.TextView[@index='1']")).getText();
        code = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']/android.widget.TextView[@index='1']")).getText();
        status = "Đã thanh toán";
        System.out.println("**************** Datetime   " + datetime);
        System.out.println("**************** Code   " + code);
        System.out.println("**************** Status   " + status);

        scrollToUp();
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Giao dịch khác']")).click();
    }

    @Then("^I click air booking history$")
    public void iClickAirBookingHistory() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Đặt vé máy bay Nội địa']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Lịch sử đặt vé máy bay']")).click();
    }

    @And("^I click air booking detail$")
    public void iClickAirBookingDetail() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Lịch sử đặt vé máy bay']"));
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']")).click();
    }

    @Then("^I verify all information about the air booking$")
    public void iVerifyAllInformationAboutTheAirBooking() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Chi tiết vé']"));
        String time = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='1']")).getText();
        String vCode = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.TextView[@index='1']")).getText();
        String stt = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']/android.widget.TextView[@index='1']")).getText();
        List<AndroidElement> transferredAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String amount = transferredAmountList.get(0).getText();
        amount = amount.replace(" VND", "");
        amount = amount.replace(",", "");
        System.out.println("**************** Amount history   " + amount);
        System.out.println("**************** Code history   " + vCode);
        System.out.println("**************** Status history   " + stt);
        System.out.println("**************** Datetime history   " + time);
        assertEquals(Double.parseDouble(amount), d_transferredAmount);
        assertTrue(code.contains(vCode));
        assertTrue(stt.contains(status));
        assertTrue(time.contains(datetime));
    }

    @And("^I get payment code$")
    public void iGetPaymentCode() throws Exception {
        waitElement(By.xpath("//android.widget.TextView[@text='Kết quả']"));
        code = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.TextView[@index='1']")).getText();
        System.out.println("Code " + code);
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Hoàn tất']")).click();
    }

    @And("^I input payment code for payment$")
    public void iInputPaymentCodeForPayment() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Đặt vé máy bay Nội địa']"));
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.EditText[@index='1']")).sendKeys(code);
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tra cứu']")).click();
    }

    @Then("^I payment air ticket booking$")
    public void iPaymentAirTicketBooking() throws Exception {
        waitElement(By.xpath("//android.widget.TextView[@text='Chi tiết vé']"));
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Thanh toán']")).click();
        waitElement(By.xpath("//android.widget.TextView[@text='Thanh toán vé máy bay']"));
        List<AndroidElement> transferredTotalAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String totalAmount = transferredTotalAmountList.get(0).getText();
        totalAmount = totalAmount.replace(" VND", "");
        totalAmount = totalAmount.replace(",", "");
        System.out.println("**************** Before Amount   " + totalAmount);
        d_beforeAmount = Double.parseDouble(totalAmount);
        scrollToUp();
        List<AndroidElement> transferredAmountList1 = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String transferredAmount = transferredAmountList1.get(0).getText();
        transferredAmount = transferredAmount.replace(" VND", "");
        transferredAmount = transferredAmount.replace(",", "");
        System.out.println("**************** Transferred Amount   " + transferredAmount);
        d_transferredAmount = Double.parseDouble(transferredAmount);
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tiếp tục']")).click();
    }

    @Then("^I verify before total amount = after total amount \\+ ticket price amount$")
    public void iVerifyBeforeTotalAmountAfterTotalAmountTicketPriceAmount() throws Exception {
        assertEquals(d_beforeAmount, d_afterAmount + d_transferredAmount);
    }
}
