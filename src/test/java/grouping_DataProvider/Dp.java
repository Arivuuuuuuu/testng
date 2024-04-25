package grouping_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dp {
	
		
		WebDriver driver;
		
		@BeforeClass()
		void setup() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
			driver.manage().window().maximize();
		}
		
		@Test(dataProvider="abc")
		void check(String mail,String pwd) {
			
			driver.findElement(By.id("Email")).sendKeys(mail);
			driver.findElement(By.id("Password")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		}
		
		@AfterClass()
		void quit() {
			driver.quit();
		}
		
		@DataProvider(name="abc")
		String[][]loginData(){
			
			String data[][]= {{"jack@gmail.com","123456"},
			                 {"jj@gmail.com","123"},
			                 {"k@gmail.com","Arivu"}};
			return data;
			
		}
		

	}
