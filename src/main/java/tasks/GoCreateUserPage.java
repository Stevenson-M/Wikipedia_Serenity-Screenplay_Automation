package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.HomePage;

public class GoCreateUserPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.createAccountLink).andAlignToTop(),
                Click.on(HomePage.createAccountLink)
        );
    }

    public static GoCreateUserPage enter(){
        return Tasks.instrumented(GoCreateUserPage.class);
    }
}


