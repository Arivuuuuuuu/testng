package report;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Report {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void logo() {
		
		try {
		boolean status=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	void login() {
		try {
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jackie@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("1234567");
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(3000);
		
		boolean check=driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
		
		Assert.assertEquals(check, true);
		
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
		@Test(priority=3,dependsOnMethods= {"login"})
		void logout() {
			
			try {
				driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();			
			}
			catch(Exception e) {
				Assert.fail();
		}
		
	}
		@AfterClass
		void quit() {
			driver.quit();
		}

}
