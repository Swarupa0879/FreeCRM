package test210;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Crmpages.Calander;
import Crmpages.Contact;
import Crmpages.Loginuser;
import Crmpages.Menu;
import Test_Base.test_base;

public class Calendar_T extends test_base {

	Loginuser login;
	Menu mu;
	Contact ct;
	Calander cd;

	public Calendar_T() {
		super();
	}

	@BeforeMethod
	public void initialization() {
		setup();
		login = new Loginuser();
		mu = new Menu();
		ct = new Contact();
		cd = new Calander();
	}

	@Test
	public void verifycalmove() throws InterruptedException {
	
		login.userverifylogin();
		String pagenavigated = driver.getTitle();
		System.out.println(pagenavigated);
		Assert.assertEquals("Cogmento CRM", pagenavigated);
		//mu.actionmovetoelement();
		Thread.sleep(3000);
		cd.calendernavigation();
		cd.MonthYselection("August","2022");
	}
}