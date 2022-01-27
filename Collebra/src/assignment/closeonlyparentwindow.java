package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class closeonlyparentwindow {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.close();
}
}
