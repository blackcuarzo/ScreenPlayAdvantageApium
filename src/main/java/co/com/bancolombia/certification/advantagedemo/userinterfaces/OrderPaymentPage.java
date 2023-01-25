package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

public class OrderPaymentPage {
  public static final Target LBL_SELECT_PAYMENT_METHOD = Target.the("SelectPaymentMethod").locatedForAndroid(By.id("textViewNoPayments")).locatedForIOS(By.xpath(""));
  public static final Target BTN_PAY_NOW = Target.the("PayNow").locatedForAndroid(By.id("buttonPayNow")).locatedForIOS(By.xpath(""));
  public static final Target LBL_PAYMENT_CONFIRMATION = Target.the("PayNow").locatedForAndroid(new ByChained(By.id("custom"), By.xpath("//android.widget.TextView[@index='1']") )).locatedForIOS(By.xpath("")); // Get pay text, check if it is "Your cart was successfully purchased"

}
