package seleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class setthesize{
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
ChromeDriver Driver=new ChromeDriver();
Driver.get("https://www.skillrary.com/");
Dimension dimesion = Driver.manage().window().getSize();
int height=dimesion.getHeight();
int width=dimesion.getWidth();
Thread.sleep(3000);
Dimension dimesion1=new Dimension(1240,900
		);
Driver.manage().window().setSize(dimesion1);



}
}
