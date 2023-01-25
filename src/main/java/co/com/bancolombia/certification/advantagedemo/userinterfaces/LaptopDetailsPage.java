package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LaptopDetailsPage {
  public static final Target LBL_QUANTITY = Target.the("QuantitySelection").locatedForAndroid(By.id("textViewProductQuantity")).locatedForIOS(By.xpath(""));
  public static final Target ICN_COLOR_MENU = Target.the("ColorSelection").locatedForAndroid(By.id("frameLayoutProductColor")).locatedForIOS(By.xpath(""));
  public static final Target ICN_WHITE_COLOR_OPTION = Target.the("").locatedForAndroid(new ByChained(By.id("linearLayoutProductColorsPalette"), By.xpath("//android.widget.LinearLayout/android.widget.FrameLayout[@index='2']"))).locatedForIOS(By.xpath(""));
  public static final Target BTN_ADD_TO_CART = Target.the("AddToCart").locatedForAndroid(By.id("buttonProductAddToCart")).locatedForIOS(By.xpath(""));
  public static final Target ICN_CART = Target.the("Cart").locatedForAndroid(By.id("imageViewCart")).locatedForIOS(By.xpath(""));



}
