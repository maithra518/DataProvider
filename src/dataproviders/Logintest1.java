package dataproviders;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logintest1 {
	public void LoginGmail()
	{
		try {
			Assert.assertEquals("sanju", "sanju1");
			System.out.println("gamail");
		} catch (Throwable t) {
			System.out.println(t);
		
		}System.out.println("exception handled");
		//Assert.assertEquals("sanju", "sanju1");
		//Assert.assertEquals(2, 4);
		//Assert.assertEquals(3, 3);
		Assert.assertTrue(2>4);
	}
	@Test(priority=2,dependsOnMethods= {"LoginGmail"})
	public void NavigateGmail()
	{
		System.out.println("yahoo");
		throw new SkipException("RegisterYahooMail functionality is not supported");
	}
	@Test(priority=1)
	public void SignOutGmail()
	{
		System.out.println("facebook");
	}

}
