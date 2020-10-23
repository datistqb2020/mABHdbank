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

public class FlowerBookingStepdefs extends TestBase {
    private double d_beforeAmount = 0;
    private double d_afterAmount = 0;
    private double d_transferredAmount = 0;

    @When("^I login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginWithAnd(String arg0, String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
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
        waitElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']"));
        androidDriver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']")).click();
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
        }
    }

    @And("^I choose a flower$")
    public void iChooseAFlower() throws Exception{
        waitElement(By.xpath("//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']"));
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']")).click();
    }

    @And("^I choose \"([^\"]*)\"$")
    public void iChoose(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        waitElement(By.xpath("//android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']"));
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']")).click();
    }

    @And("^I fill all information booking$")
    public void iFillAllInformationBooking() throws Exception{
        waitElement(By.xpath("//android.view.ViewGroup[@index='3']/android.view.ViewGroup[@index='0']/android.widget.TextView"));
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='3']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='3']/android.widget.EditText[@index='1']")).sendKeys("datnt14@hdbank.com.vn");
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        scrollUpHalf();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Thông tin người nhận']")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='7']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='7']/android.widget.EditText[@index='1']")).sendKeys("Nguyen Van A");
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Thông tin người nhận']")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='8']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='8']//android.widget.EditText[@index='1']")).sendKeys("0682365489");
        try {
            if (androidDriver.isKeyboardShown()) {
                androidDriver.hideKeyboard();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Thông tin người nhận']")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='9']/android.view.ViewGroup[@index='0']/android.widget.TextView")).click();
        androidDriver.findElement(By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='9']/android.widget.EditText[@index='1']")).sendKeys("174 phan dang luu,p3,phu nhuan");
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

    @And("^I confirm flower booking$")
    public void iConfirmFlowerBooking() throws Exception{
        waitElement(By.xpath("//android.widget.TextView[@text='Thông tin xác nhận']"));
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Xác nhận']")).click();
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
}