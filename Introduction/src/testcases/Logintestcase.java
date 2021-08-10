package testcases;


import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import Netforest.Baseclass;
import Netforest.Login;
import junit.framework.Assert;

public class Logintestcase extends Baseclass {
	Login lg;
	//WebDriver driver;
	//Baseclass newbaseclass;
	
	//WebDriver driver=new ChromeDriver();
	
	
 	/*public  void chrome()  {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
 }*/
		
	/*@Test(description="Check login form",priority=0)
    public void Loginform () {
		lg = new Login();
		System.out.println("");
		//lg.checkloginpage();
		//Assert.assertTrue(driver.findElement(By.className("login-form")).isDisplayed());
		// System.out.println(driver.findElement(By.className("login-form")).isDisplayed()); 
		
	}*/
	
	@Test(description="check login",priority=1)
	public void logincheck()   {
		
     lg = new Login();
     
    // Thread.sleep(5000);
    
   // System.out.println("");
    lg.loginToApplication("cavisson", "@dmin",driver);
    String actualtitle="NetForest"; 
    String expectedtitle= driver.getTitle(); 
    System.out.println(expectedtitle);
    Assert.assertEquals(expectedtitle,actualtitle); 
    if(true)
    { 
    	  System.out.println("Test passed"); 
    	  } 
    else { 
    	System.out.println("Test failed");
    } 
    
    
	//lg.login("cavisson", "@dmin");
	
	}
	/*@Test(description="This TC will perform invalid login",priority=2)
	 public void loginToApplication1() {
		 lg = new Login();
		 lg.loginToApplication("cavisn", "@min",driver);
		 Assert.assertEquals("Invalid username or password","Invalid username or password");
		 if(true)
		 {
			 System.out.println("test case is pass");
		 }
			 else {
				 System.out.print("error");
			 }
				 
		 
	 }
	/*@Test(description="Check submit functionality",priority=2)
	public void Checksubmit() {
		lg.submit();
		//lg.checkloginpage(driver);
	}*/
	/*@BeforeSuite()
	public void openbrowser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    // driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS) ;
	     driver.manage().window().maximize();
		newbaseclass = new Baseclass();
		newbaseclass.chrome(driver);
		newbaseclass.openbrowser("http://10.10.30.124:8000/", driver);
	}*/
	
	
		
	
	/*@AfterSuite
	public void quitbrowser() {
		newbaseclass.closebrowser(driver);
		
	}*/
	
	/*@AfterTest
    public void sleep() throws InterruptedException {
    	newbaseclass.driversleep(driver);
    	System.out.println("after test method1");
    }*/
	
}
