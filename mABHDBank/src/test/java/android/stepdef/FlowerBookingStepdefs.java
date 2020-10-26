package android.stepdef;

import android.base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.awt.*;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FlowerBookingStepdefs extends TestBase {
    private double d_beforeAmount = 0;
    private double d_afterAmount = 0;
    private double d_transferredAmount = 0;

    @When("^I login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginWithAnd(String arg0, String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        try{
            waitElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']"));
            androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']")).click();
            waitElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']"));
            androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']")).click();

        }catch (Exception e){
        }
        try {
            if (androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='8']/android.widget.RelativeLayout[@index='0']/android.widget.ImageView[@index='2']")).isDisplayed()) {
                // Tap on icon x in text box user name
                androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='8']/android.widget.RelativeLayout[@index='0']/android.widget.ImageView[@index='2']")).click();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        androidDriver.findElement(By.xpath("//android.widget.EditText[@text='Tài khoản']")).clear();
        androidDriver.findElement(By.xpath("//android.widget.EditText[@text='Tài khoản']")).sendKeys(arg0);
        androidDriver.findElement(By.xpath("//android.widget.EditText[@text='Mật khẩu']")).clear();
        androidDriver.findElement(By.xpath("//android.widget.EditText[@text='Mật khẩu']")).sendKeys(arg1);
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Đăng nhập']")).click();
    }

    @Then("^I input \"([^\"]*)\" OTP code$")
    public void iInputOTPCode(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        waitElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.TextView[@index='2']"));
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.TextView[@index='2']")).sendKeys(arg0);
    }

    @And("^I do transaction with type is \"([^\"]*)\" in Home page (\\d+)$")
    public void iDoTransactionWithTypeIsInHomePage(String arg0, int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        waitElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='1']"));
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='1']")).click();
        waitElement(By.xpath("//android.widget.TextView[@text='Tài khoản']"));
        swipeToLeft();
        waitElement(By.xpath("//android.widget.TextView[@text='" + arg0 + "']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" +arg0 + "']")).click();
    }

    @And("^I enable location$")
    public void iEnableLocation() throws Exception{
        try {
            waitElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']"));
            androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']")).click();
        }catch (Exception e){

        }
    }

    @And("^I click \"([^\"]*)\"$")
    public void iClick(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        switch (arg0){
            case "Đặt mua hoa":
                waitElement(By.xpath("//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']"));
                androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']")).click();
                break;
            case "Tiếp tục":
                waitElement(By.xpath("//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']"));
                androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']")).click();
                break;
            case "Lấy hóa đơn thanh toán":
                waitElement(By.xpath("//android.widget.TextView[@text='" +arg0 + "']"));
                androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + arg0 + "']")).click();
                break;
        }
    }

    @And("^I choose a flower$")
    public void iChooseAFlower() throws Exception{
        waitElement(By.xpath("//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']"));
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']")).click();
        waitElement(By.xpath("//android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']"));
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']")).click();
    }

    @Then("^I fill booking date$")
    public void iFillBookingDate() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Ngày nhận hàng']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Ngày nhận hàng']")).click();
        waitElement(By.xpath("//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='2']"));
        scrollValuePicker();
        Thread.sleep(1000);
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn']")).click();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Giờ nhận hàng']")).click();
        waitElement(By.xpath("//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='2']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Chọn']")).click();
        waitElement(By.xpath("//android.widget.TextView[@text='Ngày nhận hàng']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Tiếp tục']")).click();
    }

    @And("^I get amount total before doing transaction for booking flower$")
    public void iGetAmountTotalBeforeDoingTransactionForBookingFlower() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Tài khoản nguồn']"));
        List<AndroidElement> transferredAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String transferredAmount = transferredAmountList.get(0).getText();
        transferredAmount = transferredAmount.replace(" VND", "");
        transferredAmount = transferredAmount.replace(",", "");
        System.out.println("**************** Before Amount   " + transferredAmount);
        d_beforeAmount = Double.parseDouble(transferredAmount);
        Thread.sleep(1000);
    }

    @Then("^I continue this booking$")
    public void iContinueThisBooking() throws Exception {
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Tiếp tục']")).click();
    }

    @Then("^I confirm again flower booking$")
    public void iConfirmAgainFlowerBooking() throws Exception{
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        waitElement(By.xpath("//android.widget.Button[@text='Xác nhận']"));
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Xác nhận']")).click();
    }

    @And("^I get transferred amount$")
    public void iGetTransferredAmount() throws Exception{
        getTransferredAmount();
    }
    private double getTransferredAmount() throws Exception {
        List<AndroidElement> transferredAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String transferredAmount = transferredAmountList.get(2).getText();
        transferredAmount = transferredAmount.replace(" VND", "");
        transferredAmount = transferredAmount.replace(",", "");
        System.out.println("**************** Transferred Amount   " + transferredAmount);
        d_transferredAmount = Double.parseDouble(transferredAmount);
        return d_transferredAmount;
    }

    @And("^I get amount total after doing transaction in booking flower$")
    public void iGetAmountTotalAfterDoingTransactionInBookingFlower() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Tài khoản nguồn']"));
        scrollToUp();
        getAfterAmount();
    }
    private double getAfterAmount() throws Exception {
        List<AndroidElement> afterAmountList = (List<AndroidElement>) androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text,'VND')]"));
        String afterAmount = afterAmountList.get(2).getText();
        afterAmount = afterAmount.replace(" VND", "");
        afterAmount = afterAmount.replace(",", "");
        System.out.println("**************** After Amount   " + afterAmount);
        d_afterAmount = Double.parseDouble(afterAmount);
        return d_afterAmount;
    }

    @Then("^I verify before total amount = after total amount \\+ debit amount$")
    public void iVerifyBeforeTotalAmountAfterTotalAmountDebitAmount() {
        assertEquals(d_beforeAmount, d_afterAmount + d_transferredAmount);
    }

    @Then("^I scroll up$")
    public void iScrollUp() throws Exception{
        scrollToUp();
    }

    @And("^I confirm the above transaction$")
    public void iConfirmTheAboveTransaction() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Thông tin xác nhận']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Xác nhận']")).click();
    }

    @And("^I fill email \"([^\"]*)\"$")
    public void iFillEmail(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        waitElement(By.xpath("//android.view.ViewGroup[@index='3']/android.view.ViewGroup[@index='0']/android.widget.TextView"));
        Thread.sleep(1000);
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='3']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='3']/android.widget.EditText[@index='1']")).sendKeys(arg0);
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Then("^I fill receiver name \"([^\"]*)\"$")
    public void iFillReceiverName(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        scrollUpHalf();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Thông tin người nhận']")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='7']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='7']/android.widget.EditText[@index='1']")).sendKeys(arg0);
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @And("^I fill phone number \"([^\"]*)\"$")
    public void iFillPhoneNumber(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Thông tin người nhận']")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='8']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='8']//android.widget.EditText[@index='1']")).sendKeys(arg0);
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @And("^I fill address \"([^\"]*)\"$")
    public void iFillAddress(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Thông tin người nhận']")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='9']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='9']/android.widget.EditText[@index='1']")).sendKeys(arg0);
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Thông tin người nhận']")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='11']/android.widget.TextView[@index='0']")).click();
        waitElement(By.xpath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='2']"));
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        waitElement(By.xpath("//android.widget.TextView[@text='Tiếp tục']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Tiếp tục']")).click();
    }

    @And("^I navigate transaction results$")
    public void iNavigateTransactionResults() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Tài khoản nguồn']"));
        scrollToUp();
    }


    @Then("^I fill The \"([^\"]*)\" name company$")
    public void iFillTheNameCompany(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        waitElement(By.xpath("//android.widget.TextView[@text='Thông tin xuất hóa đơn']"));
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.FrameLayout[@index='0']/android.widget.EditText[@index='0']")).sendKeys(arg0);
    }

    @And("^I fill \"([^\"]*)\" tax number$")
    public void iFillTaxNumber(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.FrameLayout[@index='0']/android.widget.EditText[@index='0']")).sendKeys(arg0);
    }

    @Then("^I fill \"([^\"]*)\" billing address$")
    public void iFillBillingAddress(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='3']/android.widget.FrameLayout[@index='0']/android.widget.EditText[@index='0']")).sendKeys(arg0);
    }

    @And("^I fill \"([^\"]*)\" billing email$")
    public void iFillBillingEmail(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']/android.widget.FrameLayout[@index='0']/android.widget.EditText[@index='0']")).sendKeys(arg0);

    }

    @Then("^I submit$")
    public void iSubmit() throws Exception{
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Gửi thông tin']")).click();
    }

    @And("^I confirm billing$")
    public void iConfirmBilling() throws Exception{
        waitElement(By.xpath("//android.widget.Button[@text='Xác nhận']"));
        androidDriver.findElement(By.xpath("//android.widget.Button[@text='Xác nhận']")).click();
    }

    @Then("^I navigate billing information$")
    public void iNavigateBillingInformation() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Tài khoản nguồn']"));
        scrollToUp();
    }

    @Then("^I verify content popup is displayed \"([^\"]*)\"$")
    public void iVerifyContentPopupIsDisplayed(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
         waitElement(By.xpath("//android.widget.TextView[@text='Đồng ý']"));
        String actualString2 = androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='0']")).getText();
        assertTrue(actualString2.contains(arg0));
    }
}
