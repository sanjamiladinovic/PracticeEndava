package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileLandingPage {

	public WebDriver driver;
	By chechusernamefield = By.cssSelector(".username");
	By pagetitletext=By.cssSelector(".page-title");

	public ProfileLandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement chechUsernameField() {
		return driver.findElement(chechusernamefield);

	}

	
	public WebElement getPageTitleText() {
		return	 driver.findElement(pagetitletext);

	}
}
