package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementusingname {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("login")).click();
}
}
