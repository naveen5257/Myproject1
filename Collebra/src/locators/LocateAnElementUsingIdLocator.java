package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingIdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("devarajpshirur@gmail.com");
		driver.findElement(By.name("password")).sendKeys("devaraj12345");
		driver.findElement(By.id("recaptcha-anchor")).click();
		driver.findElement(By.id("login_btn")).click();
	}

}
