package Amazon_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class login_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sqe3j23222222222222222222222222222222222222222222222222222222222222222222222222222222222
		 ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-auto-update");
		
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/Caskroom/chromedriver/129.0.6668.70/chromedriver-mac-arm64/chromedriver");

		
		WebDriver driver = new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();        						       		      	   			
		
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
		
//		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("9981594440");
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("nitishksingh14@gnmail.com");
		
		

		
		driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		
		driver.findElement(By.xpath("//*[@id='cvf-input-code']")).click();
		
		
		try {
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id='cvf-submit-otp-button']")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		/*[@id='cvf-submit-otp-button']
		
		
//		driver.findElement(By.xpath("//*[@id='cvf-submit-otp-button']")).click();
		WebElement firstResult = new WebDriverWait(driver,10)
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Continue')]")));
		
		firstResult.click(); 
		
//		driver.findElement(By.xpath("//*[@id='cvf-submit-otp-button']")).click();
		System.out.println("///value of success");
//		driver.findElement(By.xpath("//*[@id='cvf-submit-otp-button-announce']")).click();
//		//*[@id='cvf-submit-otp-button-announce']

	}

}
