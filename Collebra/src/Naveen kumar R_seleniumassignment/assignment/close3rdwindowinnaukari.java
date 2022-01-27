package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class close3rdwindowinnaukari {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allwindowsID=driver.getWindowHandles();
	String Expectedtitle="ICICI";
	
	for(String WindowID:allwindowsID) {
		driver.switchTo().window(WindowID);
		String actualwindowtitle=driver.getTitle();
		if(Expectedtitle.equals(actualwindowtitle));

	}
	driver.close();
}
}