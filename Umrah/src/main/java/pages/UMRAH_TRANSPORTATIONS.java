package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UMRAH_TRANSPORTATIONS extends PageBase{

	public UMRAH_TRANSPORTATIONS(WebDriver driver) {
		super(driver);
	}
@FindBy (xpath = "//input[@type='checkbox'][1]")
WebElement Bus;

@FindBy (name= "Command")

WebElement Proceed;

@FindBy (id="term" )
WebElement Terms;

@FindBy (name = "Command")
WebElement Submit;


public void select_Bus() throws InterruptedException {
	
Bus.click();
Proceed.click();
Terms.click();
Submit.click();
}
}
