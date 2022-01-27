package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 WebElement forgettingthetitle = driver.findElement(By.name("username"));
	  forgettingthetitle.sendKeys("admin");
	  Thread.sleep(3000);
	String actualtitle = forgettingthetitle.getAttribute("value");
	if(actualtitle.equals("admin")) {
		System.out.println("successful");
	}
	else {
		System.out.println("not successful");
		
		
	}
	WebElement password1 = driver.findElement(By.name("pwd"));
	password1.sendKeys("manager");
	Thread.sleep(3000);
	String actualpass = password1.getAttribute("value");
	if(actualpass.equals("manager"))
	{
		System.out.println("password successful");
	}
	else
	{
	
		System.out.println("not successful");
	}
	WebElement loginbutton = driver.findElement(By.id("loginButtonContainer"));
	Thread.sleep(3000);
	loginbutton.click();
	System.out.println("login successfully");	
}}
