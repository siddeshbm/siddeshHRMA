package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_14feb_AddRepTNG {
	
	@Test(priority=-1)
	public void testA(){
	   Reporter.log("Hi",true);	
	}
	
	@Test(priority=3,invocationCount=3)
	public void testB(){
		Reporter.log("Bye",true);
	}

}
