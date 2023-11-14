package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ViewHistorialPage extends PageObject {

    public static final Target RadioButtonOne = Target.the("Radio Button one ").located(By.id("mw-oldid-123425818"));
    public static final Target RadioButtonTwo = Target.the("Radio Button two ").located(By.id("mw-oldid-112968885"));
    public static final Target submitOptionsButton = Target.the("submit Options Button").located(By.className("historysubmit"));
    public static final Target ReviewResultOne = Target.the("Text Review Result one").located(By.className("diff-side-deleted"));
    public static final Target ReviewResultTwo = Target.the("Text Review Result two").located(By.className("diff-side-added"));
}

