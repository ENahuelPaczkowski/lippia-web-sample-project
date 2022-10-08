package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager{

    public static void clickMyAccountMenu() {
        click(LoginConstants.MY_ACCOUNT_MENU);
    }

    public static void enterUsername(String username) {
        setInput(LoginConstants.USERNAME_TEXTBOX, username);
    }

    public static void enterPassword(String password) {
        setInput(LoginConstants.PASSWORD_TEXTBOX, password);
    }

    public static void clickLoginBuuton() {
        click(LoginConstants.LOGIN_BUTTON);
    }

    private static WebElement stats() {
        return getElement(LoginConstants.LOGOUT);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertFalse(getStats().isEmpty());
    }

    public static void verifyLoginFail(String message){
        Assert.assertTrue(getElement(String.format(LoginConstants.LOGIN_ERROR, message)).isDisplayed());
    }

    public static void verifyMasckedPassword(){
        Assert.assertFalse("Nahuel.123".equals(getElement(LoginConstants.PASSWORD_TEXTBOX).getText()));
    }
}
