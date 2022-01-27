package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SetWindowSize;

public class closechildwindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentwindowID=driver.getWindowHandle();
		Set<String> allwindowsID=driver.getWindowHandles();
		allwindowsID.remove(parentwindowID);
		for(String naveen :allwindowsID) {
			driver.switchTo().window(naveen);
			System.out.println(naveen);
			Thread.sleep(1000);
			driver.close();
		}
		
	}
}
