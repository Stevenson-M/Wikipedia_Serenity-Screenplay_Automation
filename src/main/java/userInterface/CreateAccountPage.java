package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CreateAccountPage extends PageObject {

    public static final Target username = Target.the("Username").located(By.id("wpName2"));
    public static final Target password = Target.the("Password").located(By.id("wpPassword2"));
    public static final Target confirmPassword = Target.the("Re-password").located(By.id("wpRetype"));
    public static final Target email= Target.the("Email").located(By.id("wpEmail"));
    public static final Target createAccountButton= Target.the("Create account button").located(By.id("wpCreateaccount"));
    public static final Target popUpCaptcha= Target.the("Captcha Pop-up").located(By.id("mw-input-captchaWord"));
    
}

