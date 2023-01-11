package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
  public static final Target ICN_HAMBURGER = Target.the("Hamburguer Icon Menu").locatedForAndroid(By.id("imageViewMenu")).locatedForIOS(By.xpath(""));

  public static final Target LBL_LOGIN = Target.the("Login Label").locatedForAndroid(By.id("textViewMenuUser")).locatedForIOS(By.xpath(""));
}
