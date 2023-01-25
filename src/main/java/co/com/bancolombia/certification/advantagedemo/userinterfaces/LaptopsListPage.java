package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LaptopsListPage {

  public static final Target LST_FIRST_LAPTOP = Target.the("FirstLaptop").locatedForAndroid(new ByChained(By.id("gridViewProducts"),By.xpath("//android.widget.RelativeLayout[@index='0']"))).locatedForIOS(By.xpath(""));

}
