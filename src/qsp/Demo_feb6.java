package qsp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Demo_feb6 {
  @Test
  public void m1() {
	  Reporter.log("m1()",true);
  }
  @BeforeMethod
  public void m2() {
	  Reporter.log("m2()",true);
  }

  @AfterMethod
  public void m3() {
	  Reporter.log("m3()",true);
  }

}
