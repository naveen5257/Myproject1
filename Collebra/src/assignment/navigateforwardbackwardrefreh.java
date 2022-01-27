package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigateforwardbackwardrefreh {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.flipkart.com/");
	Driver.manage().window().maximize();
	Thread.sleep(2000);
	Driver.navigate().forward();
	Thread.sleep(2000);
	Driver.navigate().back();
	Thread.sleep(2000);
	Driver.navigate().refresh();
}
}
