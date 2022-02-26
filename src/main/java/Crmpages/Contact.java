package Crmpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.test_base;

public class Contact extends test_base {
	@FindBy(xpath = "//span[@class=\"item-text\" and contains(text(),'Contacts')]")
	WebElement Contacts;

	@FindBy(xpath = "//div[@class='ui loader']")
	WebElement Contactpage;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/thead/tr")
	WebElement ContactTable;

	public Contact() {
		PageFactory.initElements(driver, this);

	}

	public void genericcolumnsintable(WebElement ele) {
		List<WebElement> c = ele.findElements(By.xpath("./child::*"));
		System.out.println("The number of childs on contacts page are..." + c.size());
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i).getText());
		}

	}

	public void contactrowS() throws InterruptedException {
		Thread.sleep(1000);
		genericcolumnsintable(ContactTable);
	}

	public void navigatetocontacts() throws InterruptedException {
		try {
			Thread.sleep(1000);
			test_base.highLighterMethod(driver, Contacts);
			Loginuser.Genericclick(Contacts);
			Thread.sleep(1000);
			test_base.highLighterMethod(driver, Contactpage);
			Menu.genericelementdisplayed(Contactpage);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
