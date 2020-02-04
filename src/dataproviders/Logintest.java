package dataproviders;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logintest {
	@Test(priority=3)
	public void RegisterGmail()
	{
		try {
			Assert.assertEquals("sanju", "sanju1");
			System.out.println("gmail");
		} catch (Throwable t) {
			System.out.println(t);
		
		}System.out.println("exception handled");
		//Assert.assertEquals("sanju", "sanju1");
		//Assert.assertEquals(2, 4);
		//Assert.assertEquals(3, 3);
		Assert.assertTrue(2>4);
	}
	@Test(priority=2)
	public void RegisterYahooMail()
	{
		System.out.println("yahoo");
		throw new SkipException("RegisterYahooMail functionality is not supported");
	}
	@Test(priority=1)
	public void RegisterFacebook()
	{
		System.out.println("facebook");
	}

}
