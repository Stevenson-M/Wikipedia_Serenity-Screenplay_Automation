package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ValidateElementDisplayed implements Question<Boolean> {

    private Target target;


    public ValidateElementDisplayed(Target target) {
        this.target = target;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }


    public static ValidateElementDisplayed isVisible(Target target){
        return new ValidateElementDisplayed(target);
    }

}
