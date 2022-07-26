package tests;

import pages.Home_Screen;
import pages.UMRAH_STAYS;
import pages.UMRAH_TRANSPORTATIONS;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
public class Umrah_Journey extends TestBase {

	Home_Screen home;
	UMRAH_STAYS stay;
	UMRAH_TRANSPORTATIONS bus;
	@SuppressWarnings("deprecation")
	@Test

	public void click_on_Umrah_Tab() throws InterruptedException {

		home = new Home_Screen(driver);
		home.click_on_tab();
		stay = new UMRAH_STAYS (driver);
		stay.select_Hotel();
		bus = new UMRAH_TRANSPORTATIONS (driver);
		bus.select_Bus();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		assertTrue(driver.getCurrentUrl().contains("UGroundServices"));

		/*String x ;
		x= driver.getCurrentUrl();
		System.out.println(x);
*/

	}

}
