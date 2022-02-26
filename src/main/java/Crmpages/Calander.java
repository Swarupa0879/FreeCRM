package Crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.test_base;

public class Calander extends test_base{

	@FindBy(xpath="//div[@class='rbc-calendar']")
	WebElement Calander;
	
	@FindBy(xpath="//span[contains(text(),'February 2022')]")
	WebElement Month;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]/i")
	WebElement CalMovearrow;
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement CalanderI;



public Calander() {
	PageFactory.initElements(driver,this);
}

public void calendernavigation() throws InterruptedException {
	Thread.sleep(3000);
	Loginuser.Genericclick(CalanderI);
	Thread.sleep(1000);
	//Menu.genericswitchtoframebyindex(0);
	//Loginuser.Genericclick(CalMovearrow);
	
}
/*
 * public void MonthYselection(String smont,String syear) throws
 * InterruptedException { Thread.sleep(1000);
 * test_base.highLighterMethod(driver,Month); String monthS=Month.getText();
 * //String dM=monthS.split(" ")[0].trim(); //String MonS=dM[0].trim(); //String
 * dY=monthS.split(" ")[1].trim();
 * while(!(selymd.monthS[0].equals(smont)&&selymd.monthS[1].equals(syear)));{
 * Thread.sleep(1000);; CalMovearrow.click(); }
 */
	
//}

public String[] selymd(String monthS) {
	return monthS.split(" ");
}
}