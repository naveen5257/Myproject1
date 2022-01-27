package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class findtheelementusingtheclassname {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.skillrary.com/");
	//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
	driver.manage().window().maximize();
	driver.findElement(By.className("dropdown")).click();
}
}
