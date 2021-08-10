package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Netforest.Baseclass;
import Netforest.Login;
import Netforest.usermaking;

public class usermakingtestcases {
	Baseclass newbaseclass;
	usermaking um;
	Login lg;
	WebDriver driver=new ChromeDriver();

	//public void openurl() {
		//newdemo.chrome(driver);
		
		//newdemo.openbrowser("http://10.10.30.124:8000/",driver);
	
	//}
	/*@BeforeSuite()
	public void openbrowser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    // driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS) ;
	     driver.manage().window().maximize();
		newdemo = new Demo();
		newdemo.chrome(driver);*/
		
		
	//}
	/*@BeforeTest
	public void openurl() {
		newdemo.openbrowser("http://10.10.30.124:8000/",driver);
	}*/
	@BeforeTest
	public void test() {
		newbaseclass  = new Baseclass();
		um = new usermaking();
		//newbaseclass.openbrowser("http://10.10.30.124:8000/", driver);
		

	    lg = new Login();
	    System.out.println("");
	  
		//lg.login("a", "a",driver);
		//lg.submit(driver);
		
		um.windowaccept(driver);
		}
	
	@Test(description="making new user")
	public void signup() {
		//um = new usermaking();
		
		um = new usermaking();
		//newdemo.openbrowser("http://10.10.30.124:8000/", driver);
		//um.windowaccept(driver);
		um.signup("cavisson","akkk@gmail.com","@dmin","@dmin",driver);
		
	}
	
}

