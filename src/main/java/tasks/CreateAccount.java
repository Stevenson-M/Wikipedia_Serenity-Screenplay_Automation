package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.CreateAccountPage;
import userInterface.HomePage;



public class CreateAccount implements Task {

    private final String username;
    private final String password;
    private final String email;



    public CreateAccount(String username, String password, String email){

        this.username=username;
        this.password=password;
        this.email=email;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.createAccountLink).andAlignToTop(),
                Enter.theValue(username).into(CreateAccountPage.username),
                Enter.theValue(password).into(CreateAccountPage.password),
                Enter.theValue(password).into(CreateAccountPage.confirmPassword),
                Enter.theValue(email).into(CreateAccountPage.email),
                Click.on(CreateAccountPage.createAccountButton)
        );

    }


    public static CreateAccount fillFields(String username, String password, String email){
        return Tasks.instrumented(CreateAccount.class, username, password, email);
    }
}


