package seleniumBasics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class settheposition {
public static void main(String[] args) {
	int chromedriver_win32;
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.zomato.com/");
	Point point = Driver.manage().window().getPosition();
	System.out.println(point.getX());
	System.out.println(point.getY());
	
}
}
