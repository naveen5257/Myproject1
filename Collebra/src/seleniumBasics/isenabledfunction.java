package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabledfunction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.instagram.com/");
	WebElement usernametext = driver.findElement(By.name("username"));
	WebElement passwordtext = driver.findElement(By.name("password"));
	WebElement loginbutton = driver.findElement(By.xpath("//button[.='Log In']"));
	System.out.println(loginbutton.isEnabled());
	usernametext.sendKeys("naveem=n");
	passwordtext.sendKeys("123");
	System.out.println(loginbutton.isEnabled());
}
}
