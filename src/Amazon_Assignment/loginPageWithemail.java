package Amazon_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginPageWithemail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--disable-auto-update");
			
			System.setProperty("webdriver.chrome.driver", "/opt/homebrew/Caskroom/chromedriver/129.0.6668.70/chromedriver-mac-arm64/chromedriver");

			
			WebDriver driver = new ChromeDriver(options);
			 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in");
			
			driver.manage().window().maximize(); 						       		      	   			
			
			driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
			
//			driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("9981594440");
			driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("nitishksingh14@gmail.com");
			
			driver.findElement(By.xpath("//*[@class='a-button a-button-span12 a-button-primary']")).click();
			
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Nitish@14");
			
			
			driver.findElement(By.xpath("//*[@id='auth-signin-button']")).click();
			
			driver.findElement(By.xpath("//*[text()='Flights']")).click();

	}

}
