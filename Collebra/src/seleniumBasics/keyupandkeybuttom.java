package seleniumBasics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyupandkeybuttom {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.myntra.com/");
	Thread.sleep(3000);
	 List<WebElement> Mennav = driver.findElements(By.xpath("//a[@data-type=\"navElements\"]"));
	
	 for( WebElement newtab:Mennav) {

			Actions action=new Actions(driver);
	action.keyDown(Keys.CONTROL).click(newtab).perform();
	action.keyUp(Keys.CONTROL).click();
	action.release();
			//String expectedtitle = "Home & Living";
			//driver.switchTo().window(expectedtitle);
			//Set<String> actualtitle = driver.getWindowHandles();
			//if(expectedtitle.equals(actualtitle)){
				//driver.close();
			}
	 String expectedwindow = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";
	 Set<String> allwindowID = driver.getWindowHandles();
	 for(String window:allwindowID) {
		 driver.switchTo().window(window);
		String actualTitle= driver.getTitle();
		 //String expectedTitle = "Home & Living";
		 if(expectedwindow.equals(actualTitle)){
			 driver.close();
		 }
		//System.out.println(window); 
	 }
			
			 
}
}
