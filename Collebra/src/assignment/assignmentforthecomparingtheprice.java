package assignment;
import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class assignmentforthecomparingtheprice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver ();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com/");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("6360109536");
	driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Naveenrls@123");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	//driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone 12",Keys.ENTER);
	//String parentwindowID = driver.getWindowHandle();
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	driver.findElement(By.id("pincodeInputId")).sendKeys("560064");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	=driver.getWindowHandle()
	
}
}

