package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enumcopyandpaste {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver ();
	driver.get("https://www.instagram.com/?hl=en");
	Thread.sleep(2000);
	 WebElement username = driver.findElement(By.name("username"));
	 username.clear();
	 Thread.sleep(2000);
	 username.sendKeys("naveen",Keys.CONTROL+"a");
	 username.sendKeys(Keys.CONTROL+"c");
	  WebElement passowrd = driver.findElement(By.name("password"));
	  passowrd.clear();
	  Thread.sleep(2000);
	 passowrd.sendKeys(Keys.CONTROL+"v");
	
	
}
}
