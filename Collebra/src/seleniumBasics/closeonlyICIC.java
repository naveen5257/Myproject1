package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class closeonlyICIC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver =new ChromeDriver();
	Driver.navigate().to("https://www.naukri.com/");
	Set<String> allwindowsID=Driver.getWindowHandles();
	String Expectedwindowtitle="ICICI";
	for(String windowID:allwindowsID) {
		Driver.switchTo().window(windowID);
		String actualwindowtitle=Driver.getTitle();
		if(Expectedwindowtitle.equals(actualwindowtitle)) {
			Driver.manage().window().maximize();
			Driver.close();
		}
	}
	
}
}
