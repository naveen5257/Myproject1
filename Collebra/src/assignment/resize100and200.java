package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize100and200 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.flipkart.com/");
	Driver.manage().window().maximize();
	 /*Dimension dimesion =new Dimension(100,200);
	Driver.manage().window().setSize(dimesion); */
	Driver.manage().window().setSize(new Dimension(100,200));//Height,lengthN
	
}
}
