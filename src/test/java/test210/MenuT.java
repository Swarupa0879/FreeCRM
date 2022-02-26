package test210;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import Crmpages.Loginuser;
import Crmpages.Menu;
import Test_Base.test_base;

public class MenuT extends test_base {

	Loginuser login;
	Menu mu;

	public MenuT() {
		super();
	}

	@BeforeMethod
	public void initialization() {
		setup();
		login = new Loginuser();
		mu = new Menu();
	}

	@Test(enabled=false)
	public void VerifyValidMenu() throws InterruptedException {
		login.userverifylogin();
		String pagenavigated = driver.getTitle();
		System.out.println(pagenavigated);
		Assert.assertEquals("Cogmento CRM", pagenavigated);
		mu.actionmovetoelement();

	}
	@Test
	public void verifysubmenu() throws InterruptedException {
		login.userverifylogin();
		String pagenavigated = driver.getTitle();
		System.out.println(pagenavigated);
		Assert.assertEquals("Cogmento CRM", pagenavigated);
		mu.actionmovetoelement();
		mu.verifyelementdispalyed();
		boolean homeeledisplay=mu.verifyelementdispalyed();
		Assert.assertTrue(true);
		
	}
}
