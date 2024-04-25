package hardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ha {
   
	@Test()
	void check() {
		System.out.println("hello");
		System.out.println("arivv");
		System.out.println("bhaiii");
		System.out.println("whats'up");
		
		
		
		Assert.assertEquals(1,2);
		System.out.println("failed");
		
		Assert.assertEquals(1,1);
		System.out.println("pass");
		
			}
	
}
