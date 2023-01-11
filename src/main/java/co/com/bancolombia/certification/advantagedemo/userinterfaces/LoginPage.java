package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

  public static final Target TXT_USERNAME = Target.the("User name field").locatedForAndroid(By.xpath("//android.widget.TextView[contains(@text,'USER NAME')]")).locatedForIOS(By.xpath(""));

}
