package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonthetitleelement {
public static void main(String[] args) {
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver ();
		Driver.get("https://www.skillrary.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.linkText("SIGN UP")).click();//If we have the <a> tag in the link ,the name of the class should be same as in the web page othewise it wont exicute
}
}}
