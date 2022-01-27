package assignment;

import org.omg.CORBA.Current;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentwindowidoffacebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String currentID=driver.getWindowHandle();
	//System.out.println(driver.getWindowHandle());
	System.out.println(currentID);
	
}
}
