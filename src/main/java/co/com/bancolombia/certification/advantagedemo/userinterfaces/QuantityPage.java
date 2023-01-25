package co.com.bancolombia.certification.advantagedemo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class QuantityPage {
  public static final Target TXT_QUANTITY = Target.the("QuantityOfProducts").locatedForAndroid(By.id("textViewProductQuantity")).locatedForIOS(By.xpath(""));
  public static final Target LBL_APPLY_QUANTITY = Target.the("ConfirmApplyChanges").locatedForAndroid(By.id("textViewApply")).locatedForIOS(By.xpath(""));

}
