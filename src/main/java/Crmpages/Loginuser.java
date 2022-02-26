package Crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.test_base;

public class Loginuser extends test_base{
	
 @FindBy (xpath="//a[contains(text(),'Login')]")
 WebElement Login;
 
 @FindBy(xpath="//input[@name='email']")
 WebElement Emaillogin;
 
 @FindBy(xpath="//input[@name=\"password\"]")
 WebElement Password;
 @FindBy(xpath="//div[contains(text(),'Login')][1]")
 WebElement Userlogin;
 
 public Loginuser() {
	 PageFactory.initElements(driver, this);
 }

 public void userverifylogin() throws InterruptedException {
		
	 test_base.highLighterMethod(driver,Login);
	 Genericclick(Login);
	 Thread.sleep(5000);
	 test_base.highLighterMethod(driver,Emaillogin);
	 Genericclick(Emaillogin);
	 Thread.sleep(5000);
	 test_base.highLighterMethod(driver,Emaillogin);
	 genericsendkeys(Emaillogin,"rupad131979@gmail.com");
	 Thread.sleep(5000);
	 test_base.highLighterMethod(driver,Password);
	 genericsendkeys(Password,"Test#1234");
	 Thread.sleep(5000);
	 test_base.highLighterMethod(driver,Userlogin);
	 Genericclick(Userlogin);
	 Thread.sleep(5000);
 }
 
 public void genericsendkeys(WebElement ele, String Value) {
	 try {
	 ele.sendKeys(Value);
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 
 }
 
 public static void Genericclick(WebElement ele) {
	 try {
	 ele.click();
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 
 }
}
