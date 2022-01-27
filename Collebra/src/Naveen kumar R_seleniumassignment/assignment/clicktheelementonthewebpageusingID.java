package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class clicktheelementonthewebpageusingID {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver ();
	driver.get("https://www.cricbuzz.com/");
	driver.manage().window().maximize();
driver.findElement(By.id("cb-plus-user-icon")).click();
	
	
}
}
