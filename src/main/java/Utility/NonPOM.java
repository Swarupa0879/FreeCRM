package Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NonPOM {
	static WebDriver driver;
	public void Columnsinwebtable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(null)
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rupad131979@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test#1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//i[@class='home icon']"));
		ac.moveToElement(ele).build().perform();
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[ contains(text(),'Contacts')]")).click();		
		List<WebElement>contactCol=driver.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/thead/tr/th"));
		System.out.println("The number of columns on contacts page are..."+contactCol.size());
		for(int i=0;i<contactCol.size();i++) {
			System.out.println(contactCol.get(i).getText());
		}
		
	}
	
	public void homeact() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//i[@class='home icon']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\\\"item-text\\\" and contains(text(),'Contacts')]")).click();
		//WebElement contactmenuitemsC=driver.findElement(By.xpath("//*[@id=\\\"main-content\\\"]/div/div[2]/div/table/thead/tr/th"));
		List<WebElement>contactCol=driver.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/thead/tr/th"));
		//List<WebElement>contactCol=driver.findElements(By.xpath(contactmenuitemsC));
		System.out.println("The number of columns on contacts page are..."+contactCol.size());
		for(int i=0;i<contactCol.size();i++) {
			System.out.println(contactCol.get(i).getText());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		NonPOM nm=new NonPOM();
		//nm.Columnsinwebtable();
		//nm.acomp();
		//nm.homeact();
		// TODO Auto-generated method stub
		selectdesireddate("13","August","2022");

	}
	
	//Converting array list to string
	
	public void acomp() {
		ArrayList<String>studentname=new ArrayList<String>();
		studentname.add("Swarupa");
		studentname.add("Rohit");
		System.out.println(studentname);
		StringBuffer sb = new StringBuffer();
	      
	      for (String s : studentname) {
	         sb.append(s);
	         sb.append(" ");
	      }
	      String str = sb.toString();{
	      System.out.println(str);
	   }


		ArrayList<String>studentexpec=new ArrayList<String>();
		studentexpec.add("Swaru");
		studentexpec.add("Rohit");
		System.out.println(studentexpec);
		StringBuffer sg = new StringBuffer();
	      
	      for (String s : studentexpec) {
	         sg.append(s);
	         sg.append(" ");
	      }
	      String st = sg.toString();{
	      System.out.println(st);
	      System.out.println(str.equalsIgnoreCase(st));
	   }
	      
	}
	public static void selectdesireddate(String exDay ,String smont,String syear) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(null)
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rupad131979@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test#1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//i[@class='home icon']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		Thread.sleep(1000);
		String monthS=driver.findElement(By.xpath("//span[contains(text(),'February 2022')]")).getText();
		//String[] spl= selymd(monthS);
		while(!(selymd(monthS)[0].equals(smont)&& selymd(monthS)[1].equals(syear))){
			//System.out.println(monthS);
			//System.out.println(monthS[1]);
				Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='chevron right icon']")).click();
			System.out.println(monthS);
			
		}
		driver.findElement(By.xpath("//a[text='"+exDay+"')]")).click();
	}
	public static String[] selymd(String monthS) {
		return monthS.split(" ");
	}
	}
	
	


