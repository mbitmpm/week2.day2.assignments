package week2.day2.assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondwithButtons {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("home")).click();
		
		String title=driver.getTitle();
		
		String pageTitle="Click button to travel home page";
		
		if(pageTitle.equals(title))
		{
			System.out.println("Home Page is Verified");
		}
		else
		{
			System.out.println("Home page is not verified");
		}

		driver.close();

	}

}
