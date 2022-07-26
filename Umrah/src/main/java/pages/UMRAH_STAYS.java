package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UMRAH_STAYS extends PageBase {

	public UMRAH_STAYS(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy (xpath="//*[@id=\"LoadMoreData\"]/div[3]/article/div[2]/div[4]/button")
	WebElement Select;
	
	@FindBy (id="SelectedRoomRate")
	
	WebElement CheckBox;
	
	@FindBy (name = "Command")
	WebElement Proceed ;
	
	@FindBy (id="term" )
	WebElement Terms;
	
	@FindBy (name = "Command")
	WebElement Submit;
	
	
	
	
public void select_Hotel() throws InterruptedException {
	
	
	Select.click();
	CheckBox.click();
	Proceed.click();
	Terms.click();
	Submit.click();
}


}