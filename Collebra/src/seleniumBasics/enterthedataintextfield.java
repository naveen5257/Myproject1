package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class enterthedataintextfield {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SIGN UP")).click();
		driver.findElement(By.name("first_name")).sendKeys("Naveen Kumar");
		driver.findElement(By.name("last_name")).sendKeys("R");
		driver.findElement(By.name("email")).sendKeys("naveenr9535@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9535148221");
		driver.findElement(By.id("password")).sendKeys("Naveen@123");
		driver.findElement(By.name("password_confirmation")).sendKeys("Naveen@123");
		
	}
}
