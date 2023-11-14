package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.ViewHistorialPage;


public class SelectRevisions implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ViewHistorialPage.RadioButtonOne),
                Click.on(ViewHistorialPage.RadioButtonTwo),
                Click.on(ViewHistorialPage.submitOptionsButton)
        );

    }


    public static SelectRevisions select(){
        return Tasks.instrumented(SelectRevisions.class);
    }
}


