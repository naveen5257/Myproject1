package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class toscrollhorizantally {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.naukri.com/");
	//driver.get("https://www.album.alexflueras.ro/galleries/urban.html");
	
	driver.manage().window().maximize();
	WebElement elementscroll = driver.findElement(By.linkText("View all companies"));
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1000)");
	js.executeScript("window.scrollTo(500,1000)");
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(false);",elementscroll);
	
	
	
}
}
