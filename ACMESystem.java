package week2.day2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.DoubleClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMESystem
{

	public static void main(String[] args)
	{
		//set the chrome browser in the automation script
		WebDriverManager.chromedriver().setup();
		
		//A webDriver implementation that controls the chrome browser in the local machine
		ChromeDriver driver=new ChromeDriver();
	
		// to load gthe URL in chrome browser
		
		driver.get("https://acme-test.uipath.com/login");
		
		//to manage the browser windows
		driver.manage().window().maximize();
		
		
		WebElement sendEmail = driver.findElement(By.id("email"));
		
		sendEmail.sendKeys("kumar.testleaf@gmail.com");
		
		WebElement sendPassword = driver.findElement(By.id("password"));
		
		sendPassword.sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);

		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	
		
		
		


	}

}
