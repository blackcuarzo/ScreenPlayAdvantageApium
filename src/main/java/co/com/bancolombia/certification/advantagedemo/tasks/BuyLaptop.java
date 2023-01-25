package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.userinterfaces.OrderPaymentPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.PaymentMethodPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LaptopsListPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LaptopDetailsPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.MainPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.QuantityPage.*;
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
            Enter.theValue("123456789012").into(PaymentMethodPage.TXT_CARD_NUMBER),
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
