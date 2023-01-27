package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.userinterfaces.OrderPaymentPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.PaymentMethodPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.ShoppingCartPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LaptopsListPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LaptopDetailsPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.MainPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.QuantityPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class BuyLaptop implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_MENU),
            Click.on(LBL_LAPTOPS),
            Click.on(LST_FIRST_LAPTOP),
            Click.on(LBL_QUANTITY),
            Enter.theValue("2").into(TXT_QUANTITY),
            Click.on(LBL_APPLY_QUANTITY),
            Click.on(ICN_COLOR_MENU),
            Click.on(ICN_WHITE_COLOR_OPTION),
            Click.on(BTN_ADD_TO_CART),
            Click.on(ICN_CART),
            Click.on(ShoppingCartPage.BTN_CHECK_OUT),
            Click.on(OrderPaymentPage.LBL_SELECT_PAYMENT_METHOD),
            Click.on(PaymentMethodPage.TXT_CARD_NUMBER)
            );

    AndroidDriver driver = (AndroidDriver) BrowsingTheWeb.as(actor).getDriver();
    for (int i = 0; i < 12; i++) {
      driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    }
    actor.attemptsTo(
            Enter.theValue("123").into(PaymentMethodPage.TXT_CVV_NUMBER),
            Click.on(PaymentMethodPage.LST_SELECT_MONTH),
            Click.on(PaymentMethodPage.BTN_MONTH_01),
            Enter.theValue("dante").into(PaymentMethodPage.TXT_HOLDER_NAME),
            Click.on(PaymentMethodPage.BTN_APPLY),
            Click.on(OrderPaymentPage.BTN_PAY_NOW)
            );

  }
  public static BuyLaptop buyLaptop(){
    return instrumented(BuyLaptop.class);
  }
}
