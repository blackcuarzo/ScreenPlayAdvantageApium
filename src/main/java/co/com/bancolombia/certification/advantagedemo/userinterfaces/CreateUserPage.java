package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage {

  public static final Target TXT_USERNAME = Target.the("Username").locatedForAndroid(By.xpath("")).locatedForIOS(By.xpath(""));
}
