package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrectinfacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Rectangle rectangle = driver.findElement(By.id("email")).getRect();
		//int xvalue = rectangle.x;
		//int yvalue = rectangle.y;
		System.out.println(rectangle.x);
		System.out.println(rectangle.y);
		 Rectangle passwordtextfield = driver.findElement(By.id("pass")).getRect();
		System.out.println(passwordtextfield.x);
		System.out.println(passwordtextfield.y);
		
		
		
		
		
}
}