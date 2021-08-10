package Netforest;
//import java.util.concurrent.TimeUnit;
import Netforest.Baseclass;
import Netforest.Login;
import testcases.Logintestcase;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Homepage  {
	//WebDriver driver;
	
	
	public void timepicker(WebDriver driver) {
		driver.findElement(By.className("navbar-timepicker-time-desc")).click();
		driver.findElement(By.xpath("//*[text()='Last 5 years']")).click();
	}
   
    public void logout(WebDriver driver) {
    	//Locating element by link text and store in variable "Element"  
    	//JavascriptExecutor js = (JavascriptExecutor) driver;
       // WebElement Element = driver.findElement(By.className("global-nav-link__icon-image ng-scope"));

        // Scrolling down the page till the element is found		
       // js.executeScript("arguments[0].scrollIntoView();", Element);
    
    	driver.findElement(By.xpath("//*/div[9]/div/a/div[1]")).click();
    	
    	//driver.findElement(By.xpath("//*[text()='LogOut']")).click();
    }
}
