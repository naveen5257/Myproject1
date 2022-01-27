package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comparingthenamefield {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
String expectedText = "Please identify yourself";
 WebElement pleaseIdentifyText = driver.findElement(By.id("headerContainer"));
 String actualText = pleaseIdentifyText.getText();
 System.out.println(actualText);
 if(expectedText.equals(actualText)) {
	 System.out.println("Text is Displayed Properly");
 }
 else {
	 System.out.println("Text is Not Displayed Properly");
 }
}
}
