package testcases;
//import java.util.concurrent.TimeUnit;
import Netforest.Baseclass;
import Netforest.Homepage;
import Netforest.Login;
import testcases.Logintestcase;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class Homepagetestcase extends Baseclass {
	Homepage home;
	
	@BeforeClass(description="this will login into application")
	public void login() {
		Login lg = new Login();
		lg.loginToApplication("cavisson", "@dmin", driver);
	}
	
	//WebDriver driver;
	
	@Test(description="check timepicker",priority=3)
	public void timepicker() {
		home=new Homepage();
		home.timepicker(driver);
	}
    @Test(description="check logut",priority=4)
    public void logout() {
    	home.logout(driver);
    }
    /*@Test(description="Check login form",priority=5)
    public void Loginform () {
		lg.checkloginpage(driver);
		System.out.println("Login Page is displayed");
		//File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //  FileUtils.copyFile(s, new File("tutorialpoint.png"));
		
	}*/
   /* @AfterTest
    public void sleep() throws InterruptedException {
    	newbaseclass.driversleep(driver);
    	System.out.println("after test method2");
    }*/
}
