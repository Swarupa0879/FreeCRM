package Crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.test_base;

public class Calander extends test_base {

	@FindBy(xpath = "//div[@class='rbc-calendar']")
	WebElement Calander;

	@FindBy(xpath = "//span[@class='rbc-toolbar-label']")
	WebElement Month;
	@FindBy(xpath = "//i[@class='chevron right icon']")
	WebElement CalMovearrow;
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement CalanderI;

//Initializing the page elements
	public Calander() {
		PageFactory.initElements(driver, this);
	}

	public void calendernavigation() throws InterruptedException {
		Thread.sleep(3000);
		Loginuser.Genericclick(CalanderI);
		Thread.sleep(1000);

	}
//Generic method to handle calander
	public void MonthYselection(String smont, String syear) throws InterruptedException {
		Thread.sleep(1000);
		test_base.highLighterMethod(driver, Month);
		String monthS = Month.getText();
		System.out.println(monthS);
		while (!(selymd(monthS)[0].equals(smont) && selymd(monthS)[1].equals(syear))) {
			System.out.println("Clicking to next month");
			Thread.sleep(3000);
			CalMovearrow.click();
			Thread.sleep(1000);
			monthS = Month.getText();
		}
		System.out.println("Reached target month");
	}

	public static String[] selymd(String monthS) {
		return monthS.split(" ");
	}
}