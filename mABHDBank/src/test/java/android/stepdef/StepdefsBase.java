package android.stepdef;

import cucumber.api.java.en.Given;

public class StepdefsBase {

    public static double d_beforeAmount = 0;
    public static double d_afterAmount = 0;
    public static double d_transferredAmount = 0;

    @Given("^I open app$")
    public void iOpenApp() throws Exception {
    }
}
