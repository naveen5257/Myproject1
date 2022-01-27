package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchingbrowser {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Naveen\\Downloads\\geckodriver-v0.29.1-win64//geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
	}
}
