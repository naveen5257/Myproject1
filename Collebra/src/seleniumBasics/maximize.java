package seleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
ChromeDriver Driver=new ChromeDriver();
Driver.get("https://www.skillrary.com/");
Driver.manage().window().maximize();
Dimension dimesion = Driver.manage().window().getSize();
int height=dimesion.getHeight();
int width=dimesion.getWidth();
System.out.println("Height:"+height +"and"+width);



}
}
