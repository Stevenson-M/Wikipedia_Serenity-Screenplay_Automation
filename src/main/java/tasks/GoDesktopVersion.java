package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.HomePage;


public class GoDesktopVersion implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.desktopVersionLink).andAlignToTop(),
                Click.on(HomePage.desktopVersionLink)
        );

    }

    public static GoDesktopVersion enter() {
        return Tasks.instrumented(GoDesktopVersion.class);
    }
}


