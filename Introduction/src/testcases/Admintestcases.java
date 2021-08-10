package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Netforest.Admin;
import Netforest.Baseclass;
import Netforest.Login;

public class Admintestcases extends Baseclass{
	 Baseclass newbaseclass;
	 Login lg;
	 Admin ad;
	 //WebDriver driver=new ChromeDriver();
	
	 /*@BeforeSuite()
		public void openbrowser() {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    // driver=new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS) ;
		     driver.manage().window().maximize();
			newbaseclass = new Baseclass();
			//newbaseclass.chrome(driver);
			//newbaseclass.openbrowser("http://10.10.30.124:8000/", driver);
		
	 }*/
	
		
	
	@BeforeMethod()
	public void login() {
		lg = new Login();
		//WebDriver driver = new ChromeDriver();
		lg.loginToApplication("cavisson", "@dmin",driver);
		//lg.submit(driver);
	}
	@Test()
	public void adduser() {
		ad = new Admin();
		ad.clickadmin("ankit2","akks@gmail.com", "ankit", "ankit",driver);
	}
	/*@AfterTest()
	public void closebrowser(){
		//newbaseclass.closebrowser(driver);
		
	}*/

}
