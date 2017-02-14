package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_feb14_gitPull {

	@Test(priority=-1)
	public void testA(){
	   Reporter.log("Hi",true);	
	}
	
	@Test(priority=-2,invocationCount=3)
	public void testB(){
		Reporter.log("Bye",true);
	}
}
