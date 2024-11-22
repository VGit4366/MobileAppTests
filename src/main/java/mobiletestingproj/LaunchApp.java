package mobiletestingproj;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.print.PrintOptions.Orientation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LaunchApp {
	
	 public static void doubleTap(WebElement element, WebDriver driver) {
	        // Create a PointerInput for touch interactions
	        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

	        // Get the element's location
	        int centerX = element.getRect().getX() + (element.getRect().getWidth() / 2);
	        int centerY = element.getRect().getY() + (element.getRect().getHeight() / 2);

	        // Create first tap action
	        Sequence doubleTapSequence = new Sequence(finger, 0);
	        doubleTapSequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX, centerY));
	        doubleTapSequence.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	        doubleTapSequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	        // Add a small delay between the two taps
	        doubleTapSequence.addAction(new Pause(finger, Duration.ofMillis(100)));  // Adjust the delay for double-tap speed

	        // Create second tap action
	        doubleTapSequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX, centerY));
	        doubleTapSequence.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	        doubleTapSequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	        // Perform the sequence
	        
	    }
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		URL url = new URL("http://127.0.0.1:4723");
		
		UiAutomator2Options uia = new UiAutomator2Options();
		uia.setAppPackage("com.solodroid.solomerce");
		uia.setAppActivity("com.solodroid.solomerce.activities.MainActivity");
//		uia.setAutomationName("");
		uia.setPlatformName("android");
		uia.setDeviceName("adb-RZCX702JV3M-Rlznzs._adb-tls-connect._tcp");
		uia.setPlatformVersion("14");
//		uia.setCapability("unlockType", "pattern");
//		uia.setCapability("unlockPin", "56789");
		
		
		AndroidDriver driver = new AndroidDriver(url, uia);
		System.out.println("App launched");
		
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.xpath("(//*[@resource-id='com.solodroid.solomerce:id/product_name'])[1]"))
		.click();
		
		driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/product_image")).click();
		Thread.sleep(2000);
		
//		driver.lockDevice();
//		driver.unlockDevice();
		
//		driver.runAppInBackground(Duration.ofSeconds(5));
		
		if(driver.getOrientation().equals(ScreenOrientation.PORTRAIT)) {
			driver.rotate(ScreenOrientation.LANDSCAPE);
		}
		
		
//		PointerInput finger1 = new PointerInput(Kind.TOUCH, "finger1");
//		Sequence tap = new Sequence(finger1, 0);
//		tap.addAction(finger1.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 947, 827));
//		tap.addAction(finger1.createPointerDown(0));
//		tap.addAction(finger1.createPointerUp(0));
//		PointerInput finger2 = new PointerInput(Kind.TOUCH, "finger2");
//		Sequence tap2 = new Sequence(finger2, 0);
////		tap2.addAction(finger2.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 947, 827));
//		tap2.addAction(finger2.createPointerDown(0));
//		tap2.addAction(finger2.createPointerUp(0));
//		driver.perform(Arrays.asList(tap, tap2));
		
		
		
//		PointerInput f1 = new PointerInput(Kind.TOUCH, "f1");
//		Sequence swipe = new Sequence(f1, 0);
//		swipe.addAction(f1.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 1133, 1280));
//		swipe.addAction(f1.createPointerDown(0));
//		swipe.addAction(f1.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 23, 1280));
//		swipe.addAction(f1.createPointerUp(0));
//		driver.perform(Arrays.asList(swipe));
		
		PointerInput f2 = new PointerInput(Kind.TOUCH, "f2");
		Sequence act1 = new Sequence(f2, 0);
		act1.addAction(f2.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 1400));
		act1.addAction(f2.createPointerDown(0));
		act1.addAction(f2.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 700));
		act1.addAction(f2.createPointerUp(0));
//		driver.perform(Arrays.asList(sccroll));
		
		PointerInput f1 = new PointerInput(Kind.TOUCH, "f1");
		Sequence act2 = new Sequence(f1, 0);
		act2.addAction(f1.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 1550));
		act2.addAction(f1.createPointerDown(0));
		act2.addAction(f1.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 2500));
		act2.addAction(f1.createPointerUp(0));
		driver.perform(Arrays.asList(act1, act2));
		
		Thread.sleep(2000);
		
		PointerInput f3 = new PointerInput(Kind.TOUCH, "f3");
		Sequence act3 = new Sequence(f3, 0);
		act3.addAction(f3.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 700));
		act3.addAction(f3.createPointerDown(0));
		act3.addAction(f3.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 1400));
		act3.addAction(f3.createPointerUp(0));
//		driver.perform(Arrays.asList(sccroll));
		
		PointerInput f4 = new PointerInput(Kind.TOUCH, "f4");
		Sequence act4 = new Sequence(f4, 0);
		act4.addAction(f4.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 2500));
		act4.addAction(f4.createPointerDown(0));
		act4.addAction(f4.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 1550));
		act4.addAction(f4.createPointerUp(0));
		driver.perform(Arrays.asList(act3, act4));
		
//		AppiumBy.id("com.solodroid.solomerce:id/product_image"))
		
		WebElement productImage = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.solodroid.solomerce:id/product_image\")"));
		productImage.click();
		
		String loc = "new UiScrollable(new UiSelector()"
		+ ".resourceId(\"scrollable container\")).scrollTextIntoView(\"Portable bottle heater\")";
//		
		driver.findElement(AppiumBy.androidUIAutomator(loc)).click();
		
	}

}
