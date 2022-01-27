package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class filpkarttitleurlpagesource {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	 ChromeDriver Driver=new ChromeDriver();
	 Driver.get("https://www.flipkart.com/");
	 System.out.println(Driver.getTitle());
	System.out.println( Driver.getPageSource());
}
}
