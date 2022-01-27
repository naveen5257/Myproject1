package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillrarytest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://activetime.co.uk/#");
		
		/* //Driver.get("https://www.skillrary.com/");
		Driver.findElement(By.xpath("//*[@id=\"front-header\"]/div[3]/header/div/div/div[3]/ul/li[9]/a")).click();
		Thread.sleep(1000);
		Driver.findElement(By.name("first_name")).sendKeys("naveen kumar");
		Thread.sleep(1000);
		Driver.findElement(By.name("last_name")).sendKeys("R");
		Thread.sleep(1000);
		Driver.findElement(By.name("email")).sendKeys("naveenr9535mail.com");
		Thread.sleep(1000);
		Driver.findElement(By.id("phone")).sendKeys("9535148221");
		Thread.sleep(1000);
		Driver.findElement(By.id("password")).sendKeys("abc@123");
		Thread.sleep(1000);
		Driver.findElement(By.name("password_confirmation")).sendKeys("abc@123");
		Thread.sleep(1000);
		Driver.findElement(By.name("captcha_type")).click();
		Driver.findElement(By.className("btn btn-color animated fadeInUp")).click();*/
		Driver.findElement(By.linkText("Activities")).click();
		Driver.findElement(By.className("button button_theme button_js action_button "));Driver.quit();
		
		
	
	}
}
