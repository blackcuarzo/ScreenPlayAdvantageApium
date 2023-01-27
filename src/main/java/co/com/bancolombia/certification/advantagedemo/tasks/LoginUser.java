package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.userinterfaces.LoginPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(MainPage.BTN_MENU),
            Click.on(MainPage.LBL_LOGIN),
            Enter.theValue("daniel1243").into(LoginPage.TXL_USER_NAME),
            Enter.theValue("8917261ssaA$").into(LoginPage.TXL_PASSWORD),
            Click.on(LoginPage.BTN_LOGIN)
    );

  }
  public static LoginUser loginUser(){
    return instrumented(LoginUser.class);
  }


}


