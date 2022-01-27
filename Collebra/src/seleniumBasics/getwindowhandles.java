package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.navigate().to("https://www.naukri.com/");
	Set<String> allwindowsID=Driver.getWindowHandles();
	for(String t : allwindowsID)
	{
		System.out.println(t);
	}
}}

