package StepDefinitions;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.page.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFact.exceL;
import pageFact.pf1;

//import pageFact.exceL;

//import pageFact.exceL;
 


public class report {
	WebDriver driver;
	Scanner sc= new Scanner(System.in);
	@DataProvider(name = "testdata")
	public Object getData() {
		exceL utils = new exceL("C:\\Users\\RTULASIP\\Desktop\\Book2.xlsx");
		int rows = utils.getRowCount(0);
		Object[][] logindata = new Object[rows][1];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 1; j++) {
				logindata[i][j] = utils.getdata(0, i + 1, j);
				System.out.println(logindata[i][j]);
			}
		}
		return logindata;
	}
	@BeforeMethod 
	public void before1() { 
		driver = new ChromeDriver();
	  driver.get("https://www.apollo247.com"); 
	  driver.manage().window().maximize();
	  pf1 p = new pf1(driver); 
	  p.login();
	   
	  
	 
	  
	  }
	@Test(dataProvider = "testdata")
	//@When("I fill in the deal details with {string},{string},{string},{string},{string},{string},{string},{string}")
	public void details(String phoneNumber) {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  pf1 p1= new pf1(driver);
		  p1.data(phoneNumber);
		 //p1.Phone(phoneNumber);
		  p1.con();
		  //p1.enterOtp(string);
	}
	@AfterMethod
	public void after1() {
		pf1 p2 = new pf1(driver);
		
		System.out.println("eto:");
		String otp=sc.next();
		p2.enterOtp(otp);
		p2.verify();
	}
 

}
