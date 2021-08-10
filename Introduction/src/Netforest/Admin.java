package Netforest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Admin  {
	
 public void clickadmin(String username,String emailid,String password,String confirmpassword,WebDriver driver){
	 driver.findElement(By.xpath("//*[@id=\"globalId\"]/div[2]/div[1]/app-switcher/div[8]/div/a/div[1]/img")).click();
	 driver.findElement(By.xpath("(//*[@class='admin-link ng-binding'])[1]")).click();
	
	 driver.findElement(By.name("adduserr")).click();
	 driver.findElement(By.id("user_name")).sendKeys(username);
	 driver.findElement(By.xpath("//*[text()='adminuser']")).click();
	 driver.findElement(By.id("email")).sendKeys(emailid);
	 driver.findElement(By.id("password")).sendKeys(password);
	 driver.findElement(By.id("password_confirmation")).sendKeys(confirmpassword);
	 driver.findElement(By.xpath("//*[@id=\"NetForest-body\"]/div[2]/div/div/div/kbn-users-add/div/div/div/div/div[2]/div/input[1]")).click();
	 
	 //driver.findElement(By.className("form-control input-sm ng-pristine ng-scope ng-invalid ng-invalid-required ng-touched")).click();
//driver.findElements(By.className("form-control input-sm ng-pristine ng-scope ng-invalid ng-invalid-required ng-touched[contains(text(), 'adminuser')]")).

	
	 
	 
 }
}
