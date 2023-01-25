package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

public class PaymentMethodPage {
  public static final Target TXT_CARD_NUMBER = Target.the("CardNumber").locatedForAndroid(new ByChained(By.id("AosEditTextCardNumber"), By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_CVV_NUMBER = Target.the("CvvNumber").locatedForAndroid(new ByChained(By.id("AosEditTextCCVnumber"), By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target LST_SELECT_MONTH = Target.the("SelectMonth").locatedForAndroid(By.id("textViewMonths")).locatedForIOS(By.xpath(""));
  public static final Target BTN_MONTH_01 = Target.the("Month01").locatedForAndroid(By.xpath("//android.widget.TextView[@index='0']")).locatedForIOS(By.xpath(""));
  public static final Target TXT_HOLDER_NAME = Target.the("CardHolderName").locatedForAndroid(new ByChained(By.id("AosEditTextCardHolderName"), By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target BTN_APPLY = Target.the("ApplyChanges").locatedForAndroid(By.id("textViewApply")).locatedForIOS(By.xpath(""));



}
