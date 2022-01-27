package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationelements {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.naukri.com/");
		Set<String> allwindowids=Driver.getWindowHandles();
		String parentwindowid = Driver.getWindowHandle();
		allwindowids.remove(parentwindowid);
		for(String window :allwindowids)
		{
			Driver.switchTo().window(window);
			Driver.close();
			
		}
		Driver.navigate().to(parentwindowid);
		Driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("devaraj@gmail.com");
		Driver.findElement(By.xpath())
	}}
