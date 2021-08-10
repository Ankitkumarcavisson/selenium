package Netforest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;


public class Baseclass {
	protected WebDriver driver;
	
	
	@BeforeSuite
     	//public  void setupapplication(WebDriver driver)  {
	public void setupapplication() {
		driver=new ChromeDriver();
		 Reporter.log("=====Browser Session Started=====", true);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     //driver=new ChromeDriver();
	    
	     driver.manage().window().maximize();
	     driver.get("http://10.10.30.124:8000/");
	     driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS) ;
	     Reporter.log("=====Application Started=====", true);
	    // System.out.println(driver.getCurrentUrl());
     }
     
    /* public void openbrowser(String url,WebDriver driver) {
     driver.get(url);
     
	    System.out.println(driver.getCurrentUrl());
	    
     }*/
	   
    
     
    /* public void closebrowser(WebDriver driver) {
    	 driver.quit();
     }*/
    // public void driversleep(WebDriver driver) throws InterruptedException {
    	// Thread.sleep(5000);
     //}
	
	/*@AfterSuite
	public void closeApplication()
	{
	  driver.quit();
	  Reporter.log("=====Browser Session End=====", true);
	}*/
	}
		


