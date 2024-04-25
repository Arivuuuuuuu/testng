package grouping_DataProvider;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1,groups= {"sanity"})
	void loginbyfb() {
		System.out.println("login-fb");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void postinfb() {
		System.out.println("post-fb");
	}
	
	@Test(priority=3,groups= {"regression"})
	void logoutfb() {
		System.out.println("logout-fb");
	}
	
	@Test(priority=4,groups= {"regression"})

	void logininsta() {
		System.out.println("insta-login");
	}
	
	@Test(priority=6,groups= {"sanity","regression"})
	void postinsta() {
		System.out.println("insta-post");
	}
	
	@Test(priority=6,groups= {"sanity","regression"})
	void logoutinsta() {
		System.out.println("insta-logout");
	}
}
