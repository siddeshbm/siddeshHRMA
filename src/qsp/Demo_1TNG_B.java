package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_1TNG_B {

	@Test(priority=1)
	public void testA(){
	   Reporter.log("Hii",true);	
	}
	
	@Test/*(invocationCount=3)*/
	public void testB(){
		Reporter.log("Byee",true);
	}
}
