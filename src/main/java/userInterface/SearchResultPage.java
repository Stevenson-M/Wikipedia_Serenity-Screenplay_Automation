package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultPage extends PageObject {

    public static final Target searchTitle = Target.the("Search heading").located(By.className("mw-page-title-main"));

    public static final Target searchSubtitle = Target.the("Search subtitle text").located(By.xpath(String.format("//*[@class='mw-headline' and contains(text(), '%s')]", "Análisis CEEM")));
}
