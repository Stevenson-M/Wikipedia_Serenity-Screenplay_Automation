package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ValidateTextField implements Question<String> {

    private Target target;


    public ValidateTextField(Target target) {
        this.target = target;
    }


    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText();
    }


    public static ValidateTextField getText(Target target){
        return new ValidateTextField(target);
    }

}
