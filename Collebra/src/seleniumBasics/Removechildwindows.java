package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Removechildwindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver Driver =new ChromeDriver();
		Driver.navigate().to("https://www.naukri.com/");
		String parentwindowid = Driver.getWindowHandle();
		Set<String> allwindowsID=Driver.getWindowHandles();
		allwindowsID.remove(parentwindowid);
		
		for(String window : allwindowsID) 
		{
			Driver.switchTo().window(window);
			Driver.close();
		}
		
		
			}
		
		

	}

