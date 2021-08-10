package Netforest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;


public class Login {
	//WebDriver driver=new ChromeDriver();
	
	/*public void checkloginpage(WebDriver driver) {
		boolean eleSelected= driver.findElement(By.className("login-form")).isDisplayed();
		System.out.println("Login Page is displayed");
		
	}*/
	
	
	 
     public void loginToApplication(String username,String passwd,WebDriver driver) {
    	 System.out.println("Enter Login method");
    	
    	 //WebDriver driver=new ChromeDriver();
	    driver.findElement(By.id("loginId")).sendKeys(username);
	   driver.findElement(By.id("passwdId")).sendKeys(passwd);
	   System.out.println("check kr rhe h");
	   driver.findElement(By.name("submit")).click();
     }
     
   /*  public void submit() {
    	 
	    driver.findElement(By.name("submit")).click();
		//driver.findElement(null)
		}*/



	/*public void checkloginpage() {
		boolean eleSelected= driver.findElement(By.className("login-form")).isDisplayed();
		
		
		
	}*/
}
