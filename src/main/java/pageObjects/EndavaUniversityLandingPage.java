package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EndavaUniversityLandingPage {

	public WebDriver driver;

	By username = By.cssSelector(".form-control");
	By password = By.cssSelector("#password");
	By loginbutton = By.id("loginbtn");
	By rememberusername = By.xpath("//input[@id='rememberusername']");
	By forgotpassword = By.cssSelector("..float-right");
	By pagesubtitle = By.xpath("//section[@id='region-main']/div/div/div/img");

	public EndavaUniversityLandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement getUsername() {

		return driver.findElement(username);
	}

	public WebElement getPassword() {

		return driver.findElement(password);
	}

	public WebElement getLoginButton() {

		return driver.findElement(loginbutton);
	}

	public WebElement checkRememberUsername() {

		return driver.findElement(rememberusername);
	}

	public WebElement linkForgotPassword() {

		return driver.findElement(forgotpassword);
	}

	public WebElement getSubtitle() {

		return driver.findElement(pagesubtitle);
	}
}
