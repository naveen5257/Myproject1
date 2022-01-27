package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class softify {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.navigate().to("https://www.spotify.com/");
	Driver.findElement(By.xpath("//a[text()=\"Premium\"]")).click();
	Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/header/div/nav/ul/li[2]/a")).click();
	
}
}
