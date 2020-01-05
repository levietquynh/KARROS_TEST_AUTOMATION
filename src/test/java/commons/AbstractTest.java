package commons;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractTest {
	protected final Log log;
	WebDriver driver;

	protected AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

	public WebDriver openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	protected void closeBrowserAndDriver(WebDriver driver) {
		if (driver != null) {
			driver.quit();
		}
	}
	
	protected boolean verifyEquals(Object actual, Object expected) {
		return checkEquals(actual, expected);
	}
	
	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			log.info("===PASSED===");
		} catch (Throwable e) {
			pass = false;
			log.info("===FAILED===");
		}
		return pass;
	}
}
