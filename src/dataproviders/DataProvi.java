package dataproviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvi {
	/*@Test(dataProvider="Registerdata")
	public void registeruser(String firstname,
			String lastname,String email,String password) {
		System.out.println("firstname");
		System.out.println("lastname");
		System.out.println("email");
		System.out.println("password");
	}*/
	@DataProvider(name="data")
	public static Object[][] data(Method m){
		Object[][] obj=null;
		
		if(m.getName().equals("Registerdata")) {
			obj=new Object[3][4];
		obj[0][0]="hari";
		obj[0][1]="la";
		obj[0][2]="lahari@gmail.com";
		obj[0][3]="234";
		
		obj[1][0]="nish";
		obj[1][1]="r";
		obj[1][2]="nish@gmail.com";
		obj[1][3]="567";
		
		obj[2][0]="maithra";
		obj[2][1]="st";
		obj[2][2]="maithra@gmail.com";
		obj[2][3]="143";
		
	}
	//@DataProvider(name="Logindata")
	//public static Object[][] logindata(){
	//Object[][] obj=new Object[3][2];
	if(m.getName().equals("LoginData")) {
		obj=new Object[3][2];

		obj[0][0]="hari@gmail.com";
		obj[0][1]="234";
		
		obj[1][0]="nish@gmail.com";
		obj[1][1]="234";
		
		obj[2][0]="maithra@gmail.com";
		obj[2][1]="234";
	}
		return obj;

}
}
