package week2.day2.assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("input-username")).sendKeys("Test Selenium");
		
		driver.findElement(By.id("input-firstname")).sendKeys("opencart");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Java");
		
		driver.findElement(By.id("input-email")).sendKeys("aravind@testleaf.com");
		
		WebElement dropDownCountry = driver.findElement(By.id("input-country"));
		
		Select country=new Select(dropDownCountry);
		
		
		country.selectByVisibleText("India");
		
		driver.findElement(By.id("input-password")).sendKeys("aravind@123");
		
		
		driver.close();
	}
	
}
		
