package page;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Config {

	 public AndroidDriver<AndroidElement> _driverANDROID;
     public WebDriverWait _wait;
    //ffferferferf
	@org.junit.Before
public void setUp() throws Exception {
		 DesiredCapabilities _cap = new DesiredCapabilities();
         _cap.setCapability("autoGrantPermissions", "true");
         _cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.poleemploi.pemobile");
         _cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "poleemploi.recherche.droid.sources.activities.SplashActivity");
         _cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
         _cap.setCapability(MobileCapabilityType.UDID, "5200a7d5f4047421");
         _cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
         _cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
         _cap.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
         _cap.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
        

         // Serveur de lancement d'application
         _driverANDROID = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), _cap);
         _driverANDROID.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Thread.sleep(15000);
         // Temps par defaut pour localiser les elements
         //_wait = new WebDriverWait(_driverANDROID, Timeout.millis(20000));

	} 
@org.junit.After
public	void tearDown() throws Exception {
		  _driverANDROID.close();
	}
}
