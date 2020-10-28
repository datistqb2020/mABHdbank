package android.stepdef;

import android.base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import static android.stepdef.StepdefsBase.d_transferredAmount;
import static android.stepdef.StepdefsBase.d_afterAmount;
import static android.stepdef.StepdefsBase.d_beforeAmount;
import static org.testng.Assert.assertTrue;

public class TrainBookingStepdefs extends TestBase {

    @Then("^I book an (one way|round trip) train from \"([^\"]*)\" to \"([^\"]*)\" with seat type is \"([^\"]*)\"$")
    public void iBookAnOneWayTrainFromToWithSeatTypeIs(String type, String fromTrain, String toTrain, String seatType) throws Exception {
        Calendar now = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        String s_day = String.valueOf(now.get(Calendar.DAY_OF_MONTH)+4);
        String e_day = s_day;
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Ga khởi hành']")).click();
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.EditText[@index='0']")).click();
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.EditText[@index='0']")).sendKeys("Ha");
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + fromTrain + "']")).click();
        Thread.sleep(1000);
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.EditText[@index='0']")).click();
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.EditText[@index='0']")).sendKeys("Sa");
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + toTrain + "']")).click();
        switch (type) {
            case "one way":
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Một chiều']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Ngày đi']")).click();
                Thread.sleep(1000);
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + s_day + "']")).click();
                Thread.sleep(1000);
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Xác nhận']")).click();
                break;
            case "round trip":
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Khứ hồi']")).click();
                break;
        }
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Hành khách']")).click();
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout/android.widget.LinearLayout[@index='2']/android.widget.ImageView[@index='2']")).click();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Xong']")).click();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Loại chỗ']")).click();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + seatType + "']")).click();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Xong']")).click();
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='TIẾP TỤC']")).click();
    }

    @And("^I choose departing and return time for (one way|round trip) train$")
    public void iChooseDepartingAndReturnTimeForOneWayTrain(String type) throws Exception {
        switch (type) {
            case "one way":
                androidDriver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.ImageView")).click();
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='TIẾP TỤC']")).click();
                androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='3']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout/android.widget.LinearLayout")).click();
                waitElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.ImageView"));
                androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='1']/android.widget.ImageView")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn']")).click();
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Xong']")).click();
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='TIẾP TỤC']")).click();
                waitElement(By.xpath("//android.widget.TextView[@text='Chỗ đang đặt']"));
                androidDriver.findElement(By.xpath("//android.widget.Button[@index='3']")).click();
                break;
        }
    }

    @And("^I fill passenger info as below$")
    public void iFillPassengerInfoAsBelow(DataTable passengerInfo) throws Exception {
        List<List<String>> data = passengerInfo.raw();
        //This is to get the first data of the set (First Row + First Column)
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@text='Họ và tên']")).sendKeys(data.get(0).get(0));
        //This is to get the first data of the set (First Row + Second Column)
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@text='Số CMND/CCCD/Hộ chiếu/GPLX']")).sendKeys(data.get(0).get(1));

    }

    @And("^I scroll up page$")
    public void iScrollUpPage() throws Exception {
        scrollToUp();
    }

    @And("^I fill contact info as below$")
    public void iFillContactInfoAsBelow(DataTable contactInfo) throws Exception {
        List<List<String>> data = contactInfo.raw();
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@text='Số CMND/CCCD/Hộ chiếu/GPLX']")).sendKeys(data.get(0).get(0));
        androidDriver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys(data.get(0).get(1));
    }

    @And("^I get amount total before doing transaction in (hotel|train|flower) booking$")
    public void iGetAmountTotalBeforeDoingTransactionInHotelBooking(String type) throws Exception {
        switch (type) {
            default:
                List<AndroidElement> transferredAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
                String transferredAmount = transferredAmountList.get(0).getText();
                transferredAmount = transferredAmount.replace(" VND", "");
                transferredAmount = transferredAmount.replace(",", "");
                System.out.println("**************** Before Amount   " + transferredAmount);
                d_beforeAmount = Double.parseDouble(transferredAmount);
        }
    }
    @And("^I get transferred amount (in payment service|when booking train ticket|when booking bouquet)$")
    public void iGetTransferredAmountInPaymentService(String type) throws Exception {
        switch (type) {
            default:
                Thread.sleep(1000);
                List<AndroidElement> transferredAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
                String transferredAmount = transferredAmountList.get(1).getText();
                transferredAmount = transferredAmount.replace(" VND", "");
                transferredAmount = transferredAmount.replace(",", "");
                System.out.println("**************** Transferred Amount   " + transferredAmount);
                d_transferredAmount = Double.parseDouble(transferredAmount);
        }
    }


    @Then("^I continue to book (hotel|the train|flower)$")
    public void iContinueToBookHotel(String type) throws Exception {
        switch (type) {
            default:
                androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tiếp tục']")).click();
        }
    }


    @And("^I verify \"([^\"]*)\" \"([^\"]*)\" is displayed after doing transaction successfully$")
    public void iVerifyIsDisplayedAfterDoingTransactionSuccessfully(String text1, String text2) throws Exception {
        waitElement(By.xpath("//android.widget.TextView[@text='" + text1 + "']"));
        String actualString1 = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + text1 + "']")).getText();
        String actualString2 = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + text2 + "']")).getText();
        System.out.println("**************** Data table " + actualString1);
        assertTrue(actualString1.contains(text1));
        assertTrue(actualString2.contains(text2));
    }


    @And("^I get amount total after doing transaction in (hotel|train ticket) booking$")
    public void iGetAmountTotalAfterDoingTransactionInHotelBooking(String type) throws Exception {
        switch (type) {
            default:
//                Thread.sleep(15000);
                waitElement(By.xpath("//android.widget.TextView[@text='Chia sẻ']"));
                List<AndroidElement> feeList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
                String fee = feeList.get(1).getText();
                fee = fee.replace(" VND", "");
                fee = fee.replace(",", "");
                System.out.println("**************** After Amount   " + fee);
                d_afterAmount = Double.parseDouble(fee);
        }
    }

    @Then("^I fill \"([^\"]*)\" company name$")
    public void iFillCompanyName(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@index='0']")).sendKeys(arg0);
    }

    @And("^I fill \"([^\"]*)\" company tax number$")
    public void iFillCompanyTaxNumber(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='3']//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@index='0']")).sendKeys(arg0);
    }

    @And("^I fill \"([^\"]*)\" company address$")
    public void iFillCompanyAddress(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@index='0']")).sendKeys(arg0);
    }

    @Then("^I fill \"([^\"]*)\" company phone number$")
    public void iFillCompanyPhoneNumber(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='7']//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[@index='0']")).sendKeys(arg0);
    }

    @And("^I click \"([^\"]*)\" to book train$")
    public void iClickToBookTrain(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.Button[@index='4']")).click();
        waitElement(By.xpath("//android.widget.TextView[@text='Thông báo']"));
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='" + arg0 + "']")).click();
        if(arg0.equals("Có")){
            androidDriver.findElement(By.xpath("//android.widget.Button[@index='4']")).click();
            waitElement(By.xpath("//android.widget.TextView[@text='Thông báo']"));
            androidDriver.findElement(By.xpath("//android.widget.Button[@text='" + arg0 + "']")).click();
        }
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='THANH TOÁN']")).click();
        waitElement(By.xpath("//android.widget.TextView[@text='Thông báo']"));
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Không']")).click();
        Thread.sleep(2000);
    }
}
