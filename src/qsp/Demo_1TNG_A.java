package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_1TNG_A {

	@Test(priority=-1)
	public void testA(){
	   Reporter.log("Hi",true);	
	}
	
	@Test(priority=-2,invocationCount=3)
	public void testB(){
		Reporter.log("Bye",true);
	}
}
