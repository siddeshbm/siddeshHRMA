package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_2b {
	
	@BeforeSuite
	public void m1(){
		Reporter.log("Idly",true);
	}
	
	@AfterSuite
	public void m2(){
		Reporter.log("Vada",true);
	}
	
	@BeforeTest
	public void m3(){
		Reporter.log("Dosa",true);
	}
	
	@AfterTest
	public void m4(){
		Reporter.log("Poori",true);
	}
	
	@BeforeClass
	public void m5(){
		Reporter.log("Pongal",true);
	}
	
	@AfterClass
	public void m6(){
		Reporter.log("BisiBelBath",true);
	}
	
	@BeforeMethod
	public void m7(){
		Reporter.log("Roti",true);
	}
	
	@AfterMethod
	public void m8(){
		Reporter.log("Water",true);
	}
	
	@Test
	public void m9(){
		Reporter.log("Jamoon",true);
	}
	
	@Test
	public void m10(){
		Reporter.log("IceCream",true);
	}
}
