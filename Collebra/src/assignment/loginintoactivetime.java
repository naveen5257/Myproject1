package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginintoactivetime {
public static void main(String[] args) throws Throwable {
	String username="admin";
	String password="manager";
	String expectedloginpagetitle="";
	String expectedhomepagetitle="";
	//step 1:launch the browser and enter the url
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://demo.actitime.com/login.do");
	System.out.println("browser is maximized successfully");
	//String actualloginpageTitle = driver.getTitle();
	//if(actualloginpageTitle.equals("actualloginpageTitle")) {
	//step 2:enter the username in username text field
	 WebElement usernametxt = driver.findElement(By.name("username"));
	 usernametxt.clear();
	 Thread.sleep(3000);
	 usernametxt.sendKeys(username);
	 String actualnameentered = usernametxt.getAttribute("value");
			 if(actualnameentered.equals(username)) {
		 System.out.println("username entered is successfully");
	 }
		 else {
		 
			 System.out.println("not entered successfully");
		 }
	
	 WebElement passwordtxt = driver.findElement(By.name("pwd"));
	 passwordtxt.clear();
	 Thread.sleep(3000);
	 passwordtxt.sendKeys(password);
	 String actualpasswordtxt = passwordtxt.getAttribute("value");
	 if(actualpasswordtxt.equals(password))
	 {
	 System.out.println("password entered succssfully");
	 }
	 else
	 {
		 System.out.println("the password not enteredsuccessfully");
	 }
	WebElement loginbutton = driver.findElement(By.id("loginButton"));
	Thread.sleep(3000);
	loginbutton.click();
	String actualloginpagetitle = driver.getTitle();
	if(expectedloginpagetitle.equals("expectedloginpagetitle"))
	{
		System.out.println("login successfully");
	}
	else
	{
		System.out.println("not login successfully");
	}}}
	
	 
		 
	 
	 
	 
	 
	
	
	
	

