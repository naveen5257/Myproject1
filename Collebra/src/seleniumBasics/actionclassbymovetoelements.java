package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassbymovetoelements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
 WebElement MoveToElement = driver.findElement(By.linkText("BEAUTY"));
 Actions action=new Actions(driver);
 action.moveToElement(MoveToElement).perform();
 Thread.sleep(3000);
 driver.findElement(By.linkText("Hair Serum")).click();
 
 
 
	
	
}
}
