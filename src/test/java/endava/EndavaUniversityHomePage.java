package endava;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.EndavaUniversityLandingPage;
import pageObjects.ProfileLandingPage;
import resources.BaseClass;

public class EndavaUniversityHomePage extends BaseClass {
	public static Logger log = LogManager.getLogger(EndavaUniversityHomePage.class.getName());

	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialised.");

	}

	@Test(dataProvider = "getData")
	public void startPageNavigation(String username, String password) throws IOException, InterruptedException {
		/*driver = initializeDriver();
		log.info("Driver is initialised.");*/

		driver.get(prop.getProperty("url"));
		log.info("Navigate to EndavaUniversity page.");
		EndavaUniversityLandingPage lp = new EndavaUniversityLandingPage(driver);

		// System.out.println(lp.getSubtitle());
		log.info("Ulogovano na stranicu: " + driver.getTitle());
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLoginButton().click();
		// System.out.println(sout);
		log.debug("I'm debbuging.");

		ProfileLandingPage plp = new ProfileLandingPage(driver);
		// Assert.assertEquals(plp.getPageTitleText().getText(), "Sanja Miladinovic");
		log.info("Korisnik je: " + plp.chechUsernameField().getText());
		// Assert.assertTrue(plp.getPageTitleText().isDisplayed());
		Thread.sleep(5000);

	}

	@AfterTest
	public void tesrdown() {
		driver.close();
		driver = null;
	}

	@DataProvider
	public Object[][] getData() {

		// rows=how many different data types test should run-prva kucica
		// columns=how many values per each test- druga
		// indeksiranje krece od nule
		Object[][] data = new Object[2][2];

		// validni kredencijali - prvi set
		data[0][0] = "sanja.miladinovic";// 0 row,0 column
		data[0][1] = "8@7Marker8@7";// 0 row,1 column
		// data[0][2] = "Validni user.";// 0 row,2 column

		// nevalidni kredencijali - drugi set
		data[1][0] = "sanja.miladinovic";// 1 row,0 column
		data[1][1] = "8@7Marker8@7";// 1row,1 column
		// data[1][2] = "Nevaloidni user.";// 1 row,2 column

		return data;
	}

}