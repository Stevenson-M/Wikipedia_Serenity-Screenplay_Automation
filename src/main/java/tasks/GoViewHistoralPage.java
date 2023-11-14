package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.HomePage;


public class GoViewHistoralPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.viewHistoralPageLink).andAlignToTop(),
                Click.on(HomePage.viewHistoralPageLink)
        );

    }

    public static GoViewHistoralPage enter(){
        return Tasks.instrumented(GoViewHistoralPage.class);
    }
}


