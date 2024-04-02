package pageFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf4 {
	 WebDriver driver;

	public pf4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='mobileNumber']")
	WebElement Number;
	@FindBy(xpath="//button[@color='primary']")
	WebElement cont;
	@FindBy(xpath="//button[@color='primary']")
	WebElement Verify;
	@FindBy(xpath="//input[@type='tel']")
	WebElement OTP;
	public void PhoneNum(String string)
	{
		Number.sendKeys(string);
	}
	public void conti()
	{
		cont.click();
	}
	public void enter(String string) {
		OTP.sendKeys(string);
	}
	public void verify() {
		Verify.click();
	}
	

}
