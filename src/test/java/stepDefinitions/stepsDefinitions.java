package stepDefinitions;



import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import questions.ValidateCaptcha;
import questions.ValidateElementDisplayed;
import questions.ValidateTextField;
import tasks.*;
import userInterface.CreateAccountPage;
import userInterface.HomePage;
import userInterface.SearchResultPage;
import userInterface.ViewHistorialPage;
import org.openqa.selenium.firefox.FirefoxDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;


public class stepsDefinitions {


    private Actor actor = Actor.named("User");
    private HomePage homePage = new HomePage();
    private SearchResultPage searchResultPage = new SearchResultPage();




    @Given("User enters the wikipedia page")
    public void userEntersTheWikipediaPage() {
        WebDriver firefoxDriver = new FirefoxDriver();

// Asignar el controlador al actor
        actor.whoCan(BrowseTheWeb.with(firefoxDriver));
        String wikipediaURL = "https://es.wikipedia.org/wiki/Wikipedia:Portada";
        actor.attemptsTo(OpenWebsite.at(wikipediaURL));
    }

    @Then("User should see the welcome title")
    public void userShouldSeeTheWelcomeTitle() {
        actor.should(seeThat(ValidateTextField.getText(homePage.WelcomeWikipediaTitle), containsString("Bienvenidos a Wikipedia,")));
    }

    @When("User search for the word \"Sistema\"")
    public void userSearchForTheWordSistema() {
        actor.attemptsTo(SearchWords.ofText("Sistema"));
    }

    @Then("User should see the word \"Sistema\" in the title")
    public void userShouldSeeTheWordSistemaInTheTitle() {
        actor.should(seeThat(ValidateTextField.getText(searchResultPage.searchTitle), containsString("Sistema")));
    }

    @Then("User should see the word \"Analisis CEEM\" when scrolling down the page")
    public void userShouldSeeTheWordAnalisisCEEMWhenScrollingDownThePage() {
        String textToSearch = "Análisis CEEM";

        actor.attemptsTo(
                ScrollPage.toElement(SearchResultPage.searchSubtitle)
        );

        actor.should(
                seeThat(ValidateTextField.getText(SearchResultPage.searchSubtitle), containsString(textToSearch))
        );
    }

    @When("User enters in the create account link and fill the create account form")
    public void UserEntersInTheCreateAccountLinkAndFillTheCreateAccountForm() {
        actor.attemptsTo(GoCreateUserPage.enter());
        actor.attemptsTo(CreateAccount.fillFields("User9191993", "Password", "user@email.com"));
    }


    @Then("The text 'completa este campo' of the captcha is displayed correctly")
    public void theTextCompletaEsteCampoOfTheCaptchaIsDisplayedCorrectly() {
        actor.should(seeThat(ValidateCaptcha.isVisible(CreateAccountPage.popUpCaptcha), containsString("Completa este campo")));
    }

    @When("User enter to the mobile version")
    public void userEnterToTheMobileVersion() {
        actor.attemptsTo(GoMobileVersion.enter());
    }

    @Then("User should see the \"Escritorio\" option on the menu can go to the desktop version")
    public void userShouldSeeTheEscritorioOptionOnTheMenuCanGoToTheDesktopVersion() {
        actor.should(seeThat(ValidateTextField.getText(homePage.desktopVersionLink), containsString("Escritorio")));
        actor.attemptsTo(GoDesktopVersion.enter());
        actor.should(seeThat(ValidateTextField.getText(homePage.mobileVersionLink), containsString("Versión para móviles")));
    }

    @When("User enter in the view history page and select two revisions")
    public void userEnterInTheViewHistoryPageAndSelectTwoRevisions() {
        actor.attemptsTo(GoViewHistoralPage.enter());
        actor.attemptsTo(SelectRevisions.select());
    }

    @Then("User should see two text camps with the revisions selected")
    public void userShouldSeeTwoTextCampsWithTheRevisionsSelected() {
        actor.should(seeThat(ValidateElementDisplayed.isVisible(ViewHistorialPage.ReviewResultOne)));
        actor.should(seeThat(ValidateElementDisplayed.isVisible(ViewHistorialPage.ReviewResultTwo)));
    }
}
