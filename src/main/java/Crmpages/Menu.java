package Crmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.test_base;

public class Menu extends test_base {
 
	@FindBy (xpath="//span[contains(text(),'Home')]")
	 WebElement Menuhome;
	 
	 @FindBy(xpath="//span[contains(text(),'Calendar')]")
	 WebElement Calendar;
	 
	 @FindBy (xpath="//span[@class=\"item-text\" and contains(text(),'Contacts')]")
	 WebElement Contacts;
	 
	 @FindBy(xpath="//span[contains(text(),'Companies')]")
	 WebElement Companies ;
	 
	 @FindBy(xpath="//i[@class='home icon']")
	 WebElement Homeicon;
	 
	 public Menu() {
		 PageFactory.initElements(driver, this);
	 }
	 

	public void genericmovetoelement(WebElement ele){
		try {
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		ele.click();
		
	}
		catch(Exception e) {
			 e.printStackTrace();
		}
	}
	public void genericswitchtoframebyname(String framename) {
		try {
		driver.switchTo().frame(framename);
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
	}
	
	public static void genericswitchtoframebyindex(int frameindex) throws InterruptedException {
		try {
		Thread.sleep(5000);
		driver.switchTo().frame(frameindex);
		}
		catch(Exception e) {
		e.printStackTrace();
	}
		}
		
	public void actionmovetoelement() {
		
		genericmovetoelement(Homeicon);
		test_base.highLighterMethod(driver,Homeicon);
	}
	
	public static void genericelementdisplayed(WebElement ele) {
		try {
		ele.isDisplayed();
		System.out.println("The element is displayed.."+ele);
		
	}
		catch(Exception e){
		e.printStackTrace();
	}
	}
	
	public boolean verifyelementdispalyed() throws InterruptedException {
		test_base.highLighterMethod(driver,Homeicon);
		genericelementdisplayed(Homeicon);
		Thread.sleep(2000);
		Loginuser.Genericclick(Menuhome);
		return false;
	}
}
