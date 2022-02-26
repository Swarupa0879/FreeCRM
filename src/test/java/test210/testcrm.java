package test210;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Crmpages.Loginuser;
import Test_Base.test_base;

public class testcrm extends test_base {
	Loginuser login;
	public testcrm() {
		super();
	}
		@BeforeMethod
		public void initialization() {
		setup();
		login=new Loginuser();
		}
		@Test
		public void VerifyValidLogin() throws InterruptedException {
		login.userverifylogin();
		String pagenavigated=driver.getTitle();
		System.out.println(pagenavigated);
		Assert.assertEquals("Cogmento CRM",pagenavigated);

		}

}
