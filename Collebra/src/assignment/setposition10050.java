package assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition10050 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.flipkart.com/");
	Driver.manage().window().maximize();
	/* Driver.manage().window().setPosition(new Point(100,50)); */
	Point point =new Point(100,50);
	Driver.manage().window().setPosition(point);
	
}
}
