package Test_Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class test_base {
	
	public static WebDriver driver;
	
	public static void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
	}
	public static void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid yellow;');", element);
		}
	
	}
		


