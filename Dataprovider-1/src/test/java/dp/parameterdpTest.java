package dp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterdpTest {
	
	@Test(dataProvider ="myData1")
	public void testcase1(String uname,String pass) {
		
		System.out.println("test case1 should run for 4 set odf users");
		System.out.println(uname);
		System.out.println(pass);
		
	}
	
	@DataProvider(name ="myData1")
	 
	public Object[][]  mydataProvider1() {
		
		
		Object[][] obj = new Object[4][2];
		
		obj[0][0]="User1";
		obj[0][1]="pass1";
		obj[1][0]="User2";
		obj[1][1]="pass2";
		obj[2][0]="User3";
		obj[2][1]="pass3";
		obj[3][0]="User4";
		obj[3][1]="pass4";
		return obj;
		
	}

}
