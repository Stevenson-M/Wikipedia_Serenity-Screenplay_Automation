package userInterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage extends PageObject {

    public static final Target WelcomeWikipediaTitle = Target.the("title").located(By.id("Bienvenidos_a_Wikipedia,"));
    public static final Target searchInput = Target.the("Search Input").located(By.name("search"));
    public static final Target searchButton = Target.the("SearchButton").located(By.className("cdx-search-input__end-button"));
    public static final Target createAccountLink= Target.the("Create Account Link").located(By.id("pt-createaccount-2"));
    public static final Target mobileVersionLink= Target.the(" Mobile version Link").located(By.id("footer-places-mobileview"));
    public static final Target  desktopVersionLink = Target.the("Desktop version Link").located(By.id("mw-mf-display-toggle"));
    public static final Target viewHistoralPageLink=Target.the(" View Historial Page Link").located(By.id("ca-history"));

}
