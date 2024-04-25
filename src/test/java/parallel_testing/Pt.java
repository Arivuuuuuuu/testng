package parallel_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pt {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String name) {
		
		if(name.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(name.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		else{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().window().maximize();

	}
	
	@Test(priority=1)
	void img(){
        
		try {
		boolean img=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		Assert.assertEquals(img, true);
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}
	@Test(priority=2)
	void title(){
		
		String a=driver.getTitle();
		Assert.assertEquals(a,"OrangeHRM","Titles are not matched");
	}
	
	@AfterClass
	void logout() {
		driver.quit();
	}

}
