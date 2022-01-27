package seleniumBasics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class setpostion {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.zomato.com/");
	Driver.manage().window().setPosition(new Point(150,120));
}
}
