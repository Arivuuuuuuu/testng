package allNotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test(priority=2)
	void test1() {
		System.out.println("test1");
	}
	
	@BeforeClass()
	void beforeClass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass()
	void afterClass() {
		System.out.println("afterclass");
	}
	
	@BeforeMethod()
	void beforeMethod() {
		System.out.println("beforemethod");
	}
	
	@AfterMethod()
	void afterMethod() {
		System.out.println("aftermethod");
	}
	
	@Test(priority=1)
	void test2() {
		System.out.println("test2");
	}
	
	@BeforeTest()
	void beforeTest() {
		System.out.println("before test");
	}
	
	@AfterTest()
	void afterTest() {
		System.out.println("After test");
	}
	
	@BeforeSuite()
	void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite()
	void afterSuite() {
		System.out.println("after suite");
	}

}
