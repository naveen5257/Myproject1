package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbypractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.skillrary.com/");
driver.manage().window().maximize();
System.out.println("the browser maximized successfully");
 JavascriptExecutor js = (JavascriptExecutor) driver;
 Thread.sleep(3000);
 js.executeScript("window.scrollBy(0,2000);");
 Thread.sleep(3000);
 js.executeScript("window.scrollBy(0,-1000);");
 WebElement topcoinsidance = driver.findElement(By.xpath("//a[@class=\"btn\"]"));
 js.executeScript("arguments[0].scrollIntoView(true);",topcoinsidance);

	}

}
