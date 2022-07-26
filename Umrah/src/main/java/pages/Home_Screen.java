package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Home_Screen extends PageBase{
	
public Home_Screen(WebDriver driver) {
	super(driver);
}


@FindBy(linkText ="UMRAH JOURNEY")
WebElement Umrah_Tab;

@FindBy (xpath ="/html/body/div[1]/div[2]/div/div/div[2]/div[7]/form/div[7]/div[3]/button")
WebElement Search;








public void click_on_tab() throws InterruptedException {
	
	Umrah_Tab.click();
	Thread.sleep(5000);
	
	Search.click();
	
	}
}