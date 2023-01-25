package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {
  public static final Target BTN_CHECK_OUT = Target.the("CheckOut").locatedForAndroid(By.id("buttonCheckOut")).locatedForIOS(By.xpath(""));

}
