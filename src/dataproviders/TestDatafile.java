package dataproviders;

import org.testng.annotations.Test;

public class TestDatafile {
	@Test(dataProviderClass=DataProvi.class,dataProvider="data")
	public void Registerdata(String firstname,
			String lastname,String email,String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
	}
	@Test(dataProviderClass=DataProvi.class,dataProvider="data")
	public void LoginData(String email,String password) {
		System.out.println(email);
		System.out.println(password);
	}
}
