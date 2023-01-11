package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.bancolombia.certification.advantagedemo.models.CreateUserModel;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {

  private List<CreateUserModel> user;

  public CreateUser(List<CreateUserModel> user) {
    this.user = user;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(user.get(0).getUserName()).into(CreateUserPage.TXT_USERNAME));

  }
  public static CreateUser createUser(List<CreateUserModel> user){
    return instrumented(CreateUser.class, user);
  }
}
