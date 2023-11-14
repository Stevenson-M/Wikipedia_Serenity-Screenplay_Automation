package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Scroll;

public class ScrollPage implements Task {

    private final Target targetElement;

    public ScrollPage(Target targetElement) {
        this.targetElement = targetElement;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(targetElement)
        );
    }


    public static ScrollPage toElement(Target targetElement) {
        return new ScrollPage(targetElement);
    }
}