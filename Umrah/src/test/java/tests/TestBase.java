package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	
	public void Start_Chrome () {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.dyafat.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	
	public void Stop_Driver() throws InterruptedException {
	Thread.sleep(2000);
		driver.quit();
	}
}

