package Pages.AndroidPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static junit.framework.TestCase.assertTrue;


public class AndroidHomePage {


	private final AndroidDriver driver;

	private final By updatePositionBtn = By.xpath("//android.view.View[@index='3']");


	public AndroidHomePage(AndroidDriver driver) {
		this.driver = driver;

	}


	public void updateLocation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='3']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button")));
		List<WebElement> buttons = driver.findElements(By.className("android.widget.Button"));
		Thread.sleep(8000);
		buttons.get(1).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAccessibilityId("Lng: 121.49612333333334")));
		assertTrue(driver.findElementByAccessibilityId("Lat: 31.240108333333335").isDisplayed());

	}


	}
