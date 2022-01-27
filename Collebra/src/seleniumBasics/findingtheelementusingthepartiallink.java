package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingtheelementusingthepartiallink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.skillrary.com/");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("\"https://www.skillrary.com/./uploads/banner/1611143496")).click();
}

}
