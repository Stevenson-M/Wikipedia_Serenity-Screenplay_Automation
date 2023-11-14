package userInterface;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {
    public BasePage() {
        WebDriverManager.chromedriver().setup(); // Configura el ChromeDriver
    }
}
