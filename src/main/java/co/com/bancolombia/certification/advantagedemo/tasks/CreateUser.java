package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.MainPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.bancolombia.certification.advantagedemo.models.CreateUserModel;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Dimension;

import java.util.List;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage.*;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {

  private List<CreateUserModel> user;

  public CreateUser(List<CreateUserModel> user) {
    this.user = user;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(MainPage.BTN_MENU),
            Click.on(MainPage.LBL_LOGIN),
            Click.on(MainPage.LBL_SIGNUP),
            Enter.theValue(user.get(0).getUserName()).into(TXT_USERNAME),
            Enter.theValue(user.get(0).getEmail()).into(TXT_EMAIL),
            Enter.theValue(user.get(0).getPassword()).into(TXT_PASSWORD),
            Enter.theValue(user.get(0).getConfirmPassword()).into(TXT_CONFIRM_PASSWORD),
            Enter.theValue(user.get(0).getFirstName()).into(TXT_FIRST_NAME),
            Enter.theValue(user.get(0).getLastName()).into(TXT_LAST_NAME),
            Enter.theValue(user.get(0).getPhoneNumber()).into(TXT_PHONE)
    );
    //Swipe
    double anchorPercentage = 0.5;
    double startPercentage = 0.9;
    double endPercentage = 0.1;
    int duration = 1000;
    AndroidDriver driver = (AndroidDriver) BrowsingTheWeb.as(actor).getDriver();
    Dimension size = driver.manage().window().getSize();
    int anchor = (int) (size.width * anchorPercentage);
    int startPoint = (int) (size.height * startPercentage);
    int endPoint = (int) (size.height * endPercentage);
    new TouchAction(driver)
            .press(point(anchor, startPoint))
            .waitAction(waitOptions(ofMillis(duration)))
            .moveTo(point(anchor, endPoint))
            .release().perform();

    actor.attemptsTo(
            Click.on(LST_COUNTRIES),
            Click.on(LBL_ARGENTINA),
            Enter.theValue(user.get(0).getState()).into(TXT_STATE),
            Enter.theValue(user.get(0).getAddress()).into(TXT_ADDRESS),
            Enter.theValue(user.get(0).getCity()).into(TXT_CITY),
            Enter.theValue(user.get(0).getZip()).into(TXT_ZIP),
            Click.on(BTN_REGISTER)
    );

//    actor.attemptsTo(Enter.theValue(user.get(0).getUserName()).into(CreateUserPage.TXT_USERNAME));


//    actor.attemptsTo();

  }
  public static CreateUser createUser(List<CreateUserModel> user){
    return instrumented(CreateUser.class, user);
  }
}
