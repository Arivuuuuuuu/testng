package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class List {
    
	@Test(priority=1)
	void m() {
		Assert.assertEquals(1,1);
	}
	
	@Test(priority=2)
	void m1() {
		Assert.assertEquals(1,2);
	}
	
	@Test(priority=3,dependsOnMethods= {"m1"})
	void m3() {
		Assert.assertEquals(1,1);
	}
}
