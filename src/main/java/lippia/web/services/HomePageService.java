package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomePageService extends ActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickShopMenuButton() {
        click(HomePageConstants.SHOP_MENU_BUTTON);
    }
    public static void clickHomeButton() {
        click(HomePageConstants.HOME_BUTTON);
    }

    public static void verifySlider(int numero) {
        List<WebElement> elements = getElements(HomePageConstants.SLIDER_CHILD);
        Assert.assertEquals(elements.size(), numero);
    }
}
