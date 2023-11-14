package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ValidateCaptcha implements Question<String> {

    private Target target;


    public ValidateCaptcha(Target target) {
        this.target = target;
    }


    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getAttribute("validationMessage");
    }


    public static ValidateCaptcha isVisible(Target target){
        return new ValidateCaptcha(target);
    }

}
