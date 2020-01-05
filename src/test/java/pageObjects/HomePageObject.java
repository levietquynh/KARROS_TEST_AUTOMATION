package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.AbstractPage;
import pageUIs.HomePageUI;

public class HomePageObject extends AbstractPage{
	private WebDriver driver;
	List<WebElement> elements;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public int countApprovedRequest() {
		return countNumberOfElement(driver, HomePageUI.APPROVED_REQUEST_SUBMITTED_IN_2019);
	}
}
