package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LoginPage {
  public static final Target LBL_SIGNUP = Target.the("SignUp").locatedForAndroid(By.id("textViewSingUpToday")).locatedForIOS(By.xpath(""));
  public static final Target TXL_USER_NAME = Target.the("UserName").locatedForAndroid(new ByChained(By.id("AosEditTextLoginUserName"), By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXL_PASSWORD = Target.the("Password").locatedForAndroid(new ByChained(By.id("AosEditTextLoginPassword"), By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));

  public static final Target BTN_LOGIN = Target.the("LoginButton").locatedForAndroid(By.id("buttonLogin")).locatedForIOS(By.xpath(""));

}
