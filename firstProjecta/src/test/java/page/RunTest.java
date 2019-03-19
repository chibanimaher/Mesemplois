package page;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;

public class RunTest extends Config {
	@Test
	 
public void Login() throws InterruptedException, IOException{
		//(new TouchAction(_driverANDROID)).press(PointOption.point(405, 646)).moveTo(PointOption.point(405, 462)).release().perform();
//			Thread.sleep(2000);
		MobileElement el1 = (MobileElement) _driverANDROID.findElementByAccessibilityId("OnboardingSkipButton");
		el1.click();
		Thread.sleep(2000);
		TouchAction touchAction178 = new TouchAction(_driverANDROID);
		touchAction178.tap(PointOption.point(339, 336)).perform();
		Thread.sleep(2000);
		MobileElement el2 = (MobileElement) _driverANDROID.findElementByXPath("//android.view.ViewGroup[@content-desc=\"OffersSearchFormKeywordsEntry\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
		el2.sendKeys("architecte");
		Thread.sleep(1000);
		TouchAction touchAction1 = new TouchAction(_driverANDROID);
		touchAction1.tap(PointOption.point(151, 354)).perform();
		Thread.sleep(1000);
		TouchAction touchAction2 = new TouchAction(_driverANDROID);
		touchAction2.tap(PointOption.point(248, 514)).perform();
		Thread.sleep(2000);
		TouchAction touchAction3 = new TouchAction(_driverANDROID);
		touchAction3.tap(PointOption.point(130, 270)).perform();
		Thread.sleep(2000);
		TouchAction touchAction4 = new TouchAction(_driverANDROID);
		touchAction4.tap(PointOption.point(355, 716)).perform();
		Thread.sleep(4000);
		(new TouchAction(_driverANDROID)).press(PointOption.point(371, 1000)).moveTo(PointOption.point(450, 525)).release().perform();
	Thread.sleep(3000);		
		//retour en arrière
		TouchAction touchAction5 = new TouchAction(_driverANDROID);
		touchAction5.tap(PointOption.point(46, 98)).perform();
		Thread.sleep(3000);
		MobileElement el92 = (MobileElement) _driverANDROID.findElementByAccessibilityId("de critères");
		el92.click();
		MobileElement el93 = (MobileElement) _driverANDROID.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.Button/android.view.ViewGroup");
		el93.click();
		MobileElement el94 = (MobileElement) _driverANDROID.findElementByAccessibilityId("Franchise");
		el94.click();
		MobileElement el95 = (MobileElement) _driverANDROID.findElementByAccessibilityId("Non renseignée");
		el95.click();
		MobileElement el96 = (MobileElement) _driverANDROID.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
		el96.click();
		MobileElement el97 = (MobileElement) _driverANDROID.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.Button/android.view.ViewGroup");
		el97.click();
		MobileElement el98 = (MobileElement) _driverANDROID.findElementByAccessibilityId("AutoCompletionSearchEntry");
		el98.sendKeys("immo");
		TouchAction touchAction50 = new TouchAction(_driverANDROID);
		touchAction50.tap(PointOption.point(79, 188)).perform();
		Thread.sleep(2000);
		
		MobileElement el99 = (MobileElement) _driverANDROID.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button");
		el99.click();
		Thread.sleep(1000);
		MobileElement el910 = (MobileElement) _driverANDROID.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Button");
		el910.click();
		Thread.sleep(1000);
		MobileElement el911 = (MobileElement) _driverANDROID.findElementByXPath("//android.view.ViewGroup[@content-desc=\"OffersSearchFormSearchButton\"]/android.view.ViewGroup/android.view.ViewGroup[2]");
		el911.click();
		Thread.sleep(3000);
		/*
		 * File scrFile =
		 * ((TakesScreenshot)_driverANDROID).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(scrFile, new File("C:\\Users\\mchibani\\Desktop\\ScreenShot\\"));
		 */
		
}
	 @SuppressWarnings("deprecation")
	public void captureScreenShots() throws IOException {
	      String  folder_name="screenPhoto";
	        File f=((TakesScreenshot)_driverANDROID).getScreenshotAs(OutputType.FILE);
	        //Date format fot screenshot file name
	       DateFormat df=new  SimpleDateFormat("dd-MM-yyyy");
	        //create dir with given folder name
	        new File(folder_name).mkdir();
	        //Setting file name
	        String file_name=df.format(new Date(0))+".png";
	        //coppy screenshot file into screenshot folder.
	        FileUtils.copyFile(f, new File("C:\\Users\\mchibani\\git\\Movinblue\\firstProjecta\\screenshot" + file_name));
	     
	    }
	public void SeConnecter() throws InterruptedException {
		MobileElement el1 = (MobileElement) _driverANDROID.findElementById("fr.entrevoisins.entrevoisins:id/login");
		el1.sendKeys("louis.perso@yopmail.com");
		Thread.sleep(2000);
		MobileElement el2 = (MobileElement) _driverANDROID.findElementById("login-input-pswd");
		el2.sendKeys("azerty11");
		Thread.sleep(2000);
		//MobileElement el3 = (MobileElement) _driverANDROID.findElementByAccessibilityId("Connexion ");
		MobileElement el3 = (MobileElement) _driverANDROID.findElement(By.xpath("//android.widget.Button[@*[contains(.,'Connexion')]]"));
		el3.click();
		
	}
	/*
	 * // public void eventsSearch(String data) throws InterruptedException,
	 * IOException { // Thread.sleep(2000); // boolean status = false; // //
	 * //WebElement img = driver.findElementByClassName("android.widget.ImageView");
	 * // // //take screen shot // File screen = ((TakesScreenshot) _driverANDROID)
	 * // .getScreenshotAs(OutputType.FILE); // // // for (String event : events) {
	 * // _driverANDROID.findElementById("your id") // .sendKeys(data); //
	 * _driverANDROID.hideKeyboard(); // List<AndroidElement> list = _driverANDROID
	 * //
	 * .findElementsByXPath("//*[@class='android.widget.TextView' and @index='1']");
	 * // System.out.println(list.size()); // // int i = 0; // for (WebElement el :
	 * list) { // String eventList = el.getText(); // System.out.println("events" +
	 * " " + eventList); // if (eventList.equals("gg")) { // status = true; //
	 * break; // } // // i++; // } // // // //capture image of searched contact icon
	 * // List<AndroidElement> imageList = _driverANDROID.
	 * findElementsByXPath("//*[@class='android.widget.ImageView' and @index='0']");
	 * // System.out.println(imageList.size()); // // System.out.println(i); //
	 * WebElement image = imageList.get(1); // Point point = image.getLocation(); //
	 * // //get element dimension // int width = image.getSize().getWidth(); // int
	 * height = image.getSize().getHeight(); // // BufferedImage img =
	 * ImageIO.read(screen); // BufferedImage dest = img.getSubimage(point.getX(),
	 * point.getY(), width, // height); // ImageIO.write(dest, "png", screen); //
	 * File file = new File("Menu.png"); // FileUtils.copyFile(screen, file); // //
	 * //verify images // verifyImage("Menu.png", "Menu.png" ); //
	 * //Assert.assertTrue(status, "FAIL Event doesn't match" + data); //}
	 * // @DataProvider(name = "search") // public Object[][] searchData() { // //
	 * return new Object[][] { { "gg" } }; //} // // //public void
	 * verifyImage(String image1, String image2) throws IOException{ // File
	 * fileInput = new File(image1); // File fileOutPut = new File(image2); // //
	 * BufferedImage bufileInput = ImageIO.read(fileInput); // DataBuffer
	 * dafileInput = bufileInput.getData().getDataBuffer(); // int sizefileInput =
	 * dafileInput.getSize(); // BufferedImage bufileOutPut =
	 * ImageIO.read(fileOutPut); // DataBuffer dafileOutPut =
	 * bufileOutPut.getData().getDataBuffer(); // int sizefileOutPut =
	 * dafileOutPut.getSize(); // Boolean matchFlag = true; // if(sizefileInput ==
	 * sizefileOutPut) { // for(int j=0; j<sizefileInput; j++) { //
	 * if(dafileInput.getElem(j) != dafileOutPut.getElem(j)) { // matchFlag = false;
	 * // break; // } // } // } // else // matchFlag = false; //
	 * Assert.assertEquals(matchFlag, "Images are not same"); // // }
	 */}
