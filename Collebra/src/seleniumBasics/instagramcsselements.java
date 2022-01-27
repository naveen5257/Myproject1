package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramcsselements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	Driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]")).sendKeys("r_naveen__kumar");
Driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("Naveen@#$123");
Driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
}
}
