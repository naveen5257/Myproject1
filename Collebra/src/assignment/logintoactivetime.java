package assignment;

import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//test data
 /*String username="admin";
 String password="manager";
 string expectedloginpagetitle ="";*/
//step 1: open the browser and enter the url
public class logintoactivetime {
public static void main(String[] args, Object usernametextfield) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	System.out.println("browser is maximized successfully");
	//step 2:enter the username in username text field
	//driver.findElement(By.name("username")).sendKeys("admin");
	//driver.findElement(By.name("pwd")).sendKeys("manager");
	//driver.findElement(By.id("loginButton")).click();
	 usernametextfield = driver.findElement(By.name("username")).sendKeys("admin");
	
	
	
}
}
