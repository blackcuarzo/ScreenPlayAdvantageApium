package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

import javax.accessibility.AccessibleEditableText;
import java.nio.ByteBuffer;

public class CreateUserPage {

  public static final Target TXT_USERNAME = Target.the("Username").locatedForAndroid(new ByChained(By.id("AosEditTextUserName"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_EMAIL = Target.the("Email").locatedForAndroid(new ByChained(By.id("AosEditTextEmail"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_PASSWORD = Target.the("Password").locatedForAndroid(new ByChained(By.id("AosEditTextPassword"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_CONFIRM_PASSWORD = Target.the("ConfirmPassword").locatedForAndroid(new ByChained(By.id("AosEditTextConfirmPassword"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_FIRST_NAME = Target.the("FirstName").locatedForAndroid(new ByChained(By.id("AosEditTextFirstName"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_LAST_NAME = Target.the("LastName").locatedForAndroid(new ByChained(By.id("AosEditTextLastName"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_PHONE = Target.the("LastName").locatedForAndroid(new ByChained(By.id("AosEditTextPhoneNumber"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target LST_COUNTRIES = Target.the("ListOfCountries").locatedForAndroid(By.id("textViewCountries")).locatedForIOS(By.xpath(""));
  public static final Target LBL_ARGENTINA = Target.the("CountryArgentina").locatedForAndroid(new ByChained(By.id("select_dialog_listview"),By.xpath("//*[@index='8']"))).locatedForIOS(By.id(""));
  public static final Target TXT_STATE = Target.the("State").locatedForAndroid(new ByChained(By.id("AosEditTextState"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_ADDRESS = Target.the("Address").locatedForAndroid(new ByChained(By.id("AosEditTextStreet"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_CITY = Target.the("City").locatedForAndroid(new ByChained(By.id("AosEditTextCity"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target TXT_ZIP = Target.the("ZipCode").locatedForAndroid(new ByChained(By.id("AosEditTextZip"),By.xpath("//android.widget.EditText"))).locatedForIOS(By.xpath(""));
  public static final Target BTN_REGISTER = Target.the("RegisterButton").locatedForAndroid(By.id("buttonRegister")).locatedForIOS(By.xpath(""));
}
