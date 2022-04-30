package week2.day2.assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) 
	{
		
//		  //Pseudo Code
//		  
//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		   WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
//
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
//	  2. Enter UserName and Password Using Id Locator
	  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
			
//		  4. Click on CRM/SFA Link
	  driver.findElement(By.linkText("CRM/SFA")).click();
//	  5. Click on Accounts Button
	  driver.findElement(By.linkText("Accounts")).click();
//	  6. Click on  Find Accounts Button
	  driver.findElement(By.linkText("Create Account")).click();
//		  

//		  
//		  7. Enter AccountName as "Credit Limited Account" 
	  
	  driver.findElement(By.id("accountName")).sendKeys("Testleaf RAM");
	  
//		  8. Click on Find Accounts using xpath Locator
	  driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
//		  9. Click on the edit Button
	  driver.findElement(By.linkText("Edit")).click();
//		  10. Get the Text of Account Name and verify 
		   
	  String strAccountName = driver.findElement(By.id("accountName")).getText();
	  System.out.println("Account Name: " +strAccountName);
//		  11. Get the Text of Description
		  String strDescription = driver.findElement(By.name("description")).getText();
//		  12. Get the title of the page and verify it.
		  
		  System.out.println("Description : " +strDescription);
		 
		  String strTitle = driver.getTitle();
		  
		  System.out.println("Title :"+ strTitle);

	}

}
