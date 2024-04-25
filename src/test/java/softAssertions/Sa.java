package softAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sa {
   
	@Test(invocationCount=10)
	void check() {
		System.out.println("hello");
		System.out.println("h");
		System.out.println("he");
		System.out.println("hel");
		
		SoftAssert sa=new SoftAssert();
		
//		sa.assertEquals(1,1);
//		System.out.println("passed");
		
		sa.assertEquals(1, 2);
		System.out.println("failed");
		
		sa.assertAll();
		
//		sa.assertEquals(1,1);
//		System.out.println("passed");
	}
	
}
