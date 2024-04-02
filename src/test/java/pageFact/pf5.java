package pageFact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf5 {
	WebDriver driver;
	public pf5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="	//a[@href='/oneapollo-membership']\"")
	WebElement membership;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/button[1]")
	WebElement MyMembership;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/h3")
	WebElement clinic;
			
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/button[2]/span[1]")
	WebElement MyTransactions;
	@FindBy(xpath="//ul[@class='jss89']/li")
			WebElement total;
	public void clickMembership() {
		membership.click();
	}
	public void MyMemberShip() {
		MyMembership.click();
		
	}
	public String Text1() {
		return clinic.getText();
	}
	public void myTransactions() {
		MyTransactions.click();
	}
	public String Text2() {
		return total.getText();
	}

}
