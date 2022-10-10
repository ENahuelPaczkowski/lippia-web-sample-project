package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

public class MyAccountService extends ActionManager {

    public static void verifyDashboard() {
        Assert.assertTrue(getElement(MyAccountConstants.DASHBOARD).isDisplayed());
    }

    public static void clickLogoutButton() {
        click(MyAccountConstants.LOGOUT_BUTTON);
    }

    public static void verifyLogout() {
        Assert.assertTrue(getElement(MyAccountConstants.LOGIN_PAGE).isDisplayed());
    }

    public static void clickAccountdetailButton() {
        click(MyAccountConstants.ACCOUNTDETAIL_BUTTON);
    }

    public static void verifyPasswordChangeOption() {
        Assert.assertTrue(getElement(MyAccountConstants.PASSWORD_CHANGE).isDisplayed());
    }
}
