package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistrationConstants;
import org.testng.Assert;

public class RegistrationService extends ActionManager {
    public static void enterEmail(String email) {
        setInput(RegistrationConstants.REGISTER_EMAIL_TEXBOX, email);
    }

    public static void enterPassword(String password) {
        setInput(RegistrationConstants.REGISTER_PASSWORD_TEXBOX, password);
    }

    public static void clickRegisterButton() {
        click(RegistrationConstants.REGISTER_BUTTON);
    }

    public static void verifyErrorMessage(String message) {
        Assert.assertTrue(getElement(String.format(RegistrationConstants.ERROR_MESSAGE, message)).isDisplayed());
    }
}
