package qsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_2_TN {

	@DataProvider
	public String[][] getData(){
		
		String[][] a= new String[3][3];
		a[0][0]="UserA";
		a[0][1]="A123";
		a[0][2]="a@gmail";
		a[1][0]="UserB";
		a[1][1]="B123";
		a[1][2]="b@gmail";
		a[2][0]="UserC";
		a[2][1]="C123";
		a[2][2]="C@gmail";
		return a;	
	}
	
	@Test(dataProvider="getData")
	public void register(String un,String pw,String id){
		Reporter.log("Create "+un+" "+pw+" "+id,true);
	}
	
	
	
}
