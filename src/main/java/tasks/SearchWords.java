package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.HomePage;


public class SearchWords implements Task {

    private final String Text;


    public SearchWords(String text){
        this.Text=text;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Text).into(HomePage.searchInput),
                Click.on(HomePage.searchButton)
        );

    }

    public static SearchWords ofText(String text){
        return Tasks.instrumented(SearchWords.class, text);
    }
}

