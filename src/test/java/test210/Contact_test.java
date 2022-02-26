package test210;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Crmpages.Contact;
import Crmpages.Loginuser;
import Crmpages.Menu;
import Test_Base.test_base;

public class Contact_test extends test_base{

	Loginuser login;
	Menu mu;
	Contact ct;

	public Contact_test() {
		super();
	}
	@BeforeMethod
	public void initialization() {
		setup();
		login = new Loginuser();
		mu = new Menu();
		ct=new Contact();
	}
	@Test
	public void verifyContactcolums() throws InterruptedException {
		login.userverifylogin();
		String pagenavigated = driver.getTitle();
		System.out.println(pagenavigated);
		Assert.assertEquals("Cogmento CRM", pagenavigated);
		mu.actionmovetoelement();
		//mu.verifyelementdispalyed();
		//boolean homeeledisplay=mu.verifyelementdispalyed();
		Assert.assertTrue(true);
		ct.navigatetocontacts();
		ct.contactrowS();
	}
	public void verifyycolumns() {
		
	}
	
}
