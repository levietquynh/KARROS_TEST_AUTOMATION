package commons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
	WebElement element;
	List<WebElement> elements;
	WebDriverWait waitExplicit;
	long timeout = 30;
	
	public void sendkeyToElement(WebDriver driver, String locator, String value) {
		element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}
	
	public void waitToElementVisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, timeout);
		waitExplicit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
	}
	
	public void clickToElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public int countNumberOfElement(WebDriver driver, String locator) {
		elements = driver.findElements(By.xpath(locator));
		return elements.size();
	}
}
