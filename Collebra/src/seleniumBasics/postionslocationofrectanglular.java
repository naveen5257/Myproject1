
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class postionslocationofrectanglular {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement utf = driver.findElement(By.id("email"));
}
}
