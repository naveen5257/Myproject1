package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
ChromeDriver Driver =new ChromeDriver();
Driver.get("https://www.zomato.com/bangalore");
System.out.println(Driver.getTitle());
	}
}
