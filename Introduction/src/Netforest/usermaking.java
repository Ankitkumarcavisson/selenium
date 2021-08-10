package Netforest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Netforest.Baseclass;

public class usermaking {
	
	
	public void windowaccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
   public void signup(String uname,String email,String yourpassword,String samepassword,WebDriver driver) {
	   
	   driver.findElement(By.name("usernamesignup")).sendKeys(uname);
	   driver.findElement(By.name("emailsignup")).sendKeys(email);
	   driver.findElement(By.name("passwordsignup")).sendKeys(yourpassword);
	   driver.findElement(By.name("passwordsignup_confirm")).sendKeys(samepassword);
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   }
}
