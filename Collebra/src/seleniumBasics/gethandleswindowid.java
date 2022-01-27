package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class gethandleswindowid {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.skillrary.com/");
			String windowid= Driver.getWindowHandle();
			System.out.println(windowid);
	
}
}
