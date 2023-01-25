package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
  public static final Target BTN_MENU = Target.the("Username").locatedForAndroid(By.id("imageViewMenu")).locatedForIOS(By.xpath(""));
  public static final Target LBL_LOGIN = Target.the("LoginOption").locatedForAndroid(By.id("textViewMenuUser")).locatedForIOS(By.xpath(""));
  public static final Target LBL_LAPTOPS = Target.the("LaptopsOption").locatedForAndroid(By.id("textViewMenuLaptops")).locatedForIOS(By.xpath(""));
}
