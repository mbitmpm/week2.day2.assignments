package week2.day2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) 
	{
		
//		  //Pseudo Code
//		  
//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
//		  2. Enter UserName and Password Using Id Locator
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");

//		  
//		  3. Click on Login Button using Class Locator
		  
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
//		  4. Click on CRM/SFA Link
		  driver.findElement(By.linkText("CRM/SFA")).click();
//		  5. Click on Accounts Button
		  driver.findElement(By.linkText("Accounts")).click();
//		  6. Click on Create Account
		  driver.findElement(By.linkText("Create Account")).click();
//		  7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		  driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
//		  8. Enter DEscriptiion as "Selenium Automation Tester"
		  driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester for frbit limited");
//		  9. Enter LocalName Field Using Xpath Locator
		  driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("LOcal name");
//		  10. Enter SiteName Field Using Xpath Locator
		  driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("testleaf Automation");
//		  11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		  driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("3400000");
//		  
//		  14. Click on Create Account using Xpath Locator
//                  15.Close the browser
        
		  driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		  driver.close();
      
        
      
		 

	}

}
