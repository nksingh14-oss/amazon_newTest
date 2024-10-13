package Selenium_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         ChromeOptions options = new ChromeOptions();
		
		 options.addArguments("--disable-auto-update");
		 
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/Caskroom/chromedriver/129.0.6668.70/chromedriver-mac-arm64/chromedriver");
		
//		System.setProperty("webdriver.chrome.driver", "get.etAbsolutePath()");

		 
		WebDriver driver = new ChromeDriver(options);
		
//		System.setProperty("webdriver.chrome.driver", "Users/nitish/eclipse-workspace/New_Test/chromedriver.exe");
		
//		driver.manage().timeouts().implicitlyWait(40,Time);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//*[@class='H6-NpN _3N4_BX']")).click();
		
//		driver.findElement(By.xpath("_1TOQfO"))
		
//		driver.findElement(By.xpath("//*[@class='r4vIwl BV+Dqf']")).sendKeys("9981594440");
		driver.findElement(By.xpath("//*[@class='r4vIwl BV+Dqf']")).sendKeys("nitishksingh14@gmail.com");
		
 		driver.findElement(By.xpath("//*[contains(text(),'Request OTP')]")).click();
		
		
		try {
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[text()='Cart']")).click();
			
			
			driver.findElement(By.xpath("//*[contains(text(),'HP')]//following::*[contains(text(),'Remove')][1]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().alert().dismiss();
		
	}

}
